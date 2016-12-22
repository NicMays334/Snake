package snake;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.*;

public class RenderPanel extends JPanel 
{
	
	public static Color green = new Color(41984);
	public static Color red = new Color(11665408);
	public static Color yellow = new Color(16777011);
	
	@Override
	protected void paintComponent(Graphics g) 
	{
		super.paintComponent(g);
		g.setColor(yellow);
		g.fillRect(0, 0, 800, 700);
		
		Snake snake = Snake.snake;
		g.setColor(green);
		for(Point point : snake.snakeParts)
		{
			g.fillRect(point.x * Snake.SCALE, point.y*Snake.SCALE, Snake.SCALE,  Snake.SCALE);
		}
		g.fillRect(snake.head.x*Snake.SCALE, snake.head.y*Snake.SCALE, Snake.SCALE,  Snake.SCALE);
		
		g.setColor(red);
		g.fillRect(snake.cherry.x*Snake.SCALE, snake.cherry.y*Snake.SCALE, Snake.SCALE, Snake.SCALE);
		
		g.setColor(Color.BLACK);
		String Dialog = "Score: "+snake.score; 
		g.drawString(Dialog, (int) (getWidth()/2-Dialog.length()*2.5), 13);
	}

}