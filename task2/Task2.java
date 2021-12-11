package task2;

import java.util.Scanner;

public class Task2 {
	public class Square
	{
		int startXPoint;
		int endXPoint;
		int y;
		int aboveZero;
		void dataentry()
		{
			Scanner scan = new Scanner (System.in);
			System.out.println("Enter x start point");
		     this.startXPoint=scan.nextInt();
		     System.out.println("Enter x end point");
		     this.endXPoint=scan.nextInt(); 
		     System.out.println("Enter y");
		     this.y=scan.nextInt();
		     this.aboveZero= this.y>0?1:0;
		}
		boolean isOnSurface(Point point)
		{
			if((point.x>=this.startXPoint)&&(point.x<=this.endXPoint))
				switch(aboveZero)
				{
				case 1: if((point.y<=this.y)&&(point.y>=0)) return true; else return false; 
				case 0: if((point.y>=this.y)&&(point.y<=0)) return true; else return false; 
				default: return false;
				}
			else return false;
		}
	}
	
	public class Point
	{
		int x;
		int y;
		public Point()
		{
		System.out.println("Enter x for point");
		this.x=(new Scanner (System.in).nextInt());
		System.out.println("Enter y for point");
		this.y=(new Scanner (System.in).nextInt());
		}
	}
		public static void main(String[] args)
		 {
			Task2 instance = new Task2();
		Square square1= instance.new Square();
		square1.dataentry();
		Square square2= instance.new Square();
		square2.dataentry();
		Point point = instance.new Point();
		
		if(square1.isOnSurface(point))
			System.out.println("True");
		else System.out.println(square2.isOnSurface(point));
		 }
	}



