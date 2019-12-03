/* 
<applet code=SimpleKey width=300 height=300>
</applet>
*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleKey extends Applet implements KeyListener{
	String msg="";
	int x=20,y=10;

	public void init()
	{
		addKeyListener(this);
	}
	public void keyPressed(KeyEvent ke)
	{
		showStatus(" key down");
	}
	public void keyReleased(KeyEvent ke)
	{
		showStatus(" key up");
	}
	public void keyTyped(KeyEvent ke)
	{
		msg=msg+ke.getKeyChar();
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,x,y);
	}
}
