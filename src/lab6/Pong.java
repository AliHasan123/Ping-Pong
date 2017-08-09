package lab6;

import java.awt.Color;

import javax.swing.Timer;

import engine.Game;

public class Pong {
	public Pong() {
		Game g = new Game(900, 400);
		g.setBackgroundColor(Color.BLACK);
		Wall northwall = new Wall(0, 0, 900, 10, Color.GRAY);
		g.addEntity(northwall);
		Wall southwall = new Wall(0, 390, 900, 10, Color.GRAY);
		g.addEntity(southwall);
		Wall westwall = new Wall(0, 10, 10, 390, Color.BLUE);
		g.addEntity(westwall);
		Wall eastwall = new Wall(890, 10, 10, 390, Color.GREEN);
		g.addEntity(eastwall);
		Paddle greenpaddle = new Paddle(25, 175, 5, 50, Color.GREEN);
		g.addEntity(greenpaddle);
		Paddle bluepaddle = new Paddle(875, 175, 5, 50, Color.BLUE);
		g.addEntity(bluepaddle);
		Ball ball = new Ball(100, 100, 10, 5, 5, Color.YELLOW);
		g.addEntity(ball);
		VerticalBounceHandler vbh = new VerticalBounceHandler();
		northwall.addCollisionListener(vbh);
		southwall.addCollisionListener(vbh);
		PaddleBounceHandler pbh = new PaddleBounceHandler();
		bluepaddle.addCollisionListener(pbh);
		greenpaddle.addCollisionListener(pbh);
		BluePaddleKeyHandler bpkh = new BluePaddleKeyHandler(bluepaddle);
		g.addKeyListener(bpkh);
		GreenPaddleKeyHandler gpkh = new GreenPaddleKeyHandler(greenpaddle);
		g.addKeyListener(gpkh);
		Timer t = new Timer(20, new TimerHandler(g));
		t.start();
	}
}
