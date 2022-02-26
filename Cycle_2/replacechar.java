import java .util.*;
class replacechar
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter string");
String s=obj.nextLine();
int i,n,f;
char g[]=new char[100];
System.out.println("Enter the character to be repaced");
String a=obj.nextLine();
System.out.println("Enter the position");
f=obj.nextInt();
n=s.length();
for(i=0;i<n;i++)
g[i]=s.charAt(i);
for(i=0;i<n;i++)
{
if(i==f)
{
g[i]=a.charAt(0);
}
}
System.out.println("the new string is");
for(i=0;i<n;i++)
System.out.println(g[i]);
}}
