package lab6;

import engine.Entity;
import engine.collision.CollisionListener;

public class VerticalBounceHandler implements CollisionListener {
	public VerticalBounceHandler() {
	}

	@Override
	public void collisionOccurred(Entity e) {
		e.setYVelocity(-e.getYVelocity());
		// TODO Auto-generated method stub
	}
}