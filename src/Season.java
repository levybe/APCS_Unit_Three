public class Season {
    public static String season (int month, int day) {
        String season = "";
        if ((month < 1 || month > 12) || (day < 1 || day > 31)) { /* if the month is less than 1 or greater than 12, or if the day is less than 1 or greater than 31, then return "Invalid Input" */
            season = "Invalid Input";
        }
        else if (month == 12) { /* If the month is 12 and the day is greater than or equal to 21, then return the season as Winter. */
            if (day >= 21) {
                season = "Winter";
            }
        }
        else if (month >= 1 && month <= 3) { /* If the month is between 1 and 3, and the date is less than or equal to March 19th, then return the season as Winter. */
            if (month != 3 || day <= 19) {
                season = "Winter";
            }
        }
        else if ((month == 3 && day > 19) ) { /* If the month is */

        }
        return season;
    }
}
