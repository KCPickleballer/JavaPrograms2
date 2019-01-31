package com.DavidSchrik;
public class MegaBytesConverter {

        public static void main(String[] args) {
            // write your code here
            printMegaBytesAndKiloBytes(2000001);



        }


    }

    private static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megaBytes = kiloBytes / 1000000;
        int remKilobytes = kiloBytes % 1000000;

        System.out.println("megBytes = " + megaBytes );
        System.out.println("remainder = " + remKilobytes);

    }

}