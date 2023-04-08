import java.util.Scanner;

public class BinomCoef {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int k = input.nextInt();
        int result = binom(num, k);
        System.out.print(result);
    }

    public static int binom(int num,int k) {
        if (k == 0) {
            return 1;
        }
        if (k == num){
            return 1;
        }
        else {
            return binom(num-1,k-1) +binom(num-1,k);
        }
    }
}
