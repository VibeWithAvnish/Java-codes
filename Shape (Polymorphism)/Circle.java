package practice;
import java.util.Scanner;

public class Circle extends Shape{
	public void getdata()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value of x: ");
		x = sc.nextInt();
	}
	public void computearea()
	{
		double area = Math.PI*x*x;
		System.out.println("Area of circle is: "+area);
	}

}
