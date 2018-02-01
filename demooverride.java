class sample
{
     public void show(String str)
      {
        System.out.println("super class"+str);
      }
 }
class sample1 extends sample
{
      public void show(String str)
      {
        System.out.println("derived class"+str);
      }
}
class demooverride
{
      public static void main(String args[])
       {
          sample ref;
          sample obj=new sample();
          sample1 obj1=new sample1();
           ref=obj;
           obj.show("gokul");
           ref=obj1;
           obj1.show("salem");
        }
}