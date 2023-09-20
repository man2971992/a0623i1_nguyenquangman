import java.util.Scanner;

public class Main_QuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập a");
        double a = input.nextDouble();
        System.out.println("Nhập b");
        double b = input.nextDouble();
        System.out.println("Nhập c");
        double c = input.nextDouble();
        QuadraticEquation pt1 = new QuadraticEquation(a, b, c);
        System.out.println(pt1.getDiscriminant());
        if (pt1.getDiscriminant() > 0) {
            System.out.println("Phương trình có 2 nghiệp");
            System.out.println("x1 = " + pt1.getRoot1());
            System.out.println("x2 = " + pt1.getRoot2());
        } else if (pt1.getDiscriminant() == 0) {
            System.out.println("Phương trình có nghiệp kép");
            System.out.println("x1 = x2 =  " + pt1.getRoot1());
        } else {
            System.out.println("Phương trình vô nghiệm ");
        }
    }
}

