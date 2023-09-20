import java.util.Scanner;

public class Array6_matrix {
    public static void main(String[] args) {

        //Tạo ma trận
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số hàng của ma trận: ");
        int w = input.nextInt();
        System.out.println("Nhập số cột của ma trận: ");
        int h = input.nextInt();
        double[][] matrix = new double[w][h];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = j;
            }
        }

        //Hiển thị ma trận vừa được tạo
        System.out.println("Ma trận vừa được tạo ra: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println(" ");
        }

        //Nhập cột cần tính tổng
        System.out.println("Nhập cột cần tính tổng: ");
        int col = input.nextInt();

        while (col < 0 || col > matrix[0].length) {
            System.out.println("Cột bạn muốn tính tổng không nào trong ma trận (cột từ 0 đến " + (matrix[0].length - 1) + ")");
            System.out.println("Mời bạn nhập lại cột");
            col = input.nextInt();
        }

        //Tính tổng giá trị của cột vừa nhập
        double sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == col) {
                    sum = sum + matrix[i][j];
                }
            }
        }
        System.out.println("Tổng giá trị các phần tử ở cột " + col + " là: " + sum);
    }
}
