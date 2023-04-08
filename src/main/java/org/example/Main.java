package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        int min = findM(arr,num);
        System.out.println(min);
    }
    public static int findM(int[] arr,int num){
        if(num < 2){
            return arr[0];
        }
        int min = findM(arr,num-1);
        if(arr[num-1] < min){
            min = arr[num-1];
        }
        return min;
    }
}