class sample
 {
	int rollno,age;
	String name;
	public void display(int rollno,int age,String name)
	 {
		this.rollno=rollno;
		this.age=age;
		this.name=name;
		System.out.println(rollno);
		System.out.println(age);
		System.out.println(name);
	
	 }
	
 }
class demothis
 {
	public static void main(String args[])
	 {
		sample obj=new sample();
		obj.display(4,4,"bavyaa");
	 }
		
 }