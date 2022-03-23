import java.util.Scanner;
public class convertion {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value in Inches: ");
		double inch=sc.nextDouble();
		double cm = 2.54*inch;
		System.out.println("Value in cm: "+cm);

	}

}
