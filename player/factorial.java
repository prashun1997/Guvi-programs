import java.util.*;
import java.io.*;
class Factorial
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if (n>=0)
		{
		long f=1;
		for (int i=1;i<=n;i++)
			f*=i;
		System.out.println(f);
		}
		else
		{
			System.out.println("0");
		}
	}
}
