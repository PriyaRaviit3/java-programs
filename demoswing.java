import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class sample extends JFrame implements ActionListener
 {
	JRadioButton rb1,rb2;
	JButton b1,b2;
	JCheckBox c1,c2;
	JProgressBar pb;
	sample()
	 {
		setLayout(null);
		setVisible(true);
		setSize(2000,2000);

		b1=new JButton("Submit");
		b1.setBounds(100,70,120,60);
		add(b1);

		b2=new JButton("Close");
		b2.setBounds(250,70,120,60);
		add(b2);

		b1.addActionListener(this);

		pb=new JProgressBar(0,1000);
		pb.setBounds(140,450,250,60);
		add(pb);
		
		//ButtonGroup bg=new ButtonGroup();
		rb1=new JRadioButton("Yes",true);
		rb1.setBounds(100,150,120,60);
		add(rb1);
		rb2=new JRadioButton("No",false);
		rb2.setBounds(250,150,120,60);
		add(rb2);
		

		c1=new JCheckBox("Male");
		c1.setBounds(100,250,80,40);
		add(c1);
		c2=new JCheckBox("Female");
		c2.setBounds(250,250,80,40);
		add(c2);


		Color c=JColorChooser.showDialog(this,"Select color",Color.CYAN);
		getContentPane().setBackground(c);
		//b1.setBackground(c1);

		
	 }
	public void actionPerformed(ActionEvent dd)
	 {
		if(dd.getActionCommand().equals("Submit"))
		 {
			System.out.println("action on");
		 }
	 }
 }
class demoswing
 {
	public static void main(String args[])
	 {
		sample obj=new sample();
	 }
 }