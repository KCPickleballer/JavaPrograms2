public class LeapYear {

    public static void main(String[] args) {

        boolean isLeap = isLeapYear(-1600);
        System.out.println("isLeapYeaqr " + isLeap);
    }

    public static boolean isLeapYear(int theYr ) {
        boolean isLeap = false;

        if (theYr < 1 || theYr > 9999) {
            isLeap = false;
        }
        else if  (  (theYr % 4 == 0 && theYr % 100 > 0) || theYr % 400 == 0 ) {
            isLeap = true;
        }
        return (isLeap);
    }
}
