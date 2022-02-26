import java.util.Scanner;

public class userexception{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the Account Balance : ");
        int balance = sc.nextInt();
        try{
        
        if(balance <= 500)
         throw new Exception();
        System.out.printf("Do you want to Add or Subtract Amount y/n : ");
        char ch = sc.next().charAt(0);    
        if(ch =='Y'|| ch=='y')
        {
            System.out.printf("Enter the Amount : ");
            int amount = sc.nextInt();
            System.out.printf("add or subtract : add/sub :");
            String str = sc.next();
            if(str.equals("add"))
            balance = balance + amount;
            else if(str.equals("sub"))
            balance = balance - amount;

            System.out.println("The Balance is "+ balance);
            
            if(balance <= 500)
            throw new Exception();
          
          
         }
        else
         System.exit(0);
    }catch(Exception e){System.out.println("Error 401: Balance less than 500");
}
          
        
    }
}
