const logDiv = document.querySelector(".log");

const socket = io();
const EVENT_GET_LOGS = "getLogs";
const EVENT_LOGS = "logs";
const EVENT_POST_INPUT = "userInput";

socket.emit(EVENT_GET_LOGS);

socket.on(EVENT_LOGS, (data) => {
  if (!data) return location.reload();
  logDiv.innerHTML = `<pre>${data}</pre>`;
});

window.addEventListener("keypress", async (e) => {
  socket.emit(EVENT_POST_INPUT, e.key);
  setTimeout(() => socket.emit(EVENT_GET_LOGS), 50);
  logDiv.innerHTML += userInput;
});
