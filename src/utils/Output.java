package utils;

import java.util.Arrays;

public class Output {

    public static void printIntArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void printTitleAndIntArray(String title,int[] array){
        System.out.println(title + ":" + Arrays.toString(array));
    }

}
