public class LoneTeen {

    // In the space below, write the loneTeen method. Make sure the signature matches
    // the one given in the instructions.
    public static boolean loneTeen (int int1, int int2) {
        if ((int1 >= 13 && int1 <= 19) && (int2 >= 13 && int2 <= 19)) {
            return false;
        }
        else if ((int1 >= 13 && int1 <= 19) || (int2 >= 13 && int2 <= 19)) {
            return true;
        }
        else {
            return false;
        }
    }
}
