/*
<applet code="SimpleApplet" width=200 height= 500>
</applet>
*/
import java.applet.*;
import java.awt.*;

public class SimpleApplet extends Applet{
	public void paint(Graphics g)
	{
		g.drawString("hello world from applet",20,20);

	}
}
