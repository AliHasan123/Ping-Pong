package lab6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import engine.Game;

public class TimerHandler implements ActionListener {
	private Game _g;

	public TimerHandler(Game game) {
		_g = game;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		_g.updateEntities();
		_g.checkCollision();
		_g.draw();
		// TODO Auto-generated method stub
	}
}
