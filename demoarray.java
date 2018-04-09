import java.io.*;
import java.util.*;


class sample
 {
	int x[]=new int[5];
	DataInputStream din=new DataInputStream(System.in);
	
	sample()
	  {
		for(int i=0;i<10;i++)
		  {
			try{
			    x[i]=Integer.valueOf(din.readLine()).intValue();
			   }catch(IOException d){}
		   }
		
	   }
 }
class demoarray
 {
	public static void main(String args[])
	  {
		sample obj=new sample();
	  }
 }
