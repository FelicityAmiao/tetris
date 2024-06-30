function setScheduler(task, endCondition, interval) {
  let intervalId = setInterval(() => {
    task();
    if (endCondition()) {
      clearInterval(intervalId);
    }
  }, interval);
}