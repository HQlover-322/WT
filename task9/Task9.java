package task9;

import java.util.*;

public class Task9 {

	
	public static void main(String[] args)
	 {
		System.out.println("Enter the number of balls");
		Scanner scan = new Scanner(System.in);
		int countBalls = scan.nextInt();
		Basket basket = new Basket();
		for(int i=0;i<countBalls;i++)
		{
			System.out.println("Enter the weight and color of the ball");
			basket.AddBall(new Ball(scan.nextInt(),scan.next()));
		}
		
		System.out.println("Sum weight "+basket.GetWeight()+" Count Blue "+basket.CountBlue());
		
	 }
}
