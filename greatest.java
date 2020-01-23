import java.util.*;
class greatest
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
int a,b,c;
System.out.print("Enter a");
a=sc.nextInt();
System.out.print("Enter b");
b=sc.nextInt();
System.out.print("Enter b");
c=sc.nextInt();
if(a>b&&a>c)
{
	System.out.print(a);
}
if(b>a&&b>c)
{
	System.out.print(b);
}
if(c>b&&c>a)
{
	System.out.print(c);
}

}
}
