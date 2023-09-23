package _03_array_method.practice;

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
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = {9, 10};
        System.out.println(m(arr));
        method(2);
    }

    //Hàm này có thể truyền vào một danh sách các tham số (không giới hạn) hoặc là một mảng
    static int m(int... x) {
        int b = 0;
        for (int a : x) {
            b += a;
        }
        return b;
    }

//    static void method1(int a) {
//    } //Do cùng kiểu dữ liệu nên không thể khai báo được hàm
//
//    static void method1(float a) {
//    }
//
//    static void method1(int c) {
//    }
//
//    static void method1(double d) {
//    }

    static void method() {
    }

    static void method(int x) {
        System.out.println("int x");
    }

    static void method(float x) {
        System.out.println("foat x");
    }

    static void method(int x, double y) {
    }

    //    static public void f(){
//
//    }
//    static void f() {}
//    public void static f() {} //Sai vì kiểu void phải nằm cuối cùng
//    public static void f() {
//    }
}

