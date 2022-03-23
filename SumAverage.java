import java.util.Scanner;
public class SumAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,avg;
		int n=0,sum=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter five number: ");
		for(i=0;i<6;i++)
		{
			n=sc.nextInt();
			sum+=n;
		}
		avg=sum/5;
		System.out.println("Sum of numbers: "+sum);
		System.out.println("Average of numbers: "+avg);
	}

}
