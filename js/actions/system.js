function release(block) {
  block.blur();
  block.className = 'land-block-Col1';
  block.tabIndex = -1;
}

function afterLand(block) {
  release(block);
  if (getElement('.block') !== null) {
    return;
  }
  let nextBlock = createDivOnFocus('block');
  block.parentNode.prepend(nextBlock);
  initBlockEvents();
}

function initBlockEvents() {
  let block = getElement('.block');
  block.focus();
  addPlayerEvents(block);
  // setScheduler(
  //   ()  => drop(block, () => move(block, window.KEY_DOWN)),
  //   () => isLand(block),
  //   500
  // );
}

function processLand(block, moveCallBack) {
  moveCallBack();
  if (isLand(block)) {
    afterLand(block);
  }
}