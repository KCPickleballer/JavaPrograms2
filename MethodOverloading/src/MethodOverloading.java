public class MethodOverloading {

    public static void main(String[] args) {
        double centFromIn = calculateInchToCent(5,13);
        System.out.println("feet & inch = " + centFromIn);

        System.out.println("just inch " + calculateInchToCent(100));



    }

    public static double calculateInchToCent(double feetIn, double inchIn){
        if ((feetIn <0 || inchIn <0) || inchIn > 12){
            return -1;
        } else {
            double centFromIn = (feetIn * 12 * 2.54) + (inchIn * 2.54);
            return centFromIn;
        }

    }

    public static double calculateInchToCent( double inchIn){
        if (inchIn <0 ) {
            return -1;
        }
        else {
           double feet = (int) inchIn / 12;
           double inch = inchIn % 12;
           double centOut = calculateInchToCent(feet, inch );
            System.out.println("feet " + feet + " inches " + inch + " equals " + centOut + " Centimeters");

            return (centOut);

        }

    }

}
