import java.util.*;
class patthree
{

public static void main(String x[])
{
int i,n,j,k,m,o;
Scanner sc=new Scanner(System.in);
System.out.println("Enter n");
n=sc.nextInt();
m=1;
o=1;
for(i=1;i<=n;i++)
{
for(k=1;k<=m;k++)
	{System.out.print(o+" ");
o++;
}
m+=1;
System.out.println();
}
}
}