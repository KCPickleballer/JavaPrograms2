import java.util.Scanner;

public class ReadingUserInput{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter your name ");
        //String name = scanner.nextLine();
        int count = 1;
        int sum = 0;
        //System.out.println("Your name is " + name);
        while (count < 11) {
            System.out.println("Enter number #: " + count);
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;

            }
            else
                System.out.println("Invalid Number");


        }
        System.out.println("The sum of your 10 numbers is " + sum );
        scanner.close();
        }


}
