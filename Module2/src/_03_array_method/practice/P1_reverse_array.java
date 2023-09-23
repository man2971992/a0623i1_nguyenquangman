package _03_array_method.practice;

import java.util.Arrays;
//Đảo ngược các phần tử của mảng
//Trong phần này, chúng ta sẽ xây dựng một ứng dụng cho phép đảo ngược thứ tự của các phần tử trong mảng.

//Ứng dụng cho phép nhập vào lần lượt các phần tử của một mảng (tối đa là 20 phần tử) và sau đó đảo ngược thứ tự của các phần tử.
public class P1_reverse_array {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        System.out.println("Mảng ban đầu: " + Arrays.toString(arr));
        //Chia đôi mảng và hoán đổi lần lược phần tử cuối với phần tử đầu
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i]; //Lưu phần tử đầu tiên vào biến temp
            arr[i] = arr[arr.length - 1 - i]; //Hoán đổi vị trí phần tử cuối vào phần tử đâ tiên
            arr[arr.length - 1 - i] = temp; //Gán lại giá trị cho phần tử cuối (trong biến temp)
        }
        System.out.println("Mảng sau khi đảo ngược " + Arrays.toString(arr));
    }
}
