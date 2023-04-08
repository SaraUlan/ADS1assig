import java.util.Scanner;

class Digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        String result = digits(str);
        System.out.println(result);
    }

    public static String digits(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return "No";
            }
        }
        return "Yes";
    }
}
