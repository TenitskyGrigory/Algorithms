import java.util.Scanner;

/**
 * For this number n, calculate the sum 4(1-1/3+1/5-1/7+...+(-1) n/(2n+1)).
 *
 * Input data
 * One number n is entered, not exceeding 100000.
 *
 * Output data
 * It is necessary to output the value of the expression.
 */

public class Amount2 {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int n = intScanner.nextInt();
        int sumN = 1;
        int value = 1;

        for (int i = 0; i < n; i++) {
            sumN = sumN * value;
            value = value + 1;
        }

        System.out.println(sumN);
    }
}
