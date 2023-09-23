package _04_oop.exercise;

import java.util.Scanner;

public class E1_QuadraticEquation {
    private double a, b, c;

    public E1_QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return (this.b * this.b) - (4 * this.a * this.c);
    }

    public double getRoot1() {
        return (-this.b + Math.pow(getDiscriminant(), 0.5)) / (2 * this.a);
    }

    public double getRoot2() {
        return (-this.b - Math.pow(getDiscriminant(), 0.5)) / (2 * this.a);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập a");
        double a = input.nextDouble();
        System.out.println("Nhập b");
        double b = input.nextDouble();
        System.out.println("Nhập c");
        double c = input.nextDouble();
        E1_QuadraticEquation pt1 = new E1_QuadraticEquation(a, b, c);
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
