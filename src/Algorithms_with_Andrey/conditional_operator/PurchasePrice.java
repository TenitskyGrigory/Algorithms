package Algorithms_with_Andrey.conditional_operator;

import java.util.Scanner;

/**
 * A pie in the dining room costs a rubles and b kopecks. Determine how many rubles and kopecks you need to pay for n pies.
 *
 * Input data
 * The program receives three numbers as input: a, b, n.
 *
 * Output data
 * The program should output two numbers: the purchase price in rubles and kopecks.
 */

public class PurchasePrice {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int valueA = intScanner.nextInt();
        int valueB = intScanner.nextInt();
        int valueC = intScanner.nextInt();

        int  valueD = valueA * valueC + (valueB * valueC / 100);
        int  valueF = valueB * valueC % 100;

        System.out.println(valueD + " " + valueF);
    }
}
