import java .util.*;
class strfreq
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter string");
String s=obj.nextLine();
int i,n,f=0;
char g[]=new char[100];
System.out.println("Enter the character");
String a=obj.nextLine();
n=s.length();
for(i=0;i<n;i++)
g[i]=s.charAt(i);
for(i=0;i<n;i++)
{
if(g[i]==a.charAt(0))
{
f++;
}
}
System.out.println("the frequency is"+f);
}}
