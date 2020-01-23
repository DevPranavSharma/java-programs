import java.util.*;
class stud
{
int a;
static int b;
void getdata()
{
a=10;
b=5;

}
static void display2()
{
	stud ob=new stud();
	System.out.print(ob.a+" "+ob.b);
}

void display()
{
System.out.print(a+" "+b+" ");
}
public static void main(String x[])
{
stud s=new stud();
s.getdata();
s.display();
display2();

}
}