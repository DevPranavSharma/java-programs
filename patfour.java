import java.util.*;
class patfour
{

public static void main(String x[])
{
int i,n,j,k,m,o;
Scanner sc=new Scanner(System.in);
System.out.println("Enter n");
n=sc.nextInt();
m=1;
o=n;
for(i=1;i<=n;i++)
{
o=n;
for(k=1;k<=m;k++)
	{System.out.print(o+" ");
o-=1;
}
m+=1;
System.out.println();
}
}
}