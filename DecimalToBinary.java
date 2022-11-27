package Day6Logical;

import java.util.Scanner;

public class DecimalToBinary {
    static void checkBinary(int number) {
            int binary[] = new int[10];
            int i = 0;
            while (number > 0) {
                int k = number % 2;
                binary[i++] = k;
                number = number / 2;
            }
            System.out.print("Binary Number is = ");
            for (int j = i - 1; j >= 0; j--)
                System.out.print(binary[j] + "");
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter any Number- ");
            int num =scanner.nextInt();
            checkBinary(num);
        }
    }
