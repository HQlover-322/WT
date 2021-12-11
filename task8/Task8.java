package task8;

public class Task8 {
    public static void checkTwoArrays(){ //z8
        int[] arr = { 1,2,3,5,7,8,10};
        int[] arr2 = { 1,2,3,4,6,8,10};

        for (int i = 0; i < arr.length; i++) {
            if(i==0){
                if(arr[i] >= arr2[i])
                    System.out.print("1:1");
            }else {
                System.out.println("");
                for (int j = 0; j < arr.length; j++)
                    if(arr[i] >= arr2[j] && arr[i-1] <= arr2[j])
                        System.out.print((i+1) + ":" + (j+1) + " ");
            }
        }
    }
}
