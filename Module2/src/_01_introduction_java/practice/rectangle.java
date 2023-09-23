package _01_introduction_java.practice;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        double d = input.nextDouble();
        System.out.println("Nhập chiều rộng: ");
        double r = input.nextDouble();
        double acreage = d * r;
        System.out.println("Diện tích hình chữ nhật là :" + acreage);
    }
}
