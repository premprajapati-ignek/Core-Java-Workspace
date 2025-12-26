package com.ignek.core.java.logical;

import java.util.Arrays;

public class Searching {
    public static int linearSearch(int[] array, int key){
        for (int i = 0; i < array.length; i++) {
            if (key == array[i]){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int key){
        int low = 0;
        int high = array.length-1;

        while (low <= high){
            int mid = (low + high)/2;

            if (key == array[mid]){
                return mid;
            } else if (key < array[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {32, 56, 12, 78, 41};
        int key = 12;

        for (int element : array){
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println( key + " element at position " + linearSearch(array, key));

        Arrays.sort(array);
        System.out.println("Sorted array : ");
        for (int element : array){
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println( key + " element at position " + binarySearch(array, key));
    }
}
