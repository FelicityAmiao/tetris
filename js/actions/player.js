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
  let boundaryHeight = getBoundaryHeight();
  let oneBlockHeight = calculateElementHeights([getElement('.block')]);
  block.style[action.direction] = boundaryHeight - oneBlockHeight + 'px';
}

function drop(block, moveCallBack) {
  moveCallBack();
  if (isLand(block)) {
    afterLand(block);
  }
}