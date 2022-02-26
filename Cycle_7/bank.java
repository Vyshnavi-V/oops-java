class Bank {
 
   
    int total = 100;

 
    void withdrawn(String name, int withdrawal)
    {
        if (total >= withdrawal) {
            System.out.println(name + " withdrawn "
                               + withdrawal);
 
            total = total - withdrawal;
            System.out.println("Balance after withdrawal: "
                               + total);
         
 
            // Try block to check for exceptions
            try {
 
                // Making thread t osleep for 1 second
                Thread.sleep(1000);
            }
 
            // Catch block to handle the exceptions
            catch (InterruptedException e) {
 
                e.printStackTrace();
            }
        }
 
      
        else {
 
            // Print statements
            System.out.println(name
                               + " you can not withdraw "
                               + withdrawal);
 
            System.out.println("your balance is: " + total);
 
            try {
                Thread.sleep(1000);
            }
 
            catch class Bank {
 
   
    int total = 100;

 
    void withdrawn(String name, int withdrawal)
    {
        if (total >= withdrawal) {
            System.out.println(name + " withdrawn "
                               + withdrawal);
 
            total = total - withdrawal;
            System.out.println("Balance after withdrawal: "
                               + total);
         
 
            // Try block to check for exceptions
            try {
 
                // Making thread t osleep for 1 second
                Thread.sleep(1000);
            }
 
            // Catch block to handle the exceptions
            catch (InterruptedException e) {
 
                e.printStackTrace();
            }
        }
 
      
        else {
 
            // Print statements
            System.out.println(name
                               + " you can not withdraw "
                               + withdrawal);
 
            System.out.println("your balance is: " + total);
 
            try {
                Thread.sleep(1000);
            }
 
            catch (InterruptedException e) {
 
                e.printStackTrace();
            }
        }
    }
 
    void deposit(String name, int deposit)
    {
        System.out.println(name + " deposited " + deposit);
        total = total + deposit;
        System.out.println("Balance after deposit: "
                           + total);
        // Making the thread sleep for 1 second after
        // each deposit
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
// Class 2

class bank{
 
    // Main driver method
    public static void main(String[] args)
    {
 
        // Creating object of class 1 inside main()
        Bank obj = new Bank();
 class Bank {
 
   
    int total = 100;

 
    void withdrawn(String name, int withdrawal)
    {
        if (total >= withdrawal) {
            System.out.println(name + " withdrawn "
                               + withdrawal);
 
            total = total - withdrawal;
            System.out.println("Balance after withdrawal: "
                               + total);
         
 
            // Try block to check for exceptions
            try {
 
                // Making thread t osleep for 1 second
                Thread.sleep(1000);
            }
 
            // Catch block to handle the exceptions
            catch (InterruptedException e) {
 
                e.printStackTrace();
            }
        }
 
      
        else {
 
            // Print statements
            System.out.println(name
                               + " you can not withdraw "
                               + withdrawal);
 
            System.out.println("your balance is: " + total);
 
            try {
                Thread.sleep(1000);
            }
 
            catch (InterruptedException e) {
 
                e.printStackTrace();
            }
        }
    }
 
    void deposit(String name, int deposit)
    {
        System.out.println(name + " deposited " + deposit);
        total = total + deposit;
        System.out.println("Balance after deposit: "
                           + total);
        // Making the thread sleep for 1 second after
        // each deposit
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
// Class 2

class bank{
 
    // Main driver method
    public static void main(String[] args)
    {
 
        // Creating object of class 1 inside main()
        Bank obj = new Bank();
 
        // Custom input - Transactions
        obj.withdrawn("Vyshnavi", 20);
        obj.withdrawn("Reshma", 40);
        obj.deposit("Shivan", 35);
        obj.withdrawn("Anjali", 80);
        obj.withdrawn("Karthik", 40);
    }
}
        // Custom input - Transactions
        obj.withdrawn("Vyshnavi", 20);
        obj.withdrawn("Reshma", 40);
        obj.deposit("Shivan", 35);
        obj.withdrawn("Anjali", 80);
        obj.withdrawn("Karthik", 40);
    }
}(InterruptedException e) {
 
                e.printStackTrace();
            }
        }
    }
 
    void deposit(String name, int deposit)
    {
        System.out.println(name + " deposited " + deposit);
        total = total + deposit;
        System.out.println("Balance after deposit: "
                           + total);
        // Making the thread sleep for 1 second after
        // each deposit
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
// Class 2

class bank{
 
    // Main driver method
    public static void main(String[] args)
    {
 
        // Creating object of class 1 inside main()
        Bank obj = new Bank();
 
        // Custom input - Transactions
        obj.withdrawn("Vyshnavi", 20);
        obj.withdrawn("Reshma", 40);
        obj.deposit("Shivan", 35);
        obj.withdrawn("Anjali", 80);
        obj.withdrawn("Karthik", 40);
    }
}
