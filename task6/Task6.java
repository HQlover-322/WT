package task6;
import java.util.*;


public class Task6 {

	
	public static void main(String[] args)
	 {
		int[] array =  { 1, 2, 3, 4, 5, 6, 7, 8 ,9 };
		
		
		for (int y=0;y<array.length;y++)
			{for (int i=y;i<array.length;i++)
			 System.out.print(array[i]+" ");
				for (int j=0;j<y;j++)
				System.out.print(array[j]+" ");
			
			System.out.print("\n");
			}
	 }
}
