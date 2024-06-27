function release(block) {
  block.blur();
  block.className = 'land-block';
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