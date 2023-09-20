import java.util.Scanner;

public class P2_interest_moneys {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số tiền bạn gửi tiết kiệm: ");
        double money = input.nextDouble();
        System.out.print("Nhập số tháng bạn gửi: ");
        int month = input.nextInt();
        System.out.print("Nhập lãi xuất hàng năm: ");
        double rate = input.nextDouble();
        double moneys_interest = 0;
        for (int i = 0; i < month; i++) {
            moneys_interest += money * (rate / 100) / 12 * month;
        }
        System.out.print("Số tiền lãi bạn nhận được là: " + moneys_interest);
    }
}
