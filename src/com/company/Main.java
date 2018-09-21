package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
    Scanner kbScanner = new Scanner(System.in);
        System.out.println("First Word:");
        String firstWord = kbScanner.next();
        System.out.println("Second Word:");
        String secondWord = kbScanner.next();

        if (firstWord.length() == secondWord.length()) {

            char[] arrayOne = firstWord.toCharArray();
            char[] arrayTwo = secondWord.toCharArray();

            int count = 0;
            for (int i = 0; i < arrayOne.length; i++) {
                if (arrayOne[i] == arrayTwo[i])
                    count++;

            }
            if (count == arrayTwo.length) ;
                System.out.println(firstWord + " and " + secondWord + " are anagrams!");
            }
        else {
            System.out.println(firstWord + " and " + secondWord + " are not anagrams!");
        }

        }

    }

