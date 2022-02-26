import java .util.*;
class charsearch
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter string");
String s=obj.nextLine();
int i,n,flag=0;
System.out.println("Enter the character to be searched");
String a=obj.nextLine();
n=s.length();
for(i=0;i<n;i++)
{
if(s.charAt(i)==a.charAt(0))
{
System.out.println("character found");
flag=1;
break;
}
}
if(flag==0)
System.out.println("not founnd");
}}
