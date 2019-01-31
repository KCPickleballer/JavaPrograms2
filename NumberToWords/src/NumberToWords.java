public class NumberToWords {

    public static void main(String[] args) {
        numberToWords(0);

    }

    public static void numberToWords(int number){
        if (number < 0){
            System.out.println("Invalid Value");
        } else {
            int beginDigits = getDigitCount(number);
            //System.out.println(number + "begin digit count " + beginDigits);
            int revNum = reverse(number);

            //System.out.println(number + " rev number " + revNum);

            int padding = beginDigits - getDigitCount(revNum);
            if (number == 0)
                padding = 1;
           // System.out.println("padding " + padding);
            // padd leading zeros
            while (revNum != 0){

                switch (revNum % 10){
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }

                revNum /= 10;

            }
            for (int i=0; i<padding; i++){
                System.out.println("Zero");
            }
        }


    }

    public static int reverse(int number){
        int revNum = 0;
        int digit = 0;


        while (number != 0){
            digit = number % 10;
            revNum += digit;

            number /= 10;
            if (number != 0)
                revNum *= 10;
        }
        return revNum;

    }

    public static int getDigitCount(int number){
        if (number == 0)
            return 1;
        else if (number < 0)
            return -1;
        int digitCnt = 0;

        while (number != 0){
            number /= 10;
         //   if (number != 0)
                digitCnt++;
        }
        return digitCnt;
    }
}
