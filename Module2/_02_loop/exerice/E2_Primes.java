//Hiển thị 20 số nguyên tố đầu tiên
//Trong phần này, chúng ta sẽ phát triển một ứng dụng cho phép hiển thị 20 số nguyên tố đầu tiên.
public class E2_Primes {
    public static void main(String[] args) {
        int count = 0, i = 0;
        StringBuilder result = new StringBuilder();
        while (count < 20) {

            //Kiểm tra 1 số có phải số nguyên tố hay không (giá trị số để kiểm tra lw trong biến i)
            if (i >= 2) {
                boolean check = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        check = false;
                    }
                }
                //Kiểm tra có đúng là số nguyên tố hay không và đẩy vào chuổi result và tăng count (count là số lượng số nguyên tố)
                if (check) {
                    result.append(i).append(", ");
                    count++;
                }
            }
            //Tăng i lên để kiểm tra các giá trị tiếp theo
            i++;
        }
        System.out.println("20 số nguyên tố đầu tiên là: " + result);
    }
}
