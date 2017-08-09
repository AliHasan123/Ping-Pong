package lab6;
import java.awt.Color;
import java.awt.Rectangle;
import java.util.ArrayList;

import engine.Entity;
import engine.collision.CollisionListener;
import engine.drawing.ICanvas;
public class Wall implements Entity {
private int _x;
private int _y;
private int _width;
private int _height;
private Color _color;
private ArrayList<CollisionListener> _al;
public Wall(int x, int y, int width, int height, Color color){
_x = x;
_y = y;
_width = width;
_height = height;
_color = color;
_al = new ArrayList<CollisionListener>();
}
@Override
public Rectangle getRect() {
Rectangle r = new Rectangle(_x, _y, _width, _height); // TODO Auto-generated method stub
return r;
}
@Override
public void draw(ICanvas dc) {
dc.drawFilledRectangle(_x, _y, _width, _height, _color); // TODO Auto-generated method stub
}
@Override
public void update() {
// TODO Auto-generated method stub 
	}
@Override
public int getXCoordinate() {
// TODO Auto-generated method stub
return _x; }
@Override
public int getYCoordinate() {
// TODO Auto-generated method stub
return _y; }
@Override
public int getXVelocity() {
// TODO Auto-generated method stub
return 0; }
@Override
public int getYVelocity() {
// TODO Auto-generated method stub
return 0; }
@Override
public void setXVelocity(int velocity) {
// TODO Auto-generated method stub 
	}
@Override
public void setYVelocity(int velocity) {
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
for (CollisionListener cl : _al) { cl.collisionOccurred(e);
}
// TODO Auto-generated method stub
} }

