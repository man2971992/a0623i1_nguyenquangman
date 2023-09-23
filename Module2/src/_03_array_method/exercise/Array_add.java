package _03_array_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Array_add {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 0, 0, 0};
        System.out.println("Nhập số cần chèn");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("Nhập vị trí cần chèn");
        int index = input.nextInt();
        System.out.println("Mảng trước khi thêm phần tử: " + Arrays.toString(arr));
        if (index > 0 && index < arr.length) {
            for (int i = arr.length - 1; i >= index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = number;
            System.out.println("Mảng sau khi thêm phần tử: " + Arrays.toString(arr));
        } else {
            System.out.println("Không chèn được vào mảng");
        }
    }
}
