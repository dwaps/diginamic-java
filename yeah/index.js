const { exec } = require("child_process");
const { resolve } = require("path");

require("chokidar")
  .watch(resolve("..", "src"), { ignoreInitial: true })
  .on("change", () => {
    exec("sh watcher.sh", { encoding: "utf8" }, console.log);
  });
