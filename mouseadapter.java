import java.awt.*;
import java.awt.event.*;
import java.util.*;

class sample extends MouseAdapter
 {
	Frame f=new Frame();
	  
	sample()
	 {
		f.setVisible(true);
		f.setSize(1000,1000);
		f.addMouseMotionListener(this);
	 }

	public void MouseDragged(MouseEvent me)
	 {
		System.out.println("Mouse Dragged");
	 }
	
	public void MouseMoved(MouseEvent me)
	 {
		System.out.println("Mouse Moved");
	 }
 }
class mouseadpter
 {
	public static void main(String args[])
	 {
		sample obj=new sample();
	 }
 }