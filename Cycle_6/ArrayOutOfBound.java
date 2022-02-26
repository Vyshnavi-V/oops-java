import java.util.Scanner;

public class ArrayOutofBound {
    public static void main(String args[]) {
        Scanner sc =  new Scanner(System.in); 
        int array[] = new int[3];
        System.out.printf("Enter the Elemnts of the array : " );
        try{
            for(int i =0; i<=array.length; i++)
            {
               array[i] = sc.nextInt();
            }
        }catch(ArrayIndexOutOfBoundsException e){System.out.println("Array out of Memory");}
        
    }
    
}
