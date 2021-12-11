package task9;

import java.util.ArrayList;

public class Basket {
		ArrayList<Ball> balls = new ArrayList<Ball>();
		public void AddBall (Ball ball) 
		{
			balls.add(ball);
			System.out.println("The ball is added to the basket");
		}
		public int GetWeight()
		{
			int sumWeight=0;
			for(Ball ball: balls)
			{
				sumWeight+=ball.weight;
			}
			return sumWeight;
		}
		public int CountBlue ()
		{
			int count=0;
			for(Ball ball: balls)
			{
				if(ball.color.equals("Blue"))
					count++;
			}
			return count;
		}		
	
}
