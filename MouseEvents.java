
/* 
<applet code= "MouseEvents" width=300 height=100>
</applet>
*/
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class MouseEvents extends Applet implements MouseMotionListener{
	int x=0,y=0;
	String msg="";
	public void init()
	{
		addMouseMotionListener(this);
	}
	public void mouseDragged(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		msg="#";
		showStatus(" Dragginfg"+x+","+y);
		repaint();
	}
	public void mouseMoved(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		msg="#";
		showStatus(" Mocnin"+x+","+y);
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,x,y);
	}
}