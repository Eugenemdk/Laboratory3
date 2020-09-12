package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //findEd();
        // System.out.println(findSum());

        //findBlock();
        //findWords();
        //splitWords();
        mixedString();
    }

    public static boolean findEd() {
        String str;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter stroke:");
        str = input.nextLine();
        str.toCharArray();
        if (str.charAt(str.length() - 2) == 'e' && str.charAt(str.length() - 1) == 'd') {
            return true;
        } else {
            return false;
        }
    }

    public static int findSum() {
        String str;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter stroke:");
        str = input.nextLine();
        str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Character.getNumericValue(str.charAt(i));
            }
        }
        return sum;
    }

    public static int findBlock() {
        String str;
        int counter = 1;
        int max = 0;
        char repSymbol = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter stroke:");
        str = input.nextLine();
        char[] array = str.toCharArray();

        for (int i = 1; i < array.length; i++) { // Start from 1 since we want to compare it with the char in index 0
            if (array[i] == array[i - 1]) {
                counter++;
            } else {
                if (counter > max) {  // Record current run length, is it the maximum?
                    max = counter;
                    repSymbol = array[i - 1];
                }
                counter = 1; // Reset the count
            }
        }
        if (counter > max) {
            max = counter; // This is to account for the last run
            repSymbol = array[array.length - 1];
        }
        System.out.println("Most repetitive character is :" + repSymbol + " and it repeats: " + counter);
        return counter;
    }

    public static void findWords() {
        String str;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter stroke:");
        str = input.nextLine();
        char[] array = str.toCharArray();
        char[] arraySec = new char[array.length];
        String st;
        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < array.length; i++) {
            arraySec[i] = array[i];
            if (!Character.isLetter(array[i])) {
                st = String.valueOf(arraySec);
                words.add(st);
            }
        }

        for (String word : words) {
            System.out.println(word);
        }

    }

    public static void splitWords() {
        String str;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter stroke:");
        str = input.nextLine();
        String[] array = str.split(" ");
        for (String i : array) {
            System.out.println(i);
        }
    }

    public static void mixedString() {
        String str;
        String str2;
        StringBuilder str3 = new StringBuilder();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first stroke :");
        str = input.nextLine();
        System.out.println("Enter second stroke: ");
        str2 = input.nextLine();
        // For every index in the strings
        for (int index = 0; index < str.length() ||
                index < str2.length(); index++) {

            // First choose the ith character of the
            // first string if it exists
            if (index < str.length()) {
                str3.append(str.charAt(index));
            }

            // Then choose the ith character of the
            // second string if it exists
            if (index < str2.length())
                str3.append(str2.charAt(index));
        }
        System.out.println(str3.toString());
    }


    }






