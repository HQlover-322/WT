package task5;
import java.util.*;
public class Task5 {
	
	void calculate(int[]array)
	{
		
	}
	public static void main(String[] args)
	 {
		ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(74,58,2,69,30,50,39,94,88));// {1,3,4,5,9}; //3,1,2,6,8,4,11,5,16  //46,30,25,57,100,97,50,78,8 |25,57,100| // 74,58,2,69,30,50,39,94,88 |2,30,39,94
		for (int var :array)
		{
			System.out.println(var);
		}
	//	System.out.println(array.size());
int count=0;	
		for (int y=1;y<array.size()-1;y++)
		for (int i=1;i<array.size()-1;i++)
			if(array.get(i-1)>array.get(i))
				{
				array.remove(i);
				i=2;
				count++;
				}
		if(array.get(0)>array.get(1))
			{
			array.remove(0);
			count++;
			}
		if(array.get(array.size()-1)<array.get(array.size()-2))
			{
			array.remove(array.size()-1);	
			count++;
			}
	for (int var :array)
	{
		System.out.print(var+" ");
	}
	System.out.print("COUNT"+count);

}
}
