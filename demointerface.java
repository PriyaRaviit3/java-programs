interface one
{
	public void show();
}
interface two extends one
{
	public void show1();
}
interface three extends two
{
	public void show2();
}
class sample1 implements three
{
	sample1()
	 {
		System.out.println("migen");
	 }
	public void show()
	 {
		System.out.println("priya");
	 }
	public void show1()
	 {
		System.out.println("santhosh");
	 }
	public void show2()
	 {
		System.out.println("cute family");
	 }
}
class demointerface
{
	public static void main(String args[])
	{
		sample1 obj=new sample1();
		obj.show();
		obj.show1();
		obj.show2();
	}
}