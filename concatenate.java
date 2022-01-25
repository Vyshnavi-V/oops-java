/*Java program to concatenate two numbers and strings using method
overloading concept.*/
class concatenate
{ 
  public static void main(String args[])
   {
   concatenate Obj=new concatenate();
   Obj.consum("2"+"0");
   Obj.consum("Vyshnavi"+" "+"V");
   }
  void consum(int a)
  {
   System.out.println("Concated number:" +a);
  }
  void consum(String a)
   {
    System.out.println("Concated String=" +a);
   }
}