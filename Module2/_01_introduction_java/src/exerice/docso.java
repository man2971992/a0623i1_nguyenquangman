package exerice;

import java.util.Scanner;

public class docso {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập 1 số: ");
        int num = input.nextInt();
        if (num >= 0 && num < 10) {
            switch (num) {
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
            }
        } else if (num >= 10 && num < 20) {
            switch (num) {
                case 10 -> System.out.println("Ten");
                case 11 -> System.out.println("Eleven");
                case 12 -> System.out.println("Twelve");
                case 13 -> System.out.println("Thirteen");
                case 14 -> System.out.println("Fourteen");
                case 15 -> System.out.println("Fifteen");
                case 16 -> System.out.println("Sixteen");
                case 17 -> System.out.println("Seventeen");
                case 18 -> System.out.println("Eighteen");
                case 19 -> System.out.println("Nineteen");
            }
        } else if (num >= 20 && num < 100) {
            int tens = num / 10;
            int one = num % 10;
            System.out.println(read(tens, one));
        } else if (num >= 100 && num < 1000) {
            int hundred = num / 100;
            int tens = num % 100;
            int ten = tens / 10;
            int one = tens % 10;
            String h = null;
            switch (hundred) {
                case 1 -> h = "one hundred";
                case 2 -> h = "two hundred";
                case 3 -> h = "three hundred";
                case 4 -> h = "four hundred";
                case 5 -> h = "five hundred";
                case 6 -> h = "six hundred";
                case 7 -> h = "seven hundred";
                case 8 -> h = "eight hundred";
                case 9 -> h = "nine hundred";
            }
            System.out.println(h + " and " + read(ten, one));

        } else {
            System.out.println("out of ability");
        }
    }

    static String read(int tens, int one) {
        String t = null, o = null;
        switch (tens) {
            case 2 -> t = "Twenty";
            case 3 -> t = "Thirty";
            case 4 -> t = "Forty";
            case 5 -> t = "Fifty";
            case 6 -> t = "Sixty";
            case 7 -> t = "Seventy";
            case 8 -> t = "Eighty";
            case 9 -> t = "Ninety";
        }
        switch (one) {
            case 0 -> o = "";
            case 1 -> o = "One";
            case 2 -> o = "Two";
            case 3 -> o = "Three";
            case 4 -> o = "Four";
            case 5 -> o = "Five";
            case 6 -> o = "Six";
            case 7 -> o = "Seven";
            case 8 -> o = "Eight";
            case 9 -> o = "Nine";
        }
        return t + " " + o;
    }
}
