import java.util.Scanner;
public class EasterDate {

    public static boolean isValidYear(int year) {
        if ((year >= 1900) && (year <= 2099)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static String dateOfEaster (int year) {
        int a = year % 19;
        int b = year % 4;
        int c = year % 7;
        int d = (19*a + 24) % 30;
        int e = (2*b + 4*c + 6*d + 5) % 7;
        String month;
        if ((year == 1954) || (year == 1981) || (year == 2049) || (year == 2076)) {
            e -= 7;
        }
        if (e == 0) {
            d -= 1;
            e = 31;
        }
        if (d == 3) {
            month = "March";
        }
        else if (d == 4) {
            month = "April";
        }
        else {
            month = "SOMETHING'S WRONG";
        }
        return "In " + year + " Easter is on " + month + " " + (22 + d + e);

    }

    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter a year between 1900 and 2099");
        int year = scan.nextInt();
        if (isValidYear(year)) {
            System.out.println(dateOfEaster(year));
        }
        else {
            System.out.println("You have entered an invalid year");
        }
    }
}