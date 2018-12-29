package lab1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;
import java.util.Set;



public class Ferdinand {
	private float _startPosX;
	private float _startPosY;
	private int _pictureWidth;
	private int _pictureHeight;
	private int shipWidth = 100;
	private int shipHeight = 60;
	private int MaxSpeed;
	public int getMaxSpeed(){
		return MaxSpeed;
	}
	private void setMaxSpeed(int value){
		MaxSpeed = value;
	}
	
	private float Weight;
	public float getWeight(){
		return Weight;
	}	
	private void setWeight(float value){
	Weight = value;
	}
	
	private Color MainColor;
	public Color getMainColor(){
		return MainColor;
	}
	private void setMainColor(Color value){
	MainColor = value;
	}
	
	private Color DopColor;
	public Color getDopColor(){
		return DopColor;
	}
	private void setDopColor(Color value){
	DopColor = value;
	}
	
	private boolean Caterpillar;
	public boolean getCaterpillar(){
		return Caterpillar;
	}
	private void setCaterpillar(boolean value){
		Caterpillar = value;
	}
	
	private boolean DopWheels;
	public boolean getDopWheels(){
		return DopWheels;
	}
	private void setDopWheels(boolean value){
		DopWheels = value;
	}
	
	private boolean Gun;
	public boolean getGun(){
		return Gun;
	}
	private void setGun(boolean value){
		Gun = value;
	}
	
	public Ferdinand(int maxSpeed, float weight, Color mainColor, Color dopColor, boolean caterpillar, boolean dopwheels, boolean gun ) {
		setMaxSpeed (maxSpeed);
		setWeight(weight);
		setMainColor(mainColor);
		setDopColor (dopColor);
		setCaterpillar(caterpillar);
		setDopWheels (dopwheels);
		setGun(gun);		
	}

	public void SetPosition(int x, int y, int width, int height) {
		_startPosX = x;
		_startPosY = y;
		_pictureWidth = width;
		_pictureHeight = height;
	}

	public void MoveTransport(Direction direction) {

		float step = getMaxSpeed() * 100 / getWeight();
		switch (direction) {
		case Right:
			if (_startPosX + step < _pictureWidth - shipWidth) {
				_startPosX += step;
			}
			break;
		case Left:
			if (_startPosX - step > 0) {
				_startPosX -= step;
			}
			break;
		case Up:
			if (_startPosY - step - 10 > 0) {
				_startPosY -= step;
			}
			break;
		case Down:
			if (_startPosY + step < _pictureHeight - shipHeight) {
				_startPosY += step;
			}
			break;
		}
	}

	public void DrawFerdinand(Graphics g) {
		g.setColor(MainColor);
		g.fillOval((int) _startPosX + 10,(int) _startPosY + 30, 20, 20);
		g.fillOval((int) _startPosX + 70, (int)_startPosY + 30,  20, 20);
		g.fillRect((int) _startPosX - 5, (int)_startPosY + 10, 110, 20);
		g.fillRect((int) _startPosX + 30, (int)_startPosY - 5, 50, 20);
		Color blackColor = new Color(0, 0, 0);
		g.setColor(blackColor);
		g.drawOval((int) _startPosX + 10,(int) _startPosY + 30, 20, 20);
		g.drawOval((int) _startPosX + 70, (int)_startPosY + 30,  20, 20);
		
		g.drawRect((int) _startPosX + 30,(int) _startPosY - 5, 50, 15);
		g.drawRect((int) _startPosX - 5,(int) _startPosY + 10, 110, 20);
		if (Caterpillar)
		{
			g.setColor(blackColor);
			g.drawLine((int) _startPosX + 20, (int)_startPosY + 50, (int) _startPosX + 80, (int)_startPosY + 50);
		}

		if (DopWheels)
		{
			g.setColor(DopColor);
			g.fillOval((int) _startPosX + 30, (int)_startPosY + 30,20, 20);
			g.fillOval((int) _startPosX + 50, (int)_startPosY + 30, 20,  20);
			g.setColor(blackColor);			
			g.drawOval((int) _startPosX + 30, (int)_startPosY + 30,20, 20);
			g.drawOval((int) _startPosX + 50, (int)_startPosY + 30, 20,  20);
			
		}
		if (Gun)
		{
			g.setColor(blackColor);
			g.drawLine((int)_startPosX - 5, (int)_startPosY - 5,(int)_startPosX + 30,(int) _startPosY);
		}

	}
}
