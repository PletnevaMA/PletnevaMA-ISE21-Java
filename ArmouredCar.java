package lab2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class ArmouredCar extends Vehicle{
	protected  int shipWidth = 100;
    protected  int shipHeight = 60;
    public ArmouredCar(int maxSpeed, float weight, Color mainColor)
    {
        MaxSpeed = maxSpeed;
        Weight = weight;
        MainColor = mainColor;
    }
   
    public  void MoveTransport(Direction direction)
    {
        float step = MaxSpeed * 100 / Weight;
        switch (direction)
        {
            case Right:
                if (_startPosX + step < _pictureWidth - shipWidth)
                {
                    _startPosX += step;
                }
                break;
            case Left:
                if (_startPosX - step > 0)
                {
                    _startPosX -= step;
                }
                break;
            case Up:
                if (_startPosY - step - 10 > 0)
                {
                    _startPosY -= step;
                }
                break;
            case Down:
                if (_startPosY + step < _pictureHeight - shipHeight)
                {
                    _startPosY += step;
                }
                break;
        }
    }
    @Override
    public void DrawCar(Graphics g)
    {
    	
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
		
    }

}
