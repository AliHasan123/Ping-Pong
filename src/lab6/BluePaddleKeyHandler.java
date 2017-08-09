package lab6;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BluePaddleKeyHandler implements KeyListener {
	Paddle _paddle;

	public BluePaddleKeyHandler(Paddle paddle) {
		_paddle = paddle;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyPressed(KeyEvent e) {
		char k = e.getKeyChar();
		char l = e.getKeyChar();
		if (k == 'k') {
			_paddle.setYVelocity(5);
		} else if (l == 'l') {
			_paddle.setYVelocity(-5);
		}
		// TODO Auto-generated method stub
	}

	@Override
	public void keyReleased(KeyEvent e) {
		char k = e.getKeyChar();
		char l = e.getKeyChar();
		if (k == 'k') {
			_paddle.setYVelocity(0);
		} else if (l == 'l') {
			_paddle.setYVelocity(0);
		}
		// TODO Auto-generated method stub
	}
}
