//Tìm giá trị nhỏ nhất trong mảng sử dụng phương thức
//Trong phần này, chúng ta sẽ phát triển một chương trình cho phép tìm kiếm giá trị nhỏ nhất trong một mảng cho trước.
//Bài tập này yêu cầu sử dụng một phương thức để giải quyết vấn đề. Phương thức được yêu cầu sẽ cần dữ liệu là một mảng các số, đầu ra của phương thức là một số trong mảng đó. Có thể sử dụng nguyên mẫu của phương thức như sau:

import java.util.Arrays;

public class p4_min_array_nhap {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 4, 6, 9, 7, 5, 10, 3, 8};
        int min = minVaue(numbers); //Chỉ số index của phân tử nhỏ nhất
        System.out.println("Danh sách các phân tử trong mảng: " + Arrays.toString(numbers));
        System.out.print("Phần tử nhỏ nhất là: " + numbers[min]);
//        int[] a = {1, 9, 3, 2};
//        for (int i = 0; i < a.length - 1; i++) {
//            for (int j = i + 1; j < a.length; j++) {
//                if (a[i] < a[j]) {
//                    int x = a[i];
//                    a[i] = a[j];
//                    a[j] = x;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(a));
    }

    //Hàm trả về chỉ số index của phần tử nhỏ nhất
    public static int minVaue(int[] arr) {
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[index]) {
                index = i;
            }
        }
        return index;
    }
}
