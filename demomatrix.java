import java.io.*;
class sample
{
	
	         DataInputStream din=new DataInputStream(System.in);
	          int i,j;
	sample()
	 {
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
			for(i=0;i<3;i++)
			   {
				for(j=0;j<3;j++)
				   {
				try{
					a[i][j]=Integer.valueOf(din.readLine()).intValue();
				      }catch(IOException d){}
				   }
			    }
			for(i=0;i<3;i++)
			   {
				for(j=0;j<2;j++)
				   {
				 try{
					b[i][j]=Integer.valueOf(din.readLine()).intValue();
				       }catch(IOException dd){}
				    }
			    }
			System.out.println(""+(a[i][j]+b[i][j]));
	}
 }
class demomatrix
 {
	public static void main(String args[])
	 {
		sample obj=new sample();
	 }
 }
			
