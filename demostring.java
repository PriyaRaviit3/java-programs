class sample
{

	//int x=3;

	  StringBuilder sb=new StringBulider("Bavyaa");  
	
	  String obj=new String("Migen");

	  String obj1=new String("santhospriya");
       sample()
	     {
		System.out.println("Length of String="+obj.length());
		
		System.out.println("character of="+obj.charAt(1));

		System.out.println("trim of="+obj.trim());

		System.out.println("replace of="+obj.replace("g","i"));
		
		System.out.println("lowercase of="+obj.toLowerCase());
	      
		System.out.println("lowercase of="+obj.toUpperCase());

		String con=obj.concat(obj1);

		System.out.println(con);

		System.out.println("reverse="+sb.reverse());
	      }

 }
class demostring
  {
	public static void main(String args[])
	  {
		sample obj=new sample();
	  }
  }
