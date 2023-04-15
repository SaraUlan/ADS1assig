import java.util.Scanner;

public class Fib {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int Fib = Fib(num);
        System.out.print(Fib);
    }

    public static int Fib(int num) {
        if (num < 2) {
            return num;
        }
        return Fib(num - 1) + Fib(num-2);
    }
}
