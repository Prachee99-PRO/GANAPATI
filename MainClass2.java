class A
{
     int i;
 
     {
          System.out.println("First IIB Block");
     }
 
     {
          System.out.println("Second IIB Block");
     }
 
     A(int j)
     {
          this();
          System.out.println("First Constructor");
     }
 
     A()
     {
          System.out.println("Second Constructor");
     }
}
 
class MainClass2
{
     public static void main(String[] args)
     {
          A a = new A(50);
     }
}