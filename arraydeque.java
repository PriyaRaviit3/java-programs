import java.util.*;


public class ArrayDeque
 {
	public static void main(String args[])
	  {
		ArrayDeque<String> q=new ArrayDeque<String>();

		q.add("hhh");
		q.add("iii");
		q.add("ooo");
	
		for(String s:q)
		  {
			System.out.println(s);
		   }
	   }
 }

