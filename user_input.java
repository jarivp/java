import java.util.Scanner;

public class user_input 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int number= sc.nextInt();
		System.out.println(number/0);
		
		System.out.println("Enter another value:");
		String s2 = sc.next();
		int num=Integer.parseInt(s2);
	}

}
