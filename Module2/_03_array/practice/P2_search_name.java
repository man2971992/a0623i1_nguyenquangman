import java.util.Objects;
import java.util.Scanner;

public class P2_search_name {
    public static void main(String[] args) {
        String[] arr = {"Thang", "Minh", "Hieu", "Thuan", "Thong", "Man"};
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập tên để kiểm tra: ");
        String name = input.nextLine();
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(name)) { //Phương thức equals() so sánh hai chuỗi đưa ra dựa trên nội dung của chuỗi. Nếu hai chuỗi khác nhau nó trả về false. Nếu hai chuỗi bằng nhau nó trả về true.
                System.out.println("Tên " + name + " nằm ở vị trí " + i + " trong danh sách");
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy tên " + name + " trong danh sách");
        }
    }
}
