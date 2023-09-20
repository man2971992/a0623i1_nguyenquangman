import java.util.Arrays;
import java.util.Scanner;
//Xoá phần tử khỏi mảng
//Trong phần này, chúng ta sẽ phát triển một chương trình thực hiện xoá một phần tử được nhập vào từ bàn phím ra khỏi mảng, nếu phần tử đó xuất hiện trong mảng.

//        Vậy để thực hiện được việc xoá, trước tiên cần tìm xem phần tử đó có xuất hiện trong mảng hay không. Nếu xuất hiện cần chỉ ra vị trí của phần tử đó.

//        Việc xoá một phần tử trong mảng chính là thực hiện ghi đè phần tử đằng sau nó lên chính phần tử cần xoá.
public class Array_del {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 7, 8, 9, 0};
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập phần tử cần xóa");
        int del_number = input.nextInt();
        int index_s = 0;
        boolean check = false;
        //Tìm chỉ số index của phần tử cần xóa
        for (int i = 0; i < arr.length; i++) {
            if (del_number == arr[i]) {
                index_s = i;
                check = true;
            }
        }
        if (check) {
            System.out.println("Mảng trước khi xóa: " + Arrays.toString(arr));
            for (int j = index_s; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            System.out.println("Mảng sau khi xóa :" + Arrays.toString(arr));
        } else {
            System.out.println("Phần tử không có trong mảng");
        }
    }
}
