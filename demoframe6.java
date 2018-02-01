import java.awt.*;
class sample extends Frame
{
	Label l1,l2,l3,l4,l5,l6;
	TextField t1,t2,t3,t4,t5,t6;
	Button b1,b2;
	 sample()
	{
		setLayout(null);
		setVisible(true);
		setSize(600,600);
		setTitle("sona college of technology");
		setResizable(false);
		isResizable();

		l1=new Label("Stu Name");
		l2=new Label("Roll No");
		l3=new Label("Dept");
		l4=new Label("Father Name");
		l5=new Label("Address");
		l6=new Label("city");
		
		t1=new TextField();
		t2=new TextField();
		t3=new TextField();
		t4=new TextField();
		t5=new TextField();
		t6=new TextField();
		
		Panel p=new Panel(new GridLayout(6,6));
		  	p.add(l1);
			p.add(t1);
			p.add(l2);
			p.add(t2);
			p.add(l3);
			p.add(t3);
			p.add(l4);
			p.add(t4);
			p.add(l5);
			p.add(t5);
			p.add(l6);
			p.add(t6);
			
			add(p);
			p.setBounds(200,300,220,120);
			setBackground(Color.cyan);
			b1=new Button("Submit");
			b2=new Button("Exit");
			add(b1);
			add(b2);
			/*Panel p1=new Panel(new GridLayout(1,1));
			          p1.add(b1);
			          p1.add(b2);
			          add(p1);*/
			b1.setBounds(200,460,100,40);
			b2.setBounds(300,460,100,40);
			b1.setBackground(Color.yellow);
			b2.setBackground(Color.yellow);
			
			         
				Choice c3=new Choice();
	      			c3.setBounds(240,100,100,75);
	         			c3.add("IT");
	         			c3.add("Cse");
	         			c3.add("Ece");
	         			c3.add("EEE");
	         			c3.add("Mech");
	        			 add(c3);
	         
				CheckboxGroup g=new CheckboxGroup();
				Checkbox c1=new Checkbox("Male",g,true);
				c1.setBounds(240,140,40,40);
				Checkbox c2=new Checkbox("Female",g,false);
				c2.setBounds(300,140,80,40);
				add(c1);
				add(c2);                    
		                 	          
				TextArea A=new TextArea("Student Details");
				A.setBounds(200,40,180,45);
				A.setForeground(Color.pink);
				add(A);
				
				Checkbox cb=new Checkbox("java");
				 Checkbox cb1=new Checkbox("C");
				 cb.setBounds(260,240,80,40);
				 cb1.setBounds(340,240,80,40);
				   add(cb);
				   add(cb1);
				 
			          
		           }
}
class demoframe6
{
	public static void main(String args[])
	  {
		sample s=new sample();
	  }
}