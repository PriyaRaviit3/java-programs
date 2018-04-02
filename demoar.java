import java.io.*;

class sample
 {
	int x[][]=new int[2][2];int y[][]=new int[2][2];tot[][]=new int[2][2];
	DataInputStream din;
	sample()
	 {
		din=new DataInputStream(System.in);
		System.out.println("Enter the matrix");
		for(int i=0;i<2;i++)
		  {
		    for(int j=0;j<2;i++)
		 	{
			try{
				x[i][j]=Integer.valueOf(din.readLine()).intValue();
			    }catch(IOException d){}
			}
			
			
		 }


		System.out.println("Enter the matrix");
		for(int i=0;i<2;i++)
		  {
		    for(int j=0;j<2;i++)
		 	{
			try{
				y[i][j]=Integer.valueOf(din.readLine()).intValue();
			    }catch(IOException d){}
			}
			
			
		 }
			for(int i=0;i<2;i++)
			 {
				for(int j=0;j,2;j++)
				 {
				tot[i][j]=x[i][j]+y[i][j];
				  }
 			  }
					System.ou.println(""+tot[i][j]);

		
	 }
 }
class demoar
 {
	public static void main(String args[])
	 {
		sample obj=new sample();
	 }
 }
