package lab6;

import java.awt.Color;
import java.awt.Rectangle;
import java.util.ArrayList;

import engine.Entity;
import engine.collision.CollisionListener;
import engine.drawing.ICanvas;

public class Ball implements Entity {
	int _x;
	int _y;
	int _size;
	int _vx;
	int _vy;
	Color _color;
	private ArrayList<CollisionListener> _al;

	public Ball(int x, int y, int size, int vx, int vy, Color color) {
		_x = x;
		_y = y;
		_size = size;
		_color = color;
		_vx = vx;
		_vy = vy;
		_al = new ArrayList<CollisionListener>();
	}

	@Override
	public Rectangle getRect() {
		Rectangle r = new Rectangle(_x, _y, _size, _size); // TODO
															// Auto-generated
															// method stub
		return r;
	}

	@Override
	public void draw(ICanvas dc) {
		dc.drawFilledCircle(_x, _y, _size, _color); // TODO Auto-generated
													// method stub
	}

	@Override
	public void update() {
		_x = _x + _vx;
		_y = _y + _vy;
		if (_x < 10) {
			System.out.println("Blue Player WINS!");
			System.exit(0);
		} else if (_x > 880) {
			System.out.println("Green Player WINS!");
			System.exit(0);
		}
		// TODO Auto-generated method stub
	}

	@Override
	public int getXCoordinate() {
		// TODO Auto-generated method stub
		return _x;
	}

	@Override
	public int getYCoordinate() {
		// TODO Auto-generated method stub
		return _y;
	}

	@Override
	public int getXVelocity() {
		// TODO Auto-generated method stub
		return _vx;
	}

	@Override
	public int getYVelocity() {
		// TODO Auto-generated method stub
		return _vy;
	}

	@Override
	public void setXVelocity(int velocity) {
		_vx = velocity;
		// TODO Auto-generated method stub
	}

	@Override
	public void setYVelocity(int velocity) {
		_vy = velocity;
		// TODO Auto-generated method stub
	}

	@Override
	public void addCollisionListener(CollisionListener cl) {
		_al.add(cl);
		// TODO Auto-generated method stub
	}

	@Override
	public void removeCollisionListener(CollisionListener cl) {
		// TODO Auto-generated method stub
	}

	@Override
	public void fireCollisionOccurred(Entity e) {
		for (CollisionListener cl : _al) {
			cl.collisionOccurred(e);
		}
		// TODO Auto-generated method stub }
	}
}
