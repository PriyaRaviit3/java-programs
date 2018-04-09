	class sample
	{
		public void display()
		{
			System.out.println("this is polymorphism");
		}

		public void display(String s, String m, String p)
		{
			System.out.println(s+m+p);
		}
		
		public void display(int x,int y)
		{
			System.out.println("sum="+(x+y));
		}
	}
	class demopoly
	{
		public static void main(String args[])
			{
				sample obj=new sample();
				obj.display();
				obj.display("salem","and","yercadu");
				obj.display(10,10);
			}
	}


