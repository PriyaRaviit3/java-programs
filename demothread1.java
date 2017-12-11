class sample extends Thread
{
	Thread t=new Thread(this);
     sample()
	{
	   //t.start();
	   System.out.println(""+t.getName());
	}

      public void run()
	{
	   for(int i=0;i<10;i++)
	   {
	   System.out.println("child thread"+i);

	   try{
	   	t.sleep(1000);
	   }catch(InterruptedException d){}

            }
	}
 }

class demothread1
 {
	public static void main(String args[])
	  {
	    
	        Thread t=Thread.currentThread();
	     
	        sample obj=new sample();
	        obj.start();
		{
	        for(int i=o;i<10;i++)
		{
		System.out.println("father="+i);
		}	
		try{
		    obj.join();
		    }catch(InterruptedException dd){}

	         sample obj1=new sample();
	         obj1.start();

		

	   }
 }