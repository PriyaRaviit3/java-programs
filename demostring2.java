class sample
{
	StringBuilder obj=new StringBuilder("gokulnath");
	public void show()
	    {
  		System.out.println(""+obj.reverse());
		obj.insert(2,'A');
		obj.append("sona");
		obj.delete(0,1);
		obj.deleteCharAt(0);
		obj.setCharAt(3,'s');
		int len=obj.length();
		obj.replace(0,1,"aj");
		int len1=obj.capacity();
		obj.trimToSize();
		obj.codePointAt(0);
		System.out.println(""+len1);
		System.out.println(""+len);
		System.out.println(""+obj);
	    }
}
class demostring2
{
	public static void main(String args[])
	   {
	           sample obj1=new sample();
		obj1.show();
	  }
}