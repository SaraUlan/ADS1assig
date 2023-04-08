import java.util.Scanner;

public class isPrime {
    private int sum = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String isPrime = isPrime(num);
        System.out.print(isPrime);
    }

    public static String isPrime(int num) {
        if (num < 2) {
            return "Composite";
        }
        if (num < 4) {
            return "Prime";
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return "Composite";
            }
        }
        return "Prime";
    }
}
