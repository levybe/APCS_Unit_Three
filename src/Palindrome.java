import java.util.Scanner;
public class Palindrome {

    // Write your isPalindrome method in the space below. You do not need to write a main method for this program
    // Your method should be static.
    public static boolean isPalindrome(int number) {
        int num1, num2, num3, num4, num5;
        num1 = (number % 100000) / 10000;
        num2 = (number % 10000) / 1000;
        num3 = (number % 1000) / 100;
        num4 = (number % 100) / 10;
        num5 = number % 10;
        if (num1 == num5) {
            if (num2 == num4) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }

}
