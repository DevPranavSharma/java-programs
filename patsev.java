/*
will print 
 
    1
   212
  32123
   212
    1   

*/
import java.util.*;
class patsev
{

public static void main(String x[])
{
int i,n,k,m,o,j,p;
Scanner sc=new Scanner(System.in);
System.out.println("Enter n");
n=sc.nextInt();
m=1;
o=(n-1)/2;
for(i=1;i<=n;i++)
{ 
p=(m/2)+1;
	for(j=1;j<=o;j++)
	{System.out.print(" ");}
for(k=1;k<=m;k++)
	{System.out.print(p);
if(k<=m/2)
{p-=1;}
else
{p+=1;}
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