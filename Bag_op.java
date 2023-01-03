package practice;

import java.util.Scanner;

public class Bag_op {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bag S[]=new Bag[20];
		int choice=1;
		int c, sr, count;
		int i=0;
		double weight;
		String color;
		
		do
		{
			Bag temp;
			System.out.println("Enter 1 to insert ball");
			System.out.println("Enter 2 to delete ball");
			System.out.println("Enter 3 to display");
			System.out.println("\nEnter your choice");
			c=sc.nextInt();
			
			switch(c)
			{
			case 1:
				do {
				System.out.println("\nEnter 1 to Insert default ball") ;
				System.out.println("Enter 2 to Add ball with input weight ") ;
				System.out.println("Enter 3 to Add ball with input colour ") ;
				System.out.println("Enter 4 to Add ball with both inputs \n") ;
				System.out.println("Enter 0 to EXIT") ;
				System.out.print("Enter the choice : ") ;
				choice = sc.nextInt();
				switch(choice)
				{
				case 0:
					break;
				case 1: 
					S[i]=new Bag();
					i++;
					break;
				case 2:
					System.out.println("Enter the weight: ");
					weight = sc.nextDouble();
					S[i]=new Bag(weight);
					i++;
					break;
				case 3:
					System.out.println("Enter colour: ");
					color = sc.next();
					S[i]=new Bag(color);
					i++;
					break;
				case 4:
					System.out.print("Enter the Weight : ") ;
					weight = sc.nextDouble();
					System.out.print("Enter the color : ") ;
					color = sc.next();
					S[i] = new Bag (weight ,color );
					i++ ;
					break;
				case 5:
					System.out.println("Sr."+"\t"+"Weight"+"\t"+"colour") ;
					for(int j = 0 ; j < i ; j++)
					{
						System.out.print( j+1 + "." + "\t" );
						S[j].display();
					}
					Bag.output();
					break;
					default :
						System.out.println("Please enter valid option!");
						break;
				}
				}while(choice!=0);
				break;
				case 2:
					System.out.println("Enter serial number to delete the ball: ");
					sr=sc.nextInt();
					S[sr-1].correction();
					count=Bag.count();
					while(sr<=count)
					{
						S[sr-1]=S[sr];
						sr++;
					}
					System.out.println("Enter 0 to end operation");
					break;
				case 3:
					System.out.println("Sr."+"\t"+"Weight"+"\t"+"colour");
					count = Bag.count() ;
					for(int j = 0 ; j < count ; j++)
					{
						System.out.print( j+1 + "." + "\t" );
						S[j].display();
					}
					Bag.output();
					System.out.println("\nEnter 0 to End Operation");
					break;
					default :
						System.out.println("Please enter a valid option!");
						break;
			}
					
		}while(c!=0);
	}
}

