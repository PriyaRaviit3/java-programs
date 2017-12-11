import pack1.hi;

class sample
  {
	public void show()
	    {
		System.out.println("form class");
	     }
   }
class demopack3
   {
	public static void main(String args[])
	     {
		sample obj=new sample();
		hi obj1=new hi();
		obj.show();
		obj1.mul(3,3);
		
	      }
   }