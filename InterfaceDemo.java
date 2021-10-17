package Oops;

 interface InterfaceDemo
{
   public static final int a =10;    // default p s f  are by jvm
   public void show ();
}

interface  I2
{
   void display();
}
class Test implements InterfaceDemo, I2
{
   public void show()
   {
      System.out.println("1");
   }

   public void display()

   {
      System.out.println("2");
   }
   public static void main(String[] args)
   {
    Test t = new Test();
    t.show();
    t.display();
    t.show();

   }
}
