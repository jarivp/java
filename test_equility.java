import java.util.Scanner;
public class test_equility
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1=s.nextInt();
		System.out.println("Enter second number: ");
		int num2=s.nextInt();
		System.out.println("Enter third number: ");
		int num3=s.nextInt();
		System.out.println("Enter fourth number: ");
		int num4=s.nextInt();
		
		if(num1==num2&&num2==num3&&num3==num4)
		{
			System.out.println("Numbers are same");
		}
		else
		{
			System.out.println("Numbers are different");
		}
	}
}