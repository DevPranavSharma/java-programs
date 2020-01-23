import java.util.*;
class obb
{
int a;
 void display()
{
System.out.print("Hello"+" "+a);
System.out.println();
}
void input()
{
a=10;
}
public static void main(String x[])
{
obb ob=new obb();
ob.input();
ob.display();
//un-named object
new obb().input();
new obb().display();
}
}