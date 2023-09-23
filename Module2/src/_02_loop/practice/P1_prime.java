package _02_loop.practice;

import java.util.Scanner;

//Bài thực hành 1:   Kiểm tra số nguyên tố
//Trong phần này, chúng ta sẽ phát triển một ứng dụng cho phép kiểm tra một số xem có phải là số nguyên tố hay không.
//Số nguyên tố là một số nguyên dương chỉ chia hết cho 1 và chính nó.
//Ứng dụng cho phép người dùng nhập vào một số và hiển thị kết quả là số đó là số nguyên tố hoặc không phải là số nguyên tố.
//* Với một số nguyên dương A lớn hơn 1, kiểm tra từ  2 đến căn bậc 2 của A, nếu A chia hết cho một số trong khoảng đó thì A không phải là số nguyên tố, ngược lại A là số nguyên tố.
public class P1_prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập 1 số để kiểm tra");
        int number = input.nextInt();
        boolean check = true;
        if (number >= 2) {
            int i = 2;
            while (i <= Math.sqrt(number)) { //Chỉ cần kiểm tra đến căng bậc 2 của number là đủ
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(number + " là số ngnuyên tố");
            } else {
                System.out.println(number + " không phải số nguyên tố");
            }
        } else {
            System.out.println(number + " không phải là số nguyên tố");
        }
    }
}
