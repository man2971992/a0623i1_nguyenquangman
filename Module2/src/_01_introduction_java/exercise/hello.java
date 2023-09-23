package _01_introduction_java.exercise;

import java.util.Scanner; //import tất cả các đối tượng vào file

public class hello {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hello: " + name);
    }
}
