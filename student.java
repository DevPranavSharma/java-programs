import java.util.*;
class student
{
int age;
static int count;
String name;
void getdata()
{
Scanner sc=new Scanner(System.in);
age=sc.nextInt();
sc.nextLine();
name=sc.nextLine();
count++;
}
void display()
{
System.out.print(age+" "+name);
}
public static void main(String x[])
{
student s=new student();
s.getdata();
s.display();
System.out.print(" "+count);

}
}