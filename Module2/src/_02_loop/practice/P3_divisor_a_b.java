package _02_loop.practice;

import java.util.Scanner;

public class P3_divisor_a_b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        int a = input.nextInt();
        System.out.print("Nhập số b: ");
        int b = input.nextInt();
        a = Math.abs(a); //Trả về giá trị tuyệt đối của a (Ví dụ: Math.abs(-10) trả về 10)
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.print("Không có ước chung");
        } else {
            System.out.print("ước chung lớn nhất của " + a + " và " + b + " là: ");
            while (a != b) {
                if (a > b)
                    a = a - b;
                else
                    b = b - a;
            }
            System.out.println(a);
        }
    }
}
