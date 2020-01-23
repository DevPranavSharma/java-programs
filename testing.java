
import java.util.*;

public class testing {
	public static void main(String x[])
	{
		int count=1;
		String S="";
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		StringBuilder sb=new StringBuilder(s);
		for(int i=0;i<sb.length();i++)
		{
			for(int j=i+1;j<sb.length();j++)
			{
				if(sb.charAt(i)==sb.charAt(j))
				{
					count++;
					sb.setCharAt(j,'!');
					
				}
			}
			if(sb.charAt(i)!='!')
			S=S+sb.charAt(i)+count;
			count=1;
			
		}
		System.out.println(S);
	}

}
