//unboxing and boxing
class box
{
public static void main(String x[])
{
float a=2.5f;
//because of type casting
Float j=a;
Float k= Float.valueOf(a);
System.out.print(a+" "+j+" "+k +" ");
Integer d=new Integer(5);
int b=d;
int c=d.intValue();
System.out.print(d+" "+b+" "+c+" ");
char t='a';
Character l=t;
Character m=Character.valueOf(t); 
System.out.print(t+" "+m+" "+l+" ");

}
}