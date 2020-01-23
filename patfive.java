import java.util.*;
class patfive
{

public static void main(String x[])
{
int i,n,j,k,m,o,p,q;
Scanner sc=new Scanner(System.in);
System.out.println("Enter n");
n=sc.nextInt();
m=1;
o=1;
q=o;
for(i=1;i<=n;i++)
{
o=q;
p=n-1;
for(k=1;k<=m;k++)
	{System.out.print(o+" ");
o+=p;
p=p-1;
}
m+=1;
q+=1;

System.out.println();
}
}
}