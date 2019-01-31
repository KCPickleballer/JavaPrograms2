public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloByte(2050);
    }

    public static void printMegaBytesAndKiloByte(int kiloBytes){
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int remKilobytes = kiloBytes % 1024;

            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remKilobytes + " KB" );
        }
    }

}
