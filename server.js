const { BehaviorSubject } = require("rxjs");
const express = require("express");
const app = express();
const router = require("./router");
const { createServer } = require("http");

const { spawn } = require("child_process");
const { resolve } = require("path");

app.set("devMode", process.env.NODE_ENV === "development");
app.use(express.static(resolve("public")));
app.use(express.json());
app.use(router);

let javaProcess;
let javaLogs$ = new BehaviorSubject("");
launchJavaProcess();

const server = createServer(app).listen(3000);
require("./socket-io")(server, javaLogs$, javaProcess);

// FUNCTIONS
function launchJavaProcess() {
  if (javaProcess) javaProcess.kill();

  if (!process.env.JAVA_HOME) {
    console.log("Renseigner JAVA_HOME dans le PATH");
  }

  const javaExe = resolve(process.env.JAVA_HOME, "bin", "java");

  javaProcess = spawn(javaExe, ["-jar", "diginamic-java.jar", "utf8"], {
    stdio: "pipe",
  });

  process.stdin.pipe(javaProcess.stdin);

  if (app.get("devMode")) {
    javaProcess.stdout.on("data", (data) => {
      console.log(String(data));
    });
    javaProcess.stderr.on("data", (data) => {
      console.error(String(data));
    });
  }

  javaProcess.stdout.on("data", (data) => {
    javaLogs$.next(String(data));
  });
  javaProcess.stderr.on("data", (error) => {
    javaLogs$.next(String(error));
  });

  javaProcess.on("close", (code) => console.log("Code de sortie --> ", code));
  javaProcess.on("error", (error) => {
    // console.error(error);
    // console.log("\nTrying to relaunch process");
    // launchJavaProcess();
  });
}
