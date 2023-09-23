package _01_introduction_java.practice;

import java.util.Scanner;

public class days_of_month {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập một tháng để kiểm tra");
        byte month = input.nextByte();
        if (month > 0 && month <= 12) {
            switch (month) {
                case 2 -> System.out.println("Tháng có 28 hoặc 29 ngày");
                case 4, 6, 9, 11 -> System.out.println("Tháng có 30 ngày");
                default -> System.out.println("Tháng có 31 ngày");
            }
        } else {
            System.out.println("Tháng này không tồn tại");
        }
    }
}
