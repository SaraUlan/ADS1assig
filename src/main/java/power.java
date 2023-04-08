import java.util.Scanner;

public class power {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int p = input.nextInt();
        int result = pow(num, p);
        System.out.print(result);
    }

    public static int pow(int num,int p) {
        if (p == 0) {
            return 1;
        }
        if (p == 1){
            return num;
        }
        else {
            return num * pow(num,p-1);
        }
    }
}
