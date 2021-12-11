package task1;
import java.util.Scanner;


public class task1 {
	
 	int x;
 	int y;
 
 public void dataentry()
 {
	 System.out.println("Enter x");
     this.x=(new Scanner(System.in)).nextInt();
     System.out.println("Enter y");
     this.y=(new Scanner(System.in)).nextInt(); 
 }
 public void calculation()
 {
	 System.out.print((1+Math.pow(Math.sin(this.x+this.y),2))/(2+Math.abs(this.x-((2*this.x)/(1+Math.pow(this.x, 2)*Math.pow(this.y, 2)))))+this.x);
 }
	
	public static void main(String[] args)
	 {
    task1 obj = new task1();
    obj.dataentry();
    obj.calculation();	   
	 }
}
