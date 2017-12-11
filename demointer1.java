//package pack;

interface one
  {
	public void show();
	default void doagain()
	{
		System.out.println("hi");
	}
	static int add(int x,int y)
	{
		int tot=x+y;
		return tot;
		System.out.println("enter the value="+tot);
	}

  }
 class demointer1 implements one
  {
	public void show()
	   {
		System.out.println("hello");
	    }
   }