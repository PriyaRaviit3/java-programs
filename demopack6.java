import pack.man;

class sample extends man
  {
	public void show1()
	  {
		System.out.println();
	   }
  }
class demopack6
{
	public static void main(String args[])
	   {
		sample obj=new sample();
		obj.show1();
		obj.show(4,7);
	   }
 }