class sample
{
       int x;
       String str;
       double salary;
       float y;
       public void show(int x,String str)
         {
             this.x=x;
             this.str=str;
             this.salary=salary;
             this.y=y;
           System.out.println("num is"+x);
           System.out.println("name is"+str);
         }
     public void show2(int x)
        {
             System.out.println("num is"+x);
        }
     public void show3(double salary)
        {
             System.out.println("emp salary is"+salary);
        }
     public void show4(float y)
        {
             System.out.println("value is"+y);
        }
}
class sample1 extends sample
{
      public void show(int x,String str)
         {
             this.x=x;
             this.str=str;
             this.salary=salary;
             this.y=y;
            System.out.println("num is"+x);
            System.out.println("name is"+str);
         }
      public void show2(int x)
        {
             System.out.println("num is"+x);
        }
      public void show3(double salary)
        {
             System.out.println("emp salary is"+salary);
        }
      public void show4(float y)
        {
             System.out.println("value is"+y);
        }

}
class demooverride2
{
           public static void main(String args[])
              {
               sample ref;
               sample obj=new sample();
               sample1 obj1=new sample1();
               ref=obj;
               obj.show(22,"gokul");
               obj.show2(22);
               obj.show3(25000);
               obj.show4(2);
               ref=obj1;
               obj1.show(24,"ajith");
               obj1.show2(22);
               obj1.show3(15000);
               obj1.show4(4);	
              }
}
