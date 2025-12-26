package com.ignek.core.java.logical;

import java.util.Arrays;

public class SecondLargeSmallElement {
    public static int anotherApproachToFindSecondLargest(int[] array){
        int largestNumber = -1;
        int secondLargestNumber = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > largestNumber){
                secondLargestNumber = largestNumber;
                largestNumber = array[i];
            }
            if (array[i] > secondLargestNumber && array[i] != largestNumber){
                secondLargestNumber = array[i];
            }
        }
        return secondLargestNumber;
    }

    public static int anotherApproachToFindSecondSmallest(int[] array){
        int smallestNumber = Integer.MAX_VALUE;
        int secondSmallestNumber = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallestNumber){
                secondSmallestNumber = smallestNumber;
                smallestNumber = array[i];
            }
            if (array[i] < secondSmallestNumber && array[i] != smallestNumber){
                secondSmallestNumber = array[i];
            }
        }
        return secondSmallestNumber;
    }

    public static void main(String[] args) {
        int[] array = {32, 56, 12, 78, 41};

        Arrays.sort(array);

        System.out.print("\nlogicalPrograms.Array elements : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        int secondLargest = -1;
        for (int i = array.length-2; i >= 0; i--) {
            if (array[i] != array[array.length-1]){
                secondLargest = array[i];
                break;
            }
        }

        int secondSmallest = -1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[0]){
                secondSmallest = array[i];
                break;
            }
        }

        System.out.println("\nSecond largest element : " + secondLargest);
        System.out.println("Second smallest element : " + secondSmallest);

        int[] array2 = {32, 56, 12, 78, 78};
        System.out.println("Another approach to find second largest & smallest");
        System.out.println("Second largest element : " + anotherApproachToFindSecondLargest(array2));
        System.out.println("Second smallest element : " + anotherApproachToFindSecondSmallest(array2));
    }
}
