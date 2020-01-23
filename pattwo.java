import java.util.*;
class pattwo
{

public static void main(String x[])
{
int i,n,j,k,m,o;
Scanner sc=new Scanner(System.in);
System.out.println("Enter n");
n=sc.nextInt();
m=1;
o=n-1;
for(i=1;i<=n;i++)
{
	for(j=1;j<=o;j++)
	{System.out.print(" ");
}
for(k=1;k<=m;k++)
	{System.out.print("*");
}
m+=1;
o-=1;
System.out.println();
}
}
}