window.KEY_UP = { key: 'ArrowUp', direction: 'marginBottom', step: 50 };
window.KEY_DOWN = { key: 'ArrowDown', direction: 'marginTop', step: 50, boundaryCheck: (block) => isLand(block)};
window.KEY_LEFT = { key: 'ArrowLeft', direction: 'marginRight', step: 100, boundaryCheck: (block) => isLand(block) || isLeftWall(block) };
window.KEY_RIGHT = { key: 'ArrowRight', direction: 'marginLeft', step: 100, boundaryCheck: (block) => isLand(block) || isRightWall(block) };

window.KEY_SPACE = { key: ' ', direction: 'marginTop' };