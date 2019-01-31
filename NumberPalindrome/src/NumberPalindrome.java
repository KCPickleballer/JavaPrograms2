public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println("is Palindrome? " + isPalindrome(-1221));

    }

    public static boolean isPalindrome(int number){
        int testNum = Math.abs(number);
        number = Math.abs(number);
        int reverse = 0;
        int digit = 0;

        while (number > 0) {
            digit = (number % 10);
            System.out.println("digit " + digit);
            reverse += digit;

            number /=  10;
            if (number > 0){
                System.out.println("reverse " + reverse);
                reverse *= 10;
            }

        }
        if ( testNum == reverse ) {
            System.out.println("testNum "+ testNum + " reverse " + reverse);
            return true;
        }
        else return false;

    }

}
