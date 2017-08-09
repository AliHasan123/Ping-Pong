package lab6;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GreenPaddleKeyHandler implements KeyListener {

	Paddle _paddle;

	public GreenPaddleKeyHandler(Paddle paddle) {

		_paddle = paddle;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		char a = e.getKeyChar();
		char s = e.getKeyChar();
		if (a == 'a') {
			_paddle.setYVelocity(5);
		}

		else if (s == 's') {
			_paddle.setYVelocity(-5);
		}
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		char a = e.getKeyChar();
		char s = e.getKeyChar();
		if (a == 'a') {
			_paddle.setYVelocity(0);
		}

		else if (s == 's') {
			_paddle.setYVelocity(0);
		}
		// TODO Auto-generated method stub

	}

}