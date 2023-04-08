import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int result = gcd(a, b);
        System.out.print(result);
    }

    public static int gcd(int a,int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }
}
