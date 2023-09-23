package _03_array_method.exercise;

import java.util.Scanner;

public class Array4_max {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int w, h;
        System.out.println("Nhập chều dài của ma trận");
        h = input.nextInt();
        System.out.println("Nhập chều rộng của ma trận");
        w = input.nextInt();
        double[][] arr = new double[h][w]; //Mảng 2 chiều

        double max = arr[0][0];
        //Lớp StringBuider là lớp kiểu chuổi có thể thay đôi được. Kiểu dữ liệu String là dạng đối tượng mạng không thay đổi đươc độ dài
        StringBuilder max_index = new StringBuilder();  //Tọa độ của phần tử lớn nhất (Dạng chuổi nối các tọa độ lại với nhau)
        //String max_index = ""; //Tọa độ của phần tử lớn nhất (Dạng chuổi nối các tọa độ lại với nhau) . Tương tự khai báo với kiểu StringBuilder
        //Thêm phần tử vào mảng
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhập phần tử thứ " + i + j);
                arr[i][j] = input.nextInt();
            }
        }
        //Hiển thị danh sách phần tử
        System.out.println("Danh sách phần tử trong mảng ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println(" ");
        }
        //Tim phân tử lớn nhất (max)
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max <= arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }

        //Tìm vị trí của các phần tử lớn nhất trong mảng (Đẩy tất cả tọa độ vào biến chuổi max_index)
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max == arr[i][j]) {
                    max_index.append(i).append("x").append(j).append(", ");
                    //max_index = max_index + i + "x" + j + ". "; //Tương tự dòng lệnh nối chuổi trên
                }
            }
        }
        System.out.println("Phần tử lớn nhất là: " + max + ". Nằm ở các vị trí: " + max_index);
    }
}
