import java.util.*;
class primesc
{
public static void main(String args[])
{
int i,a,b=0;
Scanner obj = new Scanner(System.in);
System.out.println("Enter a number :");
a=obj.nextInt();
if(a==0||a==1)
System.out.println("neither prime nor composite");
for(i=2;i<a;i++)
{
if(a%i==0)
{
b=1;
break;
}
}
if(b==1)
System.out.println("not prime");
else
System.out.println("prime");
}
}

