package com.company;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
    Scanner kbScanner = new Scanner(System.in);
        System.out.println("First Word:");
        String firstWord = kbScanner.nextLine();
        System.out.println("Second Word:");
        String secondWord = kbScanner.nextLine();
        System.out.println("Is this an anagram");
        if (firstWord.length() != secondWord.length()){
            System.out.println("False! " + firstWord + " and " + secondWord + " are not anagrams!");
        }else {
            
        }

    }
}
