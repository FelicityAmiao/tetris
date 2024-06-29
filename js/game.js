function initWindowsVariables() {
  window.mainCols = getMainCols();
}

document.addEventListener("DOMContentLoaded", () => {
  initWindowsVariables();
  initBlockEvents();
});