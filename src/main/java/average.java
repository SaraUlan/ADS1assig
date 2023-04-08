
import java.util.Scanner;

public class average {
    private int sum = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = input.nextInt();
        }
        double average = average(arr,num);
        System.out.println(average);
    }
    public static double average(int[] arr,int num) {
        if (num == 0) {
            return 0;
        }
        else {  return ((arr[num-1] + average(arr, num-1) * (num-1)) / num);}
    }
}