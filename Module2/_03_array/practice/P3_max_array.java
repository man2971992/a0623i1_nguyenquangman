import java.util.Arrays;

public class P3_max_array {
    public static void main(String[] args) {
        int[] numbers = {8, 2, 4, 1, 5, 6, 9, 11, 5, 7};
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Danh sách mảng: " + Arrays.toString(numbers));
        System.out.println("Phần tử lớn nhất là: " + max);
    }
}
