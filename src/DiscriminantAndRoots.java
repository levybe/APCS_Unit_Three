import java.util.Scanner;
public class DiscriminantAndRoots {

    // Create the method roots in the space below.
    public static String roots(int a, int b, int c) {
        double number = (b * b) - 4 * a * c;
        if (number > 0) {
            return a + "x^2 + " + b + "x + " + c + " has 2 real roots";
        }
        else if (number == 0) {
            return a + "x^2 + " + b + "x + " + c + " has 1 real root";
        }
        else {
            return a + "x^2 + " + b + "x + " + c + " has 2 imaginary roots";
        }
    }
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        System.out.println(roots(a, b, c));
    }

}
