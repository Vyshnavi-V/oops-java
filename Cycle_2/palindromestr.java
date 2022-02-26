import java.util.*;
class palindromestr
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter a string");
String s=obj.next();
String t=s;
int i,n;
n=s.length();
for(i=0;i<n;i++)
{
if(s.charAt(i)==t.charAt(n-i-1))
continue;
else
System.out.println("not palindrome");
break;
}
if(i==n)
System.out.println("palindrome");
}}

