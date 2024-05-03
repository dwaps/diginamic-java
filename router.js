const router = require("express").Router();

router.get("/api/game/start", async (req, res) => {
  res.status(200).json({ log: javaLogs$.value });
});

module.exports = router;
