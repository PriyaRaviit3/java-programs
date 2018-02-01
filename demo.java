import java.awt.*;
import java.awt.event.*;

class sun extends Frame implements ActionListener
 {
    Label l1,l2,lh;
    TextField t1,t2;
    Button b1,b2;
  sun()
   {
     setLayout(null);
     setVisible(true);
     setBackground(Color.pink);
     setSize(100,100);
        lh=new Label("Sign up");
	add(lh);
        lh.setBounds(130,30,120,30);
	l1=new Label("user");
	l2=new Label("password");
	t1=new TextField(5);
	t2=new TextField(10);

	Panel p1=new Panel(new GridLayout(2,2));
	p1.add(l1);
	p1.add(t1);
	p1.add(l2);
	p1.add(t2);
	add(p1);
	p1.setBounds(30,100,220,60);
	b1=new Button("Submit");
	b2=new Button("Exit");
        b1.setBounds(30,190,80,30);
	b2.setBounds(50,190,80,30);

    }
 public actionPerformed(ActionEvent d)
 {
   if(d.getActionComment().equals("Submit"))
    {
      System.out.println(""+t1.getText());
     }
    if(d.getActionComment().equals("Exit"))
     {
      System.exit(0);
      }
  }
 }
class demo
 {
   public static void main(String ar[])
    {
     sun s=new sun();
     }
 }