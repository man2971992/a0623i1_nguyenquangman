package practice;

import java.util.Scanner;

public class equation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập giá trị a");
        double a = input.nextDouble();
        System.out.println("Nhập giá trị b");
        double b = input.nextDouble();
        System.out.println("Nhập giá trị c");
        double c = input.nextDouble();
        if (a != 0) {
            System.out.println("Phương trình có nghiệm là x = " + (-b / a));
        } else {
            if (b == c) {
                System.out.println("Phương trình vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}
