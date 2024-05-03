const socketIo = require("socket.io");

module.exports = (httpServer, javaLogs$) => {
  socketIo(httpServer).on("connection", (socket) => {
    socket.on("getLogs", () => {
      socket.emit("logs", javaLogs$.value);
    });

    socket.on("userInput", (data) => {
      if (data === "o") {
        process.stdin.write(data + "\n");
      }
    });
  });
};
