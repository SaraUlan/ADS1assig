import java.util.Scanner;

class Permute {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        permute(str.toCharArray(), 0);
    }

    public static void permute(char[] arr, int ind) {
        if (ind == arr.length - 1) {
            System.out.println(new String(arr));
            return;
        }
        for (int i = ind; i < arr.length; i++) {
            swap(arr, ind, i);
            permute(arr, ind + 1);
            swap(arr, ind, i);
        }
    }

    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
