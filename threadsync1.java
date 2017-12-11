class callme
 {
	synchronized public void call(int x,int y)
	{
		System.out.println("*"+(x+y));
		  try{
			Thread.sleep(2000);
		      }catch(InterruptedException e){}
		System.out.println("*");
	}
 }
class caller extends Thread
 {
	int x;
	int y;
	callme target;
	Thread t;
	
	  
	caller(callme targ,int x1,int y1)
	{
		target=targ;
		x=x1;
		y=y1;
		t=new Thread(this);
		t.start();
	}
	
	public void run()
	{
		target.call(x,y);
	}
 }

class threadsync1
 {
	public static void main(String args[])
	{
		callme target=new callme();
		caller obj1=new caller(target,1,1);
		caller obj2=new caller(target,2,2);
		caller obj3=new caller(target,3,3);
	}
 }		