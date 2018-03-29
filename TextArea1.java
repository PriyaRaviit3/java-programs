import java.awt.*;


public class TextArea1()
{	
	public static void main(String args[])
	  {
		Frame f=new Frame();
		TextArea area=new TextArea("Welcome to JAVA");

		area.setBounds(10,20,200,200);
		
		f.add(area);
		f.setSize(300,300);
		f.setVisible(true);
		f.setLayout(null);
		
	   }
 }
