import java.util.*;
 class employee
{
    String name,address;
    int age,phoneno,salary;
    void printsalary()
     {
        System.out.println(salary); 
     }
  
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    officer o=new officer();
    Manager m=new Manager();
    o.input();
    o.specialization=sc.nextLine();
    m.input();
    m.Department=sc.nextLine();
    o.display();
    System.out.println(o.specialization);
    m.display();
    System.out.println(m.Department);
    
   }
  
  void input()
  { 
    Scanner sc=new Scanner(System.in);
    System.out.print("Name:");
    name=sc.nextLine();
    System.out.print("age:");
    age=sc.nextInt();
    System.out.print("Salary:");
    salary=sc.nextInt();
    System.out.print("Adress:");
    address=sc.next();
    System.out.print("Phone no:");
    phoneno=sc.nextInt();
     
  }
  void display()
  {
    System.out.println(name);
    System.out.println(age);
    System.out.println(salary);
    System.out.println(address);
    System.out.println(phoneno);

}
  
     
    
    
}

  class officer extends employee
    {
       String specialization;
    }
 
 class Manager extends employee
    {
      String  Department;
    }
