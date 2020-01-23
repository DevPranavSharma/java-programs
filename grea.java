//using instance var to compare two numbers
import java.util.*;
class grea
{
int a,b;
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
grea ob=new grea();
System.out.print("Enter a");
ob.a=sc.nextInt();
System.out.print("Enter b");
ob.b=sc.nextInt();
if(ob.a>ob.b)
{
System.out.print(ob.a);
}
else
{ System.out.print(ob.b);}

}
}
