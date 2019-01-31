public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("is perfect  " + isPerfectNumber(5));
    }

    public static boolean isPerfectNumber(int number){
        if (number < 0)
            return false;

        int perfectChk = 0;
        int current = 0;

        for (int i=1; i < number; i++){
            current = number % i;
            if (current == 0){
                perfectChk += i;
            }
        }

        return (perfectChk == number);

    }
}
