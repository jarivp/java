import java.util.Scanner;

public class circle_area
{
	static final double PI =3.14;
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		double a,r;
		
		System.out.println("Enter radius");
		Scanner s=new Scanner(System.in);
		r=s.nextInt();
		a=PI*r*r;
		System.out.println("Area of circle= "+a);
	}
}