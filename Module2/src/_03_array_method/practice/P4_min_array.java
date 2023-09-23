package _03_array_method.practice;//Tìm giá trị nhỏ nhất trong mảng sử dụng phương thức
//Trong phần này, chúng ta sẽ phát triển một chương trình cho phép tìm kiếm giá trị nhỏ nhất trong một mảng cho trước.
//Bài tập này yêu cầu sử dụng một phương thức để giải quyết vấn đề. Phương thức được yêu cầu sẽ cần dữ liệu là một mảng các số, đầu ra của phương thức là một số trong mảng đó. Có thể sử dụng nguyên mẫu của phương thức như sau:

import java.util.Arrays;

public class P4_min_array {
    public static void main(String[] args) {
        int[] numbers = {5, 5, 1, 3, 9, 7, 1, 2, 12, 0, 10};
        System.out.println("Danh sách các phần tử trong mảng: " + Arrays.toString(numbers));
        System.out.print("Phần tử nhỏ nhất là: " + minValue(numbers));
    }

    public static int minValue(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }
}
