import java.util.*;
class multmat
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
int m,n,p,q,k,i,j;
int a[][]=new int[100][100];
int b[][]=new int[100][100];
int c[][]=new int[100][100];
System.out.println("Enter the number of rows and column of matrix 1 :");
m=obj.nextInt();
n=obj.nextInt();
System.out.println("Enter the number of rows and column of matrix 2 :");
p=obj.nextInt();
q=obj.nextInt();
if(n==p)
{
System.out.println("Enter the matrix 1 :");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=obj.nextInt();
}}
System.out.println("Enter the matrix 2 :");
for(i=0;i<p;i++)
{
for(j=0;j<q;j++)
{
b[i][j]=obj.nextInt();
}}
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
for(k=0;k<n;k++)
{
c[i][j]=c[i][j]+a[i][k]*b[k][i];
}}}
for(i=0;i<m;i++)
{
for(j=0;j<q;j++)
{
c[i][j]=a[i][j]+b[i][j];
}}
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.print(c[i][j]);
}
}}
else
System.out.println("not possible");
}}
