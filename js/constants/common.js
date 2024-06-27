window.KEY_UP = { key: 'ArrowUp', direction: 'marginBottom', step: 50 };
window.KEY_DOWN = { key: 'ArrowDown', direction: 'marginTop', step: 50, boundaryCheck: (block) => isLand(block)};
window.KEY_LEFT = { key: 'ArrowLeft', direction: 'marginRight', step: 100, boundaryCheck: (block) => isLand(block) || isWall(block) };
window.KEY_RIGHT = 'ArrowRight';

window.KEY_SPACE = { key: ' ', direction: 'marginTop' };
