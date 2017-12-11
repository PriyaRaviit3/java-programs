class callme
 {
	synchronized public void call(String msg)
	{
	System.out.println("*"+ msg);
	   try{
		Thread.sleep(1000);
	       }catch(InterruptedException e){}
	System.out.println("*");
	 }
 }
class caller extends Thread
 {
	callme target;
	String msg;
	Thread t;
 
	caller(callme targ,String s)
	{
		target=targ;
		msg=s;
		t=new Thread(this);
		t.start();
	}
	
	public void run()
	{
		target.call(msg);
	}
 }

class threadsync
 {
	public static void main(String args[])
		{
			callme target=new callme();
			caller obj1=new caller(target,"migen");
			caller obj2=new caller(target,"priya");
			caller obj3=new caller(target,"santhosh");
			caller obj4=new caller(target,"little family with full of love");
		}
 
 }
		
		

	