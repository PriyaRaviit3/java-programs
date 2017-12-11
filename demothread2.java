class sample implements Runnable
  {
	Thread t=new Thread(this);
	sample()
	  {
		//t.start();
		System.out.println(""+t.getName());
	   }

	public void run()
	  {
		for(int i=1;i<=10;i++)
		 {
			System.out.println("child="+i);
		   	try{
				t.sleep(1000);
			    }catch(InterruptedException d){}
		  }
           }
	   
  }
class demothread2

  {
	public static void main(String args[])
	  {
		sample obj=new sample();
		obj.start();
		
		Thread t=Thread.currentThread();
		for(int i=0;i<10;i++)
		  {
			System.out.println("father="+i);
		 try{
			t.sleep(1000);
		      }catch(InterruptedException dd){}
		   }
		 	
	        
		//sample obj1=new sample();
		//obj1.start();
	  }
 }