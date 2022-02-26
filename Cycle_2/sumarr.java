import java.util.*;
class sumarr
{
public static void main(String args[])
{
int i,n,s=0;
int a[]=new int[100];
Scanner obj=new Scanner(System.in);
System.out.println("Enter the number of elements");
n=obj.nextInt();
System.out.println("Enter the elements :");
for(i=0;i<n;i++)
a[i]=obj.nextInt();
for(i=0;i<n;i++)
s=s+a[i];
System.out.println("sum is"+s);
}
}
