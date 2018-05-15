class democlone implements Cloneable
 {
	int rollno;
	String name;
	democlone(int rollno,String name)
	 {
		this.rollno=rollno;
		this.name=name;
	 }
	public Object clone()throws CloneNotSupportedException
	 {
		return super.clone();
	  }
	public static void main(String args[])
	 {
		try{
			democlone s1= new democlone(01, "Migen");
			democlone  s2=(democlone)s1.clone();
			democlone s3= new democlone(02, "Priya");
		    
			System.out.println(s1.rollno +""+ s1.name);
			System.out.println(s2.rollno +""+ s2.name);
			System.out.println(s3.rollno +""+ s3.name);
		     }catch(CloneNotSupportedException d){}
	   }

 }
 

