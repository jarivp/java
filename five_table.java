import java.util.Scanner;

public class five_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		int a=scan.nextInt();
		for(int i=0;i<=12;i++)
		{
			System.out.println(a+"*"+i+"="+a*i);

		}

	}

}
