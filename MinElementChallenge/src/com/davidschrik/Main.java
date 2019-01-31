package com.davidschrik;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arrayInt = getIntegers(5);
        printArray(arrayInt);
        int minVal = getMin(arrayInt);
        System.out.println("min is " + minVal);

    }

    public static int[] getIntegers(int count){
        int[] array = new int[count];
        for (int i=0; i<count; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] arrayIn){
        for (int i=0; i<arrayIn.length; i++){
            System.out.println("arrayIn " + arrayIn[i]);
        }
    }

    public static int getMin(int[] array){
        int min = Integer.MAX_VALUE;
        for (int i=0; i <array.length; i++){
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }
}
