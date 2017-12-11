interface i
{
	public void b();
}
interface j extends i
{
	public void c();
}
interface k extends j
{
	public void d();
}
class a implements k
{
	a()
	{
		System.out.println("hiii");
	}
	public void b()
	{
		System.out.println("Hello");
	}
	public void c()
	{
		System.out.println("Welcome");
	}
	public void d()
	{
		System.out.println("Bye!Bye!");
	}
}
class demointerface
{
	public static void main(String args[])
	{
		a obj=new a();
		obj.b();
		obj.c();
		obj.d();
	}
}