class sample
{
    int x,y;
    String name;
    sample()
    {
         
      
    }

}
class sample1 extends sample
{
        sample1(int c,int d)
         {
             x=c;
             y=d;
           int mul=c*d;
         System.out.println("to multiply the values"+mul);
       }
}
class sample2 extends sample
{
         sample2(String name)
          {
             super(c,d);
            System.out.println("student name is"+name);
          }
}
class arithcons
{
    public static void main(String args[])
    {
        sample2 obj=new sample2("gokul");
             
    }
}



                             
 


    