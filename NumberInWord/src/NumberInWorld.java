public class NumberInWorld {

    public static void main(String[] args) {
     //   printNumberInWorld(2);
        int sumVal = 0;
        int iCnt = 0;
        for (int i = 1; i < 1001; i++){
            if (i % 3 == 0 && i % 5 == 0) {
                sumVal += i;
                iCnt++;
            }
            if (iCnt == 5)
                break;

        }
        System.out.println("this is the sum "+ sumVal);
        System.out.println("sum " + sumOdd(1,100));


        }

    public static boolean isOdd(int num){
        if (num > 0 && num % 2 == 1)
            return true;
        else
            return false;

    }
    public static int sumOdd(int start, int end){
        int sumVal = 0;
        if (start < 0 || end < 0 || start > end)
            return -1;


        for (int i = start;i <= end; i++  ){
            if (isOdd(i)){
                sumVal += i;
            }

        }
        return sumVal;
    }

    public static void printNumberInWorld(int num){

        switch (num){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
             default:
                 System.out.println("Invalid Number");


        }
    }
}
