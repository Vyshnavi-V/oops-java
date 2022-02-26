import java.util.Scanner;
class palindromesc
{
public static void main(String args[])
{
int a,r,org,rev=0;
System.out.println("Enter the number :\n");
Scanner obj=new Scanner(System.in);
a=obj.nextInt();
org=a;
while(a>0)
{
r=a%10;
rev=(rev*10)+r;
a=a/10;
}
if(org==rev)
System.out.println("palindrome");
else
System.out.println("not palindrome");

}
}
