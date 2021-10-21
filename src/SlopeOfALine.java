import java.util.Scanner;
public class SlopeOfALine {

    /**
     * Calculates slope (y2-y1)/(x2-x1) of a line as long as x2 - x1 != 0
     * @param x1 - x-coordinate of first point
     * @param y1 - y-coordinate of first point
     * @param x2 - x-coordinate of second point
     * @param y2 - y-coordinate of second point
     * @return - Different strings based on whether the line is vertical or not
     */
    public static String slope(int x1, int y1, int x2, int y2) {
        double slope = (double) (y2 - y1) / (x2 - x1);
        // update the line below to return a properly formatted string
        if (x2 - x1 != 0) {
            return "The line defined by the points (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") has a slope of " + slope;
        }
        else {
            return "The line defined by the points (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is a vertical line and the slope is undefined";
        }
    }

    public static void main(String[] args) {
        // Get input from the user (you will need to create a Scanner object)
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x1:");
        int x1 = scan.nextInt();
        System.out.println("Enter y1:");
        int y1 = scan.nextInt();
        System.out.println("Enter x2:");
        int x2 = scan.nextInt();
        System.out.println("Enter y2:");
        int y2 = scan.nextInt();
        // Call and print the result of the slope method as shown in the instructions.
        System.out.println(slope(x1, y1, x2, y2));
    }
}
