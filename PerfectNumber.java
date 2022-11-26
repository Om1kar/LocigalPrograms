package Day6Logical;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Enter the Number to check perfect number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == number) {
            System.out.print(number + " = a perfect number");
        } else {
            System.out.println(number +" = not a perfect number");
        }
    }
}

