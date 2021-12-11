package task4;

public class Task4 {
	
	void isSimpe(int num,int pos) {
	boolean isContinue=true;
	for (int i=2; i<=num/2 && isContinue; i++) {
      int temp = num % i;
    if (temp == 0) 
	  isContinue=false;
	}
    if(isContinue)
	  System.out.printf("Simple pos = %d \n",pos);
  }
	public static void main(String[] args)
	 {
		Task4 obj = new Task4();
		int[] array = new int[] {4,2,3,6,7,13};
		for(int i=0;i<array.length;i++)
			obj.isSimpe(array[i], i+1);
	 }
}
