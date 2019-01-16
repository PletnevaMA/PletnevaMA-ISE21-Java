package lab2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Ferdinand extends ArmouredCar{	
	
	private Color DopColor;
	public Color getDopColor(){
		return DopColor;
	}
	public void setDopColor(Color value) {
		
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
	public Ferdinand(int maxSpeed, float weight, Color mainColor, Color dopColor,boolean caterpillar, boolean dopwheels, boolean gun ) 
    {      
		super(maxSpeed, weight, mainColor);
		setDopColor (dopColor);
		setCaterpillar(caterpillar);
		setDopWheels (dopwheels);
		setGun(gun);		
    }

	public void DrawCar(Graphics g) {
		super.DrawCar(g);
		Color blackColor = new Color(0, 0, 0);
		g.setColor(blackColor);
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
