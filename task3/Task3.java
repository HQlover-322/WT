package task3;
import java.util.Scanner;
public class Task3 {

	int currentX;
	int lastX;
	int step;
	void calculate()
	{
	while (currentX<=lastX)	
	{System.out.printf("x= %d\t F(x)= %f \n",currentX,Math.tan(currentX));
	currentX+=step;
	}
	}
	
	
	public static void main(String[] args)
	 {
		Scanner scan = new Scanner(System.in);
		Task3 obj = new Task3();
		System.out.println("Enter start X");
		obj.currentX= scan.nextInt();
		System.out.println("Enter end X");
		obj.lastX= scan.nextInt();
		System.out.println("Enter step");
		obj.step= scan.nextInt();
		obj.calculate();
	 }
}
