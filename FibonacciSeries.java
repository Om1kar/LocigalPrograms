package Day6Logical;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
      Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number of terms of fibonacci series - ");
        int number = scanner.nextInt();
        int a = 0;
        int b = 1;
        int c;
        System.out.println(a);
        System.out.println(b);
        for (int i = 3; i<= number; i++)
        {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
