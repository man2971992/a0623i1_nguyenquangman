package _04_oop.exercise;//package _04_class_and_object.exercise;

import java.util.Arrays;
import java.util.Date;

import static java.lang.StrictMath.floor;
import static java.lang.StrictMath.random;

public class E2_StopWatch {
    private Date startTime, endTime;

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public E2_StopWatch() {
        startTime = new Date();
    }

    public void start() {
        startTime = new Date();
    }

    public void stop() {
        endTime = new Date();
    }


    public long getElapsedTime() {
        return endTime.getTime() - startTime.getTime();
    }

    public static void main(String[] args) {

        double[] arr = new double[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = floor(random() * 1000);
        }
        System.out.println("Danh sách mảng trước khi sắp xếp");
        System.out.println(Arrays.toString(arr));
        E2_StopWatch sw = new E2_StopWatch();
        selectionSort(arr);
        sw.stop();
        System.out.println("Danh sách mảng sau khi sắp xếp");
        System.out.println(Arrays.toString(arr));
        System.out.print("Thời gian sắp xếp xong mảng: " + sw.getElapsedTime() + " ms");
    }

    public static void selectionSort(double[] array) {
        int min; // chỉ số phần tử nhỏ nhất trong dãy hiện hành
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[min])
                    min = j; // ghi nhận vị trí phần tử nhỏ nhất
            if (min != i) {
                double temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
    }
}