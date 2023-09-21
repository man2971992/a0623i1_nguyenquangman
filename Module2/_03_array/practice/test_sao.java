//Chiều cao h = 7
//        sssssss*
//        ssssss* *
//        sssss* * *
//        ssss* * * *
//        sss* * * * *
//        ss* * * * * *
//        s* * * * * * *
public class test_sao {
    public static void main(String[] args) {
        String star = "*"; //Tạo 1 biến chứa * ban đầu
        for (int i = 0; i < 7; i++) {
            String space = ""; //Khai báo biến space tại đây để gán lại khoảng trắng sau mỗi lần lặp
            for (int j = i; j < 7; j++) { //Cho j = i để tạo khoảng trắng giảm dần từ trên xuông dưới
                space += " "; //Tạo các khoảng trắng giảm dần từ trên xuống
            }
            System.out.println(space + star);
            star = "* " + star; //Xuống 1 hàng thì tăng lên 1 sao
        }
//        System.out.println(m(1, 2, 3));
    }

//    static int m(int... x) {
//        int b = 0;
//        for (int a : x) {
//            b += a;
//        }
//        return b;
//    }
}
