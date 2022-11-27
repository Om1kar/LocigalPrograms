package Day6Logical;

import java.util.Scanner;

public class MonthlyPayment {
    /**
     * to calculate monthlyPayment that reads in three command-line arguments P, Y, and
     * R and calculates the monthly payments you would have to make over Y years to pay
     * off a P principal loan amount at R percent interest compounded monthly.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal Amount = ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate of Interest = ");
        double rate = sc.nextDouble();
        rate = (rate / 100) / 12;
        System.out.print("Enter Time period in years = ");
        double time = sc.nextDouble();
        time = time * 12;
        double p = (principal * rate) / (1 - Math.pow(1 + rate, -time));

        System.out.println("Monthly Payment= " + p + "Rs");

    }
}
