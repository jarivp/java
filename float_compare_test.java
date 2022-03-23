import java.util.Scanner;

public class float_compare_test
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter floating number_1: ");
		double a=scan.nextDouble();
				
		System.out.println("Enter floating number_2: ");
		double b=scan.nextDouble();
		
		a=Math.round(a*1000);
		a/=1000;
		b=Math.round(b*1000);
		b/=1000;
		if(a==b)
		{
			System.out.println("Both are SAME");
		}
		else
		{
			System.out.println("Both are DIFFERENT");
		}
	}
}