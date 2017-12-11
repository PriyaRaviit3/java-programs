import java.awt.*;


class sample extends Frame
 {
	Label l1,l2,l3;
	TextField t1,t2;

	Button b1,b2;
	sample()
	{
		setLayout(null);
		
		setVisible(true);
		setSize(50000,50000);
		
		l1=new Label("UserName");
		l2=new Label("Password");
		
		l1.setBackground(Color.pink);
		l2.setBackground(Color.pink);
		

		l1.setFont(new Font("Cooper",Font.BOLD,15));
		l2.setFont(new Font("Cooper",Font.BOLD,15));
		

		t1=new TextField();
		
		t2=new TextField();
		t1.setBackground(Color.green);
		t2.setBackground(Color.green);

		t1.setFont(new Font("Cooper",Font.BOLD,15));
		
		t2.setEchoChar('*');

		Panel p=new Panel(new GridLayout(2,2));
		
		p.add(l1);
		p.add(t1);
		p.add(l2);
		p.add(t2);
		
		add(p);
		
		p.setBounds(1000,120,300,80);
		p.setBounds(500,120,300,80);

		b1=new Button("Singin");
		add(b1);
	
		b1.setBounds(1020,240,90,40);

		b1.setBackground(Color.black);

		b1.setForeground(Color.white);

	
		b2=new Button("Exit");
		add(b2);
	
		b2.setBounds(1120,240,90,40);

		b2.setBackground(Color.black);

		b2.setForeground(Color.white);
		
	


	}
		public void paint(Graphics g)
		{
			g.drawRect(50,50,1300,650);
			g.setColor(Color.blue);
			
			g.drawRect(52,52,1302,650);
		}			
 }
class demoawt1
 {
	public static void main(String args[])
	{
		sample obj=new sample();
	}	
 }