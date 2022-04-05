import java.util.Scanner;

public class Exception 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int number= sc.nextInt();
		try
		{
			System.out.println(number/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae.toString());
		}
		System.out.println("Enter another value:");
		String s2 = sc.next();
		try
		{
			int num=Integer.parseInt(s2);
		}
		catch(NumberFormatException nfe)
		{
			System.out.println(nfe);
		}
		int a[] = new int[5];
		a[2]=6;
		}
}