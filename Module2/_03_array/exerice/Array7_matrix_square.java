import java.util.Scanner;

public class Array7_matrix_square {
    public static void main(String[] args) {

        //Tạo ma trận
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập kích thước ma trận");
        int lenght = input.nextInt();
        int[][] matrix = new int[lenght][lenght];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = j;
            }
        }

        //Hiện thị ma trận và tính tổng đường chéo chinh
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
                if (i == j) {
                    sum = sum + matrix[i][j];
                }
            }
            System.out.println(" ");
        }
        System.out.println("Tổng đường chéo chính của ma trận là: " + sum);
    }
}
