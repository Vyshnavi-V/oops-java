import java.util.*;
class transpose
{
public static void main(String args[])
{
int m,n,i,j;
Scanner obj=new Scanner(System.in);
int a[][]=new int[100][100];
int t[][]=new int[100][100];
System.out.println("Enter the number of rows and column :");
m=obj.nextInt();
n=obj.nextInt();
System.out.println("Enter the matrix :");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=obj.nextInt();
}}


for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
t[i][j]=a[j][i];
}}
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.print(t[i][j]);

}
System.out.println("");

}
}}
