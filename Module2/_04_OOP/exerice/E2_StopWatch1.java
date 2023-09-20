import static java.lang.StrictMath.floor;

import java.util.Arrays;
import java.util.Date;

public class E2_StopWatch1 {
    private Date startTime, endTime;

    public E2_StopWatch1() {
        startTime = new Date();
    }

    public Date start() {
        return startTime = new Date();
    }

    public Date stop() {
        return endTime = new Date();
    }

    public long getElapsedTime() {
        return endTime.getTime() - startTime.getTime();
    }

    public static void main(String[] args) {
        double[] arr = new double[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = floor(Math.random() * 10000);
        }
        System.out.println("Mảng vừa tạo: " + Arrays.toString(arr));
        E2_StopWatch1 time = new E2_StopWatch1();
        selectionSort(arr);
        time.stop();
        System.out.println("Thời gian: " + time.getElapsedTime());
    }

    public static void selectionSort(double[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            int min_pos = i;
            for (int j = i; j < length; j++) {
                if (arr[min_pos] > arr[j]) {
                    min_pos = j;
                }
            }

            if (min_pos != i) {
                double tmp = arr[min_pos];
                arr[min_pos] = arr[i];
                arr[i] = tmp;
            }
        }
    }
}


