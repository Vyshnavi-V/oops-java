import java.util.*;
class factorialsc
{
public static void main(String args[])
{
int n,i,f=1;
System.out.println("Enter the number :\n");
Scanner obj=new Scanner(System.in);
n=obj.nextInt();
System.out.println("Factorial="+n+"is");
for(i=1;i<=n;i++)
{
f*=i;
}
System.out.println(+f);
}
}
