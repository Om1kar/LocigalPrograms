package Day6Logical;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter NUmber to Check Prime Number");
        number = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2)
            System.out.println("Prime Number");
        else  System.out.println("Not a Prime Number");
    }
}
