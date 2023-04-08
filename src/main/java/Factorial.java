import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int Factor = Factor(num);
        System.out.print(Factor);
    }

    public static int Factor(int num) {
        if (num < 2) {
            return 1;
        }
        return num * Factor(num - 1);
    }
}
