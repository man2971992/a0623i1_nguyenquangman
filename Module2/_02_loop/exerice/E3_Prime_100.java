//Hiển thị các số nguyên tố nhỏ hơn 100
//Trong phần này, chúng ta sẽ phát triển một ứng dụng cho phép hiển thị các số nguyên tố nhỏ hơn 100.

//        Số nguyên tố là một số nguyên dương chỉ chia hết cho 1 và chính nó.
public class E3_Prime_100 {
    public static void main(String[] args) {
        int i = 2;
        StringBuilder result = new StringBuilder();
        while (i < 100) {
            boolean check = true;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                }
            }
            if (check) {
                result.append(i).append(" ,");
            }
            i++;
        }
        System.out.println("các số nguyên tố nhỏ hơn 100: " + result);
    }
}
