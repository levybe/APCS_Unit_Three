import java.util.Scanner;
public class AddToPositiveOrNegativeSum {
    public static void main(String[] args) {
        // declare and instantiate a Scanner variable and object
        Scanner scan = new Scanner(System.in);
        // declare and initialize variables for a positive and negative sum
        int positiveSum = 0, negativeSum = 0, number;
        for (int i = 1; i <= 10; i++) {
            /* in this block, allow the user to input a number and add the number to the appropriate sum */
            System.out.println("Enter a number: ");
            number = scan.nextInt();
            if (number > 0) {
                positiveSum += number;
            }
            if (number < 0) {
                negativeSum += number;
            }
        } // end of for loop

        // output the sums. Make sure the format matches the sample
        System.out.println("The sum of the positive numbers is " + positiveSum);
        System.out.println("The sum of the negative numbers is " + negativeSum);
    }
}

