import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class sample extends JFrame implements ActionListener
 {
	JLabel l1;
	JTextField t1;
	JButton b1;
	
	sample()
	 {
		setLayout(null);
		setVisible(true);
		setSize(1000,1000);
	
		l1= new JLabel("Executable");
		
		t1=new JTextField();
		
		JPanel p=new JPanel(new GridLayout(1,1));
		p.add(l1);	
		p.add(t1);
		add(p);
		
		p.setBounds(450,100,200,50);
	
		b1=new JButton("submit");
		b1.setBounds(470,200,150,60);
		add(b1);
		b1.addActionListener(this);

		}
	public void actionPerformed(ActionEvent d)
	 {
		if(d.getActionCommand().equals("Submit"));
		 {
		     try{
			Runtime.getRuntime().exec(t1.getText());
		           }catch(IOException dd){}
		 }
		t1.setText("");
	
	 }
 }


class runtime1
 {
	public static void main(String args[])
	 {
		sample obj=new sample();
	 }
 }
		 

		