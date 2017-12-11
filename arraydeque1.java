import java.util.*;

public class arraydeque1
 {
	public static void main(String args[])
	  {
		Deque<String> q=new ArrayDeque<String>();

		q.add("hhh");
		q.add("iii");
		q.add("ooo");
	
		for(String s:q)         //for each
		  {
			System.out.println(s);
		   }
	   }
 }