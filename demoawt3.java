import java.awt.*;
import java.awt.event.*;

	class sample extends Frame implements ActionListener,ItemListener,MouseListener,MouseMotionListener
		{
			Label l1,l2;
			TextField t1,t2;
			Button b1,b2,b3,b4,b5;
			TextArea ta;
			Choice ch;
			Checkbox c1,c2,c3,c4,c5;
			CheckboxGroup cbg;
			MenuBar mbar;
			


			sample()
				{
					
					addMouseListener(this);
					addMouseMotionListener(this);
					mbar=new MenuBar();
					setMenuBar(mbar);
					

					Menu cars=new Menu("Cars");
					mbar.add(cars);
					
					MenuItem cm1=new MenuItem("Hybrid");
					cars.add(cm1);
					MenuItem cm2=new MenuItem("Hacthback");
					cars.add(cm2);
					MenuItem cm3=new MenuItem("Sedan");
					cars.add(cm3);
					MenuItem cm4=new MenuItem("SUV");
					cars.add(cm4);				

					//second menu

					Menu service=new Menu("Service");
					mbar.add(service);
					MenuItem sm1=new MenuItem("Apps & Services");
					service.add(sm1);
					MenuItem sm2=new MenuItem("Own & Enjoy");
					service.add(sm2);

					//third menu

					Menu corporatesales=new Menu("Corporate sales");
					mbar.add(corporatesales);
					MenuItem com1=new MenuItem("Fleet sales");
					corporatesales.add(com1);
					MenuItem com2=new MenuItem("High sea sales");
					corporatesales.add(com2);
					MenuItem com3=new MenuItem("Diplomatic sales");
					corporatesales.add(com3);
					

					//forth menu

					Menu buy=new Menu("Buy");
					mbar.add(buy);
					
					MenuItem bm1=new MenuItem("e-Broucher request");
					buy.add(bm1);
					MenuItem bm2=new MenuItem("Book a test drive");
					buy.add(bm2);
					MenuItem bm3=new MenuItem("Find a dealer");
					buy.add(bm3);

					setLayout(null);
					setFont(new Font("Times new roman",Font.BOLD,15));

					
					setVisible(true);
					setSize(500,500);
					
					l1=new Label("Username");
					l2=new Label("password");

					t1=new TextField();
					t2=new TextField();
					
					Panel p=new Panel(new GridLayout(1,4));

					p.add(l1);
					p.add(t1);
					p.add(l2);
					p.add(t2);
					
					add(p);
					
					p.setBounds(1000,50,300,30);					
					p.setBackground(Color.red);
					p.setForeground(Color.white);
					setBackground(Color.orange);
					t1.setBackground(Color.white);
					t2.setBackground(Color.white);
					t2.setEchoChar('#');

					b1=new Button("sign in");
					b1.setBounds(1000,80,300,30);
					b1.setBackground(Color.red);
					b1.setForeground(Color.white);
					add(b1);
					b1.addActionListener(this);
					

					b2=new Button("About us");
					b2.setBounds(10,80,300,30);
					b2.setBackground(Color.red);
					b2.setForeground(Color.white);
					add(b2);
					b2.addActionListener(this);
					
					
					b3=new Button("Products & services");
					b3.setBounds(300,80,300,30);
					b3.setBackground(Color.red);
					b3.setForeground(Color.white);
					add(b3);
					b3.addActionListener(this);

					b4=new Button("Contact us");
					b4.setBounds(500,80,300,30);
					b4.setBackground(Color.red);
					b4.setForeground(Color.white);
					add(b4);
					b4.addActionListener(this);					
					
					b5=new Button("Feed back");
					b5.setBounds(690,80,300,30);
					b5.setBackground(Color.red);
					b5.setForeground(Color.white);
					add(b5);
					b5.addActionListener(this);

					ta=new TextArea();
					add(ta);
					ta.setBounds(800,110,200,200);
					
					ch=new Choice();
					add(ch);
					ch.add("Java");
					ch.add("Python");
					ch.add("Spring");
					ch.add("Scrum");
					ch.setBounds(1000,110,100,50);
					ch.setBackground(Color.white);
					ch.addItemListener(this);
					
					c1=new Checkbox("Full time");
					c2=new Checkbox("Part time");
					c3=new Checkbox("Week end");
					Panel cpan=new Panel(new GridLayout(2,3));
					cpan.add(c1);
					cpan.add(c2);
					cpan.add(c3);
					add(cpan);
					cpan.setBounds(1000,170,300,50);
					cpan.setBackground(Color.white);

					cbg=new CheckboxGroup();
					c4=new Checkbox("Male",cbg,true);
					c5=new Checkbox("Female",cbg,false);
					add(c4);
					add(c5);
					c4.setBounds(1000,230,120,30);
					c5.setBounds(1120,230,120,30);
					c4.setBackground(Color.white);
					c5.setBackground(Color.white);
		}

		//ActionListener over ride

			public void actionPerformed(ActionEvent s)
			
				{
					if(s.getActionCommand().equals("sign in"))
						{
							System.out.println("sign in action clicked");	
						}
					if(s.getActionCommand().equals("About us"))
						{
							System.out.println("About us action clicked");	
						}
					if(s.getActionCommand().equals("Products & services"))
						{
							System.out.println("Products & service action clicked");	
						}
					if(s.getActionCommand().equals("Contact us"))
						{
							System.out.println("Contact us action clicked");	
						}			
					if(s.getActionCommand().equals("Feed back"))
						{
							System.out.println("Feed back action clicked");	
						}
				}	
	

		//itemListener over ride

			public void itemStateChanged(ItemEvent aa)
				{
					System.out.println(""+ch.getSelectedItem());
				}

		//MouseListener over ride

			public void mouseExited(MouseEvent bb)
				{
					System.out.println("Mouse exited");
				}
			public void mouseEntered(MouseEvent bb)
				{
					System.out.println("Mouse entered");
				}
			public void mouseReleased(MouseEvent bb)
				{
					System.out.println("Mouse released");
				}
			public void mousePressed(MouseEvent bb)
				{
					System.out.println("Mouse Event");
				}
			public void mouseClicked(MouseEvent bb)
				{
					System.out.println("Mouse clicked");							
				}
		//MouseMotionListener over ride

			public void mouseMoved(MouseEvent cc)
				{
					System.out.println("");
					System.out.println("X="+cc.getX());
					System.out.println("Y="+cc.getY());
				}
			public void mouseDragged(MouseEvent cc){}
		}


	class demoawt
		{
			public static void main(String args[])
				{
					sample obj=new sample();
				}
		}