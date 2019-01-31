public class MinutesToDaysAndYears {

    public static void main(String[] args) {
        printYearsAndDays((525600 + 1440));

    }

    public static void printYearsAndDays(long minutes){
        if (minutes < 0 )
            System.out.println("Invalid Value");
        else {
            int yearsOut  = (int) minutes / 525600;
            int minRem = (int) minutes % 525600;
            int daysOut = (int) minRem / 1440;
            int minOut = (int) minRem % 1440;

            System.out.println(minutes + " min = " + yearsOut + " y and " + daysOut + " d");
        }

    }
}
