import java.util.*;
class twod2
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
static void addition(int [][]arr,[][]arr2,r)
{
int c[][]= new int[r][r]
for(int i=0;i<arr.length;i++)
{
for(int j=0;arr[i].length;j++)
{
c[i][j]=a[i][j]+b[i][j];
display(c);
}
}

}

public static void main(String x[])
{
int r,op;
Scanner sc=new Scanner(System.in);
r=sc.nextInt();
int a[][]=new int[r][r];
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a[i].length;j++)
{
	a[i][j]=sc.nextInt();
}
}
int b[][]=new int[r][r];
for(int i=0;i<b.length;i++)
{
for(int j=0;j<b[i].length;j++)
{
	b[i][j]=sc.nextInt();
}
}
switch(op)
{
case(1):addition(a,b,r);
break;
}
}
}