const logDiv = document.querySelector(".log");
const inputEl = document.querySelector("input");

const socket = io();
const EVENT_GET_LOGS = "getLogs";
const EVENT_LOGS = "logs";
const EVENT_POST_INPUT = "userInput";

socket.emit(EVENT_GET_LOGS);

socket.on(EVENT_LOGS, (data) => {
  if (!data) return location.reload();
  logDiv.innerHTML = `<pre>${data}</pre>`;
  inputEl.hidden = false;
  inputEl.focus();
});

inputEl.addEventListener("input", async () => {
  const userInput = inputEl.value.trim().toLowerCase();
  if (userInput === "o") {
    socket.emit(EVENT_POST_INPUT, userInput);
    logDiv.innerHTML += userInput;
  }
  inputEl.value = "";
  inputEl.focus();
});
