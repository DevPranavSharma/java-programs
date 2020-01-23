import java.util.*;
class twod
{

static void display(int [][]arr)
{
	for(int m[]:arr)
	{
		for(int n:m)
		{ System.out.print(n+" ");}
	System.out.println();
	}
}
public static void main(String x[])
{
int r,c;
Scanner sc=new Scanner(System.in);
r=sc.nextInt();
c=sc.nextInt();
int a[][]=new int[r][c];
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a[i].length;j++)
{
	a[i][j]=sc.nextInt();
}
}
display(a);
}
}