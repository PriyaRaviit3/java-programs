interface one
{
	public void show();
}
interface two extents one
{
	public void show1();
}
interface three extends two
{
	public void show2();
}
class sample1 implements three
{
	sample()
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
class sample
{
	public static void main(String args[])
	{
		sample obj=new sample();
	}
}