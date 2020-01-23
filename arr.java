import java.util.*;
class arr
{
void sum(int []k)
{
int s=0;
for(int i=0;i<5;i++)
{
s=s+k[i];
}
System.out.print(s);
}
public static void main(String x[])
{
arr a=new arr();
int[] inarray=new int[]{1,2,3,4,5};
a.sum(inarray);

}
}