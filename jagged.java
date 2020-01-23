import java.util.*;
class jagged
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
int r,c,count=1;
Scanner sc=new Scanner(System.in);
r=sc.nextInt();
int a[][]=new int[r][];
for(int k=0;k<a.length;k++)
{
a[k]=new int[k+1];
}
for(int i=0;i<a.length;i++)
{
count=0;
for(int j=0;j<a[i].length;j++)
{
	a[i][j]=count;
count++;
}
}
display(a);
}
}