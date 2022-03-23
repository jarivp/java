import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter first number");
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		System.out.println("Enter second number");
		int B=sc.nextInt();
		int C = A+B;
		System.out.println("The sum of two numbers is: "+C);

	}

}