//Java program to create a class employee with details such as empno, name and phone number. Read details of at least 5employees and print
import java.util.*; 
class emp
 { 
  public static void main(String args[])
   {
    try (Scanner obj = new Scanner(System.in)) {
        for(int i=1;i<=5;i++)
        { 
          System.out.println("Details of employee "+i);
          System.out.println("Enter the employee number:");
          obj.nextInt();
          System.out.println("Enter the employee Name:");
          obj.next();
          System.out.println("Enter the employee's phone number:");
          obj.next();
        }
    }
   }
}
    
