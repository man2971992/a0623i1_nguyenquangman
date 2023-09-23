package practice;

import java.util.Scanner;

public class Rectangle {
    double width, height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "practice.Rectangle{" + "width=" + width + ", height=" + height + "}";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your practice.Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the practice.Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the practice.Rectangle: "+ rectangle.getArea());
    }
}
