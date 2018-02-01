interface one
{
 	public void getadd(int x,int y);
}
interface two
{
	public void gettwo(String str);
}
interface three extends two
{
	public void mul(int c,int d);
}
class sample
{
	public void getdata(double salary)
	  {
		System.out.println("super class"+salary);
	  }
}
class sample1 extends sample implements one,three
{
	public void getdata1()
	 {
		System.out.println("derived class");
	}
	public void getadd(int x,int y)
	{
		int z=x+y;
		System.out.println("to add the values"+z);
	}
	public void gettwo(String str)
	{
		System.out.println("name is"+str);
	}
	public void mul(int c,int d)
	{
		int e=c*d;
		System.out.println("multiply"+e);
	}
}
class demointerface
{
	public static void main(String args[])
	{
 	sample1 obj=new sample1();
		obj.getdata(25000);
		obj.getdata1();
		obj.getadd(25,55);
		obj.gettwo("gokul");
		obj.mul(24,56);

	}
}
	
	