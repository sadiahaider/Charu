import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;

import javax.swing.*;
import javax.swing.plaf.basic.BasicProgressBarUI;


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



import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JFrame;

//for making highlighted text

class Highlighter extends JPanel
{
	private static final Graphics Graphics = null;
	private int height,width,x,y,x2,y2;
	private Font myfont = new Font("serif", Font.BOLD, 30);
	private String string = "title";
	private Color color = new Color (255,255,255);
	private Color fontcolor = new Color (255,255,255);
	

	public Highlighter (int x,int y,int width,int height,Color color, String string,int x2,int y2,Font myfont,Color fontcolor) /*for calling New class 
	Highlighter(int x,int y,int width,int height,Color color, String string,int x2,int y2,Font myfont,Color fontcolor)*/
	{
		
		this.height= height;
		this.width=width;
		this.x=x;
		this.y=y;
		this.x2=x2;
		this.y2=y2;
		this.string=string;
		this.myfont=myfont;
		this.color=color;
		this.fontcolor=fontcolor;
		
	}
	
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public int getX2()
	{
		return x2;
	}
	public int getY2()
	{
		return y2;
	}
	public int getWidth()
	{
		return width;
	}
	public String getString()
	{
		return string;
	}
	public Color setColor()
	{
		return color;
	}
	public Color setFontcolor()
	{
		return fontcolor;
	}
	public Font setFont()
	{
		return myfont;
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(color);
		g.fillRect(0,0, width, height);
		g.setColor(fontcolor);
		g.setFont(myfont);
		g.drawString(string, x2, y2);
	}
}
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
class CircularProgress extends BasicProgressBarUI {
  @Override public Dimension getPreferredSize(JComponent c) {
    Dimension d = super.getPreferredSize(c);
    int v = Math.max(d.width, d.height);
    d.setSize(v, v);
    return d;
  }
  @Override public void paint(Graphics g, JComponent c) {
    Insets b = progressBar.getInsets(); // area for border
    int barRectWidth  = progressBar.getWidth()  - b.right - b.left;
    int barRectHeight = progressBar.getHeight() - b.top - b.bottom;
    if (barRectWidth <= 0 || barRectHeight <= 0) {
      return;
    }

    // draw the cells
    Graphics2D g2 = (Graphics2D) g.create();
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);
    g2.setPaint(progressBar.getForeground());
    double degree = 360 * progressBar.getPercentComplete();
    double sz = Math.min(barRectWidth, barRectHeight);
    double cx = b.left + barRectWidth  * .5;
    double cy = b.top  + barRectHeight * .5;
    double or = sz * .5;
    double ir = or * .5; //or - 20;
    Shape inner = new Ellipse2D.Double(cx - ir, cy - ir, ir * 2, ir * 2);
    Shape outer = new Arc2D.Double(
        cx - or, cy - or, sz, sz, 90 - degree, degree, Arc2D.PIE);
    Area area = new Area(outer);
    area.subtract(new Area(inner));
    g2.fill(area);
    g2.dispose();

    // Deal with possible text painting
    if (progressBar.isStringPainted()) {
      paintString(g, b.left, b.top, barRectWidth, barRectHeight, 0, b);
    }
  }
}
