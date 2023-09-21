import java.util.Scanner;
//Chương trình chuyển đổi nhiệt độ
//Trong phần này, chúng ta sẽ phát triển một ứng dụng cho phép chuyển đổi nhiệt độ từ độ C sang độ F và ngược lại. Ứng dụng gồm một menu cho phép người dùng lựa chọn việc chuyển đổi nhiệt độ như sau:
//Công thức chuyển đổi: celsius = (5.0 / 9) * (fahrenheit - 32)
public class P4_convert_c_f {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        while (true) {
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.print("Enter your choice:");
            choice = input.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.print("Enter your Fahrenheit: ");
                    double fah = input.nextDouble();
                    System.out.println("Celsius: " + fahrenheitToCelsius(fah));
                    break;
                case 2:
                    System.out.print("Enter your Celsius: ");
                    double cel = input.nextDouble();
                    System.out.println("Fahrenheit " + celsiusToFahrenheit(cel));
                    break;
                default:
                    System.out.println("No choice !");
            }
        }
    }

    //Độ F sang độ C
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }

    //Độ C sang độ F
    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }
}
