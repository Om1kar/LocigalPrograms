package Day6Logical;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any Number");
        int number = scanner.nextInt();
        int reverse = 0;
        int remainder;
        int i = 0;
        while (i < number) {
            remainder = number % 10;
            number = number / 10;
            reverse = (reverse * 10) + remainder;
            i++;
        }
        System.out.println("Reverse Number = " + reverse);
    }
}
