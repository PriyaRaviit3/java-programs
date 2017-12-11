import java.util.*;

class sample
 {
	LinkedList<String> l1=new LinkedList<String>();
	sample()
	  {
		l1.add("migen");
		l1.add("priya");
	   	l1.add("santhosh");
		l1.add("migen");
		l1.push("bavyaa");
		l1.pop();
		l1.remove("bavyaa");
		l1.set(0,"family");

		Iterator itr=l1.iterator();

		while(itr.hasNext())
		  {
			System.out.println(""+ itr.next());
		  }
	   }
 }

class linkedlist
 {
	public static void main(String args[])
	  {
		sample obj=new sample();
	   }
 }