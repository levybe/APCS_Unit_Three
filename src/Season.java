public class Season {
    public static String season (int month, int day) {
        if ((month < 1 || month > 12) || (day < 1 || day > 31)) { /* if the month is less than 1 or greater than 12, or if the day is less than 1 or greater than 31... */
            return "Invalid Input";
        }
        else if ((month >= 1 && month <= 3) || month == 12) { /* If the month ranges from December (12) to March (3)... */
            if (month == 12 && day >= 21) {
                return "Winter";
            }
        }
        else if () /* do Spring here */
    }
}
