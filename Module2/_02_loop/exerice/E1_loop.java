import java.util.Scanner;

//Hiển thị các loại hình
//Trong phần này, chúng ta sẽ phát triển một ứng dụng hiển thị một menu cho phép người dùng lựa chọn hiển thị các hình. Menu gồm các lựa chọn như sau
public class E1_loop {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.print("Enter a choice: ");
            choice = input.nextInt();
            switch (choice) {
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
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; i < 5; j++) {

                        }
                        System.out.println(" ");
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice !");
            }
        }
    }
}
