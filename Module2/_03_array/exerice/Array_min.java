import java.util.Arrays;
import java.util.Scanner;

public class Array_min {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử mảng");
        int quan_element = input.nextInt();
        int[] arr = new int[quan_element];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ " + i);
            arr[i] = input.nextInt();
        }
        System.out.println("Danh sách phần tử mảng vừa nhập:" + Arrays.toString(arr));

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Phần tử nhỏ nhất là: " + min);
    }
}
