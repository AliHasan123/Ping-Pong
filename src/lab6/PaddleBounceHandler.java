package lab6;

import engine.Entity;
import engine.collision.CollisionListener;

public class PaddleBounceHandler implements CollisionListener {
	public PaddleBounceHandler() {
	}

	@Override
	public void collisionOccurred(Entity e) {
		e.setXVelocity(-e.getXVelocity());
		// TODO Auto-generated method stub
	}
}
