import java.util.*;
class mat
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter the number of rows :");
int r=obj.nextInt();
System.out.println("Enter the number of column :");
int c=obj.nextInt();
int a[][]=new int[10][10];
int max,i,j;
System.out.println("Enter the matrix :");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
a[i][j]=obj.nextInt();
}}
max=a[0][0];
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
if(a[i][j]>max)
max=a[i][j];
}}
System.out.println("Largest element in the matrix is :" +max);
}
}
