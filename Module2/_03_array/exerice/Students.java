import java.util.Arrays;
import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        System.out.println("Nhập số lượng sinh viên");
        Scanner input = new Scanner(System.in);

        //Nhập số lượng sinh viên cho lớp với điều kiện số lượng sinh viên phải >0 và <=30
        int quan_stu = input.nextInt();
        while (quan_stu <= 0 || quan_stu > 30) {
            System.out.println("Mời bạn nhập lại số lượng sinh viên (Tối đa 30 sv trên một lớp): ");
            quan_stu = input.nextInt();
        }

        //Nhập điểm cho sinh viên với điều kiện : điểm >=0 và <=10
        float[] students = new float[quan_stu];
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            do {
                System.out.println("Nhập điểm cho sinh viên thứ " + (i + 1) + " .Điểm phải >=0 và <10");
                students[i] = input.nextFloat();
            } while (students[i] < 0 || students[i] > 10);
        }

        System.out.println("Danh sách điểm của sinh viên: " + Arrays.toString(students));

        for (int i = 0; i < students.length; i++) {
            if (students[i] >= 5) {
                count++;
            }
        }
        System.out.println("Số lượng sinh viên thi đổ là: " + count);

    }
}
