const socketIo = require("socket.io");

module.exports = (httpServer, javaLogs$, javaProcess) => {
  socketIo(httpServer).on("connection", (socket) => {
    socket.on("getLogs", () => {
      socket.emit("logs", javaLogs$.value);
    });

    socket.on("userInput", (data) => {
      javaProcess.stdin.write(data + "\n");
    });
  });
};
