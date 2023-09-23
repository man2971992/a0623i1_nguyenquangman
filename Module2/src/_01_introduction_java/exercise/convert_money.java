package _01_introduction_java.exercise;

import java.util.Scanner;

public class convert_money {
    public static void main(String[] args) {
        System.out.println("Mời bạn nhập số tiền cần chuyển đổi (USD)");
        Scanner input = new Scanner(System.in);
        double usd = input.nextDouble();
        double money_convert = usd * 23000;
        System.out.println(usd + " USD = " + money_convert + " VND");
    }
}
