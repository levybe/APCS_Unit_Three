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
        int day = 22 + d + e;
        String month;
        if ((year == 1954) || (year == 1981) || (year == 2049) || (year == 2076)) {
            day-= 7;
        }
        if (day > 31) {
            return "In " + year + " Easter is on April " + (day - 31);
        }
        else {
            return "In " + year + " Easter is on March " + day;
        }
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