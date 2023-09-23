package _03_array_method.exercise;

import java.util.Arrays;

public class Array_mer {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9};
        int arr_new_lenght = arr1.length + arr2.length;
        int[] arr3 = new int[arr_new_lenght];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            arr3[arr1.length + j] = arr2[j];
        }
        System.out.println("Mảng 1: "+Arrays.toString(arr1));
        System.out.println("Mảng 2: "+Arrays.toString(arr2));
        System.out.println("Mảng sau khi gộp: "+Arrays.toString(arr3));
    }
}
