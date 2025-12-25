package com.ignek.core.java.strings;

import java.util.Scanner;

public class MutableStringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput;

        System.out.println("Enter paragraph : ");
        userInput = sc.nextLine();

        StringBuilder stringBuilder1 = new StringBuilder(userInput);

        int choice = 0;
        while (choice != 8){
            System.out.println("Operation to perform : ");
            System.out.println("1. Append text at end");
            System.out.println("2. Insert at specific position");
            System.out.println("3. Delete character");
            System.out.println("4. Delete word");
            System.out.println("5. Replace a word");
            System.out.println("6. Reverse entire text");
            System.out.println("7. Show paragraph");
            System.out.println("8. Exit");

            System.out.println("Enter your choice : ");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter text : ");
                    String text = sc.next();
                    stringBuilder1.append(text);
                    break;
                case 2:
                    System.out.println("Enter position in index : ");
                    int index = sc.nextInt();
                    System.out.println("Enter text : ");
                    String textAtSpecificPosition = sc.next();
                    stringBuilder1.insert(index, textAtSpecificPosition);
                    break;
                case 3:
                    System.out.println("Enter index of character : ");
                    int indexToDeleteCharacter = sc.nextInt();
                    stringBuilder1.deleteCharAt(indexToDeleteCharacter);
                    break;
                case 4:
                    System.out.println("Enter starting index of word : ");
                    int startingIndexToDelete = sc.nextInt();
                    System.out.println("Enter ending index of word : ");
                    int endingIndexToDelete = sc.nextInt();
                    stringBuilder1.delete(startingIndexToDelete, endingIndexToDelete);
                    break;
                case 5:
                    System.out.println("Enter starting index of replacing : ");
                    int startingIndexToReplace = sc.nextInt();
                    System.out.println("Enter ending index of replacing : ");
                    int endingIndexToReplace = sc.nextInt();
                    System.out.println("Enter new text : ");
                    String newText = sc.next();
                    stringBuilder1.replace(startingIndexToReplace, endingIndexToReplace, newText);
                    break;
                case 6:
                    stringBuilder1.reverse();
                    break;
                case 7:
                    System.out.println(stringBuilder1.toString());
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Please enter valid choice");
                    break;
            }
        }
        sc.close();
    }
}
