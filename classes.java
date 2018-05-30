import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JFrame;


import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JFrame;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JFrame;

//RadioButton
class Radiobutton extends JPanel
{
	private int x=500,y=500,side=20;
	private String string="Title";
	private Color outercolor = new Color (11, 83, 69);
	private Color innercolor = new Color (255, 255, 255);
	public Radiobutton (int x,int y, int side,Color innercolor,
			Color outercolor)
	{
		this.x= x;
		this.y= y;
		this.side= side;
		this.innercolor=innercolor;
		this.outercolor=outercolor;
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public int getSide()
	{
		return side;
	}
	public Color Innercolor()
	{
		return innercolor;
	}
	public Color setOutercolor()
	{
		return outercolor;
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(outercolor);
		g.fillOval(x,y, side, side);
		g.setColor(innercolor);
		g.fillOval(x+2,y+2, side-4, side-4);
		g.setColor(outercolor);
		g.fillOval(x+4,y+4, side-8, side-8);
		
	}
}
//Checkbox
class Checkbox extends JPanel
{
	private int x=100,y=100,side=20;
	private String string="Title";
	private Color outercolor = new Color (11, 83, 69);
	private Color innercolor = new Color (255, 255, 255);
	public Checkbox (int x,int y, int side,Color innercolor,
			Color outercolor)
	{
		this.x= x;
		this.y= y;
		this.side= side;
		this.innercolor=innercolor;
		this.outercolor=outercolor;
		
		addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
			}

			private void setColor(Color outercolor) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}});
	}
	protected void fillRect(int i, int j, int k, int l) {
		// TODO Auto-generated method stub
		
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public int getSide()
	{
		return side;
	}
	public Color Innercolor()
	{
		return innercolor;
	}
	public Color setOutercolor()
	{
		return outercolor;
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(outercolor);
		g.fillRect(x,y, side, side);
		g.setColor(innercolor);
		g.fillRect(x+2,y+2, side-4, side-4);
		g.setColor(outercolor);
		g.fillRect(x+4,y+4, side-8, side-8);
		
	}
	
	 private void setColor(Color outercolor2) {
		// TODO Auto-generated method stub
		
	}
	public void mouseEntered(MouseEvent e) {}  
	    public void mouseExited(MouseEvent e) {}  
	    public void mousePressed(MouseEvent e) {}  
	    public void mouseReleased(MouseEvent e) {}  

	
}

//for creating two layered title bar, axis,width,height,colors can be customized by 

class Titlebar extends JPanel  
{
	private static final Graphics Graphics = null;
	private int x=0,y=0,height=60,width=320;
	private String string="Title";
	private Color upperbarcolor = new Color (11, 83, 69);
	private Color barcolor = new Color (14, 102, 85);
	public Titlebar (int x,int y,int width,int height,Color upperbarcolor,Color 
			barcolor)/*for calling New class Titlebar(int x,int y,int width,int height,Color upperbarcolor,Color 
	barcolor)*/
	{
		
		this.x= x;
		this.y= y;
		this.height= height;
		this.width=width;
		this.upperbarcolor=upperbarcolor;
		this.barcolor=barcolor;
		
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public int getHeight()
	{
		return height;
	}
	public int getWidth()
	{
		return width;
	}
	public Color setUpperbarcolor()
	{
		return upperbarcolor;
	}
	public Color setBarcolor()
	{
		return barcolor;
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(barcolor);
		g.fillRect(x,y, width, height);
		g.setColor(upperbarcolor);
		g.fillRect(x,y, width, height/4);
	}
}

class Background extends JPanel //for changing backgound class
{
	private static final Graphics Graphics = null;
	private int height,width,r,g,b;
	private Color color;
	public Background (int width,int height,Color color) //for calling New class Background(width,height,Color.blue)
	{
		
		this.height= height;
		this.width=width;
		this.color=color;	
		
	}

	public int getHeight()
	{
		return height;
	}
	public int getWidth()
	{
		return width;
	}
	public Color setColor()
	{
		return color;
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(color);
		g.fillRect(0,0, width, height);
	}
}
