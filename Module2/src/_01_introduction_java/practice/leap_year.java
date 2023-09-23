package _01_introduction_java.practice;

import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập một năm để kiểm tra");
        int year = input.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) {
            System.out.println("Đây là năm nhuận");
        } else {
            System.out.println("Đây không phải năm nhuận");
        }
    }
}
