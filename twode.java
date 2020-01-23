import java.util.*;
class twode
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
static void addition(int [][]arr,int [][]arr2, int r)
{
int c[][]= new int[arr.length][arr.length];
for(int i=0;i<arr.length;i++)
{
for(int j=0;j<arr.length;j++)
{
c[i][j]=arr[i][j]+arr2[i][j];
}
}
display(c);
}
static void sub(int [][]arr,int [][]arr2, int r)
{
int c[][]= new int[arr.length][arr.length];
for(int i=0;i<arr.length;i++)
{
for(int j=0;j<arr.length;j++)
{
c[i][j]=arr[i][j]-arr2[i][j];
}
}
display(c);
}
static void promp()
{
	System.out.print(" ENTER 1 FOR ADDITION, ENTER 2 FOR SUBTRACTION AND 3 TO EXIT ");
	
}

public static void main(String x[])
{
int r,op;
boolean t=true;
Scanner sc=new Scanner(System.in);
System.out.print(" ENTER THE ROWS AND COLUMNS ");
r=sc.nextInt();
int a[][]=new int[r][r];
int b[][]=new int[r][r];
while(t)
{
	promp();
	op=sc.nextInt();
	
System.out.print(" ENTER THE FIRST MATRIX ");
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a[i].length;j++)
{
	a[i][j]=sc.nextInt();
}
}
display(a);
System.out.print(" ENTER THE SECOND MATRIX");
for(int i=0;i<b.length;i++)
{
for(int j=0;j<b[i].length;j++)
{
	b[i][j]=sc.nextInt();
}
}
display(b);

switch(op)
{
case(1):addition(a,b,r);
break;
case(2):sub(a,b,r);
break;
case(3):
t=false;
}
}
}
}