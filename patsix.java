/*
will print 
   *
  ***
 *****
  ***
   *


*/

import java.util.*;
class patsix
{

public static void main(String x[])
{
int i,n,k,m,o,j;
Scanner sc=new Scanner(System.in);
System.out.println("Enter n");
n=sc.nextInt();
m=1;
o=(n-1)/2;
for(i=1;i<=n;i++)
{
	for(j=1;j<=o;j++)
	{System.out.print(" ");}
for(k=1;k<=m;k++)
	{System.out.print("*");
}
for(j=1;j<=o;j++)
	{System.out.print(" ");}
if(i<=n/2)
{o-=1;
m+=2;}
else
{o+=1;
m-=2;}
System.out.println();
}
}
}