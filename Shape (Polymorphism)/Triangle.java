package practice;

public class Triangle extends Shape {
	@Override
	public void computearea()
	{
	double area = 0.5*x*y;
	System.out.println("Area of triangle is : "+area);
	}
}
