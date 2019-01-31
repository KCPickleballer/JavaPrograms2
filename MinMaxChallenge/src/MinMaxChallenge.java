import java.util.Scanner;

public class MinMaxChallenge {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter your name ");
        //String name = scanner.nextLine();
        int min = 99999999;
        int max = 0;
        //System.out.println("Your name is " + name);
        while (true) {
            System.out.println("Enter number (or q to quit): " );
            boolean isInt = scanner.hasNextInt();

            if (isInt) {
                int number = scanner.nextInt();
                if (number < min) {
                    min = number;
                }
                if (number > max){
                    max = number;
                }

            }
            else
                break;

            scanner.nextLine();
        }
        System.out.println("The min was: " + min + " the max was " + max);
        scanner.close();
    }



}
