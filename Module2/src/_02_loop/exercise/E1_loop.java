package _02_loop.exercise;

import java.util.Scanner;

//Hiển thị các loại hình
//Trong phần này, chúng ta sẽ phát triển một ứng dụng hiển thị một menu cho phép người dùng lựa chọn hiển thị các hình. Menu gồm các lựa chọn như sau
public class E1_loop {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.print("Enter a choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 5; j++) {
                            System.out.print("*\t");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 2:
                    System.out.println("Bottom-Left");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            if (i >= j)
                                System.out.print("*\t");
                            else
                                System.out.print("\t");
                        }
                        System.out.println(" ");
                    }
                    System.out.println("Bottom-Right");

                    for (int i = 5; i > 0; i--) {
                        for (int j = 1; j <= 5; j++) {
                            if (j - i >= 0)
                                System.out.print("*\t");
                            else
                                System.out.print("\t");
                        }
                        System.out.println(" ");
                    }

                    System.out.println("Top-Left");
                    for (int i = 5; i > 0; i--) {
                        for (int j = 1; j <= 5; j++) {
                            if (i - j >= 0)
                                System.out.print("*\t");
                            else
                                System.out.print("\t");
                        }
                        System.out.println(" ");
                    }

                    System.out.println("Top-Right");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            if (i - j <= 0)
                                System.out.print("*\t");
                            else
                                System.out.print("\t");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 3:
                    //Chiều cao h = 7
                    //        sssssss*
                    //        ssssss* *
                    //        sssss* * *
                    //        ssss* * * *
                    //        sss* * * * *
                    //        ss* * * * * *
                    //        s* * * * * * *
                    String star = "*"; //Tạo 1 biến chứa * ban đầu
                    for (int i = 0; i < 7; i++) {
                        String space = ""; //Khai báo biến space tại đây để gán lại khoảng trắng sau mỗi lần lặp
                        for (int j = i; j < 7; j++) { //Cho j = i để tạo khoảng trắng giảm dần từ trên xuông dưới
                            space += " "; //Tạo các khoảng trắng giảm dần từ trên xuống
                        }
                        System.out.println(space + star);
                        star = "* " + star; //Xuống 1 hàng thì tăng lên 1 sao
                    }
                    break;
                default:
                    System.out.println("No choice !");
            }
        }
    }
}
