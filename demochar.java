class sample
 {
	
	StringBuilder str=new StringBuilder("migan");
	sample()
	 {
		str.setCharAt(3,'e');
		System.out.println(""+str);
	 }
}
class demochar
 {
	public static void main(String args[])
	 {
		sample obj=new sample();
	}
}