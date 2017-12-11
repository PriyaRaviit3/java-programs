import pack.migen;

class sample extends migen
{
	public void display()
	   {
		System.out.println("hi migen1");
	    }
 }
class demopack4
{
	public static void main(String args[])
	    {
		sample obj=new sample();
		obj.display();
		obj.show();
	     }
 }