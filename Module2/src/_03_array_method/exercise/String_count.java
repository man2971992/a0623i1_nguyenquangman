package _03_array_method.exercise;

import java.util.Scanner;
import java.util.*;

public class String_count {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "Nguyen Quang Man";
        char[] strings = str.toCharArray();
//        System.out.println(Arrays.toString(strings));

        System.out.println("Nhập 1 ký tự để kiểm tra");
        char s = input.next().charAt(0);

        int count = 0;
        for (int i = 0; i < strings.length; i++) {
            if (s == strings[i]) {
                count++;
            }
        }
        System.out.println("Ký tự " + s + " xuất hiện " + count + " lần trong chuổi " + str);
    }
}
