function addPlayerEvents(block) {
  block.addEventListener("keydown", (event) => {
    if (event.key === window.KEY_DOWN.key) {
      processLand(block, () => move(block, window.KEY_DOWN));
    }
    if (event.key === window.KEY_SPACE.key) {
      processLand(block, () => land(block));
    }
    if (event.key === window.KEY_LEFT.key) {
      move(block, window.KEY_LEFT);
    }
    if (event.key === window.KEY_RIGHT.key) {
      move(block, window.KEY_RIGHT);
    }
  });
}

function move(block, action) {
  if (action.boundaryCheck(block)) {
    return;
  }
  let currentMove = parseInt(block.style[action.direction]) || 0;
  block.style[action.direction] = currentMove + action.step + 'px';
}

function land(block) {
  if (isLand(block)) {
    return;
  }
  let action = window.KEY_SPACE;
  let boundaryHeight = getColBoundaryHeight(block);
  let oneBlockHeight = calculateElementHeights([getElement('.block')]);
  block.style[action.direction] = boundaryHeight - oneBlockHeight + 'px';
}