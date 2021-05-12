/*class ClassOne
{
     public static void main(String[] args)
     {
         ClassTwo.methodOfClassTwo();
     }
}
 
public class ClassTwo
{
     static void methodOfClassTwo()
     {
         System.out.println("From Class Two");
     }
}*/
class ClassOne{

static int globalVariable;
 
     static void methodOne()
     {
          int localToMethodOne = 0;
          System.out.println(localToMethodOne);
          System.out.println(globalVariable);
    //    System.out.println(localToMain);
     }
 
     public static void main(String[] args)
     {
          int localToMain = 0;
          System.out.println(localToMain);
          System.out.println(globalVariable);
     //System.out.println(localToMethodOne);
     }
}