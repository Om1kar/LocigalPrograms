package Day6Logical;

import java.util.Scanner;

public class StopWatch {
    static double start = 0;
    static double stop = 0;
    static void startTime() {
        start = System.currentTimeMillis();
        System.out.println("started at " + start);
    }
    static void stopTime() {
        stop = System.currentTimeMillis();
        System.out.println("stopped at " + stop);
    }
    static void elapsedTime() {
        System.out.println("elapsed time is " + (stop - start) / 1000);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter to start");
        scanner.next();
        startTime();
        System.out.println("Enter to stop");
        scanner.next();
        stopTime();
        elapsedTime();
    }
}
