import java.io.*;	


	class sample
		{
		DataInputStream din=new DataInputStream(System.in);
		public void display()
			{
		try{
		float x=Float.valueOf(din.readLine()).floatValue();
		float y=Float.valueOf(din.readLine()).floatValue();
		float tot=x+y;
		System.out.println(tot);
			}catch(IOException d){}
			}

		}	
	class sampleinputdatastream1
		{
		public static void main(String args[])
			{
				sample obj=new sample();
				obj.display();
			}
		}
