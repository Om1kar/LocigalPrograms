package Day6Logical;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the change to be returned: Change");
        int Change = scanner.nextInt();
        int Five_hundred_rs_notes = 0;
        int Thousand_rs_notes = 0;
        int Hundred_rs_notes = 0;
        int Fifty_rs_notes = 0;
        int Ten_rs_notes = 0;
        int Two_rs_coins = 0;
        int One_rs_coin = 0;

        while (Change >= 1000) {
            Thousand_rs_notes = Thousand_rs_notes + 1;
            Change = Change - 1000;
        }
        while (Change >= 500) {
            Five_hundred_rs_notes = Five_hundred_rs_notes + 1;
            Change = Change - 500;
        }
        while (Change >= 100) {
            Hundred_rs_notes = Hundred_rs_notes + 1;
            Change = Change - 100;
        }
        while (Change >= 50) {
            Fifty_rs_notes = Fifty_rs_notes + 1;
            Change = Change - 50;
        }
        while (Change >= 10) {
            Ten_rs_notes = Ten_rs_notes + 1;
            Change = Change - 10;
        }
        while (Change >= 2) {
            Two_rs_coins = Two_rs_coins + 1;
            Change = Change - 2;
        }
        while (Change>=1) {
            One_rs_coin = One_rs_coin + 1;
            Change -= 1;
        }
        int TotalNotes = Thousand_rs_notes + Five_hundred_rs_notes + Hundred_rs_notes + Fifty_rs_notes + Ten_rs_notes;
        int TotalCoins = Two_rs_coins + One_rs_coin;
        System.out.println("Here is your change = " + "500rsNotes = " + Five_hundred_rs_notes + " " + "1000rsNotes = " + Thousand_rs_notes + " " + "100rsNotes = " + Hundred_rs_notes + " " + "50rsNotes = " + Fifty_rs_notes + " " + "10rsNotes = " + Ten_rs_notes + " " + "2rsCoin = " + Two_rs_coins + " " + "1rsCoins = " + One_rs_coin);
        System.out.println("Total Notes received = " + TotalNotes);
        System.out.println("Total coins received = " + TotalCoins);
    }
}
