package practice;

public class Bag {
	private double wt;
	private String color; 
	static private double totalwt;
	static private int objects;
	
	public Bag()
	{
		wt=3.5d;
		color = "red";
		totalwt =totalwt+wt;
		objects = objects+1;
	}
	
	public Bag(double wgt)
	{
		wt=wgt;
		color = "red";
		totalwt=totalwt+wt;
		objects = objects +1;
	}
	
	public Bag(String col)
	{
		color=col;
		wt=3.5d;
		totalwt=totalwt+wt;
		objects = objects+1;
	}
	
	public Bag(double wgt, String col)
	{
		color=col;
		wt=wgt;
		totalwt=totalwt+wt;
		objects=objects+1;
	}
	
	public void display()
	{
		System.out.println(wt+"\t"+color);
	}
	
	static public void output()
	{
		System.out.print("Total Weight of Bag is: ");
		System.out.println(totalwt);
		System.out.print("No. of balls in bag are: ");
		System.out.println(objects);
	}
	
	public void correction()
	{
		objects=objects-1;
		totalwt=totalwt-wt;
	}
	
	static public int count()
	{
		return objects;
	}

}
