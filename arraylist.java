import java.util.*;

class sample
 {
	ArrayList a1=new ArrayList();
	sample()
	  {
		a1.add(2);
		a1.add(3);
		a1.add(6);

		Iterator itr=a1.iterator();
		
		while(itr.hasNext())
		  {
			System.out.println(""+itr.next());
		  }
	  }
 }
class arraylist
 {
	public static void main(String args[])
	  {
		sample obj=new sample();
	   }
 }