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
		for(int i=0;i<10;i++)
		 {
			System.out.println("child thread"+i);
			try{
				t.sleep(1000);
			      }catch(InterruptedException d){}
		 }
	 }
 }
class demothread
 {
	public static void main(String args[])
	 {
		sample obj=new sample();
		obj.run();
		
		Thread t=Thread.currentThread();
		for(int i=0;i<10;i++)
		 {
			System.out.println("main thread"+i);
			try{
				t.sleep(1000);
			      }catch(InterruptedException d){}
		 }
	 }
 }
		