package practice;

import java.util.Scanner;

public class polymorphism {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a;
		do {
			System.out.println("======Menu======");
			System.out.println("1.Area of circle");
			System.out.println("2.Area of Triangle");
			System.out.println("3.Area of Rectangle");
			System.out.println("4.Exit");
			a=sc.nextInt();
			Shape ref;
			switch(a)
			{
			case 1:
				ref=new Circle();
				ref.getdata();
				ref.computearea();
				break;
			case 2:
				ref = new Triangle();
				ref.getdata();
				ref.computearea();
				break;
			case 3:
				ref = new Rectangle();
				ref.getdata();
				ref.computearea();
				break;
			case 4:
				break;
			}
			
		}while(a!=4);

	}

}
