/*
<applet code ="CreateAWTButton" width=300 height=300>
</applet>
*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;


public class CreateAWTButton extends Applet implements ActionListener{
	String actionMessage="";
	public void init()
	{
		Button Button1=new Button("OK");
		Button Button2=new Button("cancel");

		add(Button1);
		add(Button2);

		Button1.addActionListener(this);
		Button2.addActionListener(this);

	}
	public void paint(Graphics g)
	{
		g.drawString(actionMessage,10,50);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String action =ae.getActionCommand();
		if(action.equals("OK"))
		{
			actionMessage="ok button presed";
		}
		if(action.equals("cancel"))
		{
			actionMessage="cancel button presed";
		}
		repaint();
	}
}	