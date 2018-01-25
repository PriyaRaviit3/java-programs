class sample
 {
	sample()
	 {
		for(int i=0;i<9;i++)
		 {
			if(i==3)
			{
				continue;
			 }
			System.out.println(i);
		  }
	 }
 }
class democontinue
 {
	public static void main(String args[])
	 {
		sample obj=new sample();
	 }
 }
		