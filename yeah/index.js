const { exec } = require("child_process");
const { resolve } = require("path");

if (!process.env.FQCN) {
  console.log("Ho doucement là, t'as oublié la var env FQCN !");
  return;
}

require("chokidar")
  .watch(resolve("src"), { ignoreInitial: true })
  .on("change", () => {
    if (process.env.FQCN) {
      exec(
        `sh yeah/watcher.sh ${process.env.FQCN}`,
        { encoding: "utf8" },
        console.log
      );
    }
  });
