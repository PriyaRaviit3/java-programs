import java.awt.*;
class sample extends Frame
{
	sample()
	{
		CheckboxGroup cg1=new CheckboxGroup();
		Checkbox c1=new Checkbox("java",cg1,false);
		c1.setBounds(100,100,50,50);
		Checkbox c2=new Checkbox("C++",cg1,true);
		c2.setBounds(100,50,50,50);
		  add(c1);
		  add(c2);
		  setLayout(null);
		  setVisible(true);
		  setSize(400,400);
		  setBackground(Color.cyan);
		  c1.setBackground(Color.yellow);
		  c2.setBackground(Color.yellow);
                   }
}
class democheckboxgroup
{
	public static void main(String args[])
	  {
		sample s=new sample();
	  }
}