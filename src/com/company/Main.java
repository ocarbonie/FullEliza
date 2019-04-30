package com.company;

import java.util.Collections;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer = " ";
        Random rnd = new Random();

        System.out.println("Good day. What is your problem? " +
                "Enter your response here or Q to quit:");
        answer = input.nextLine();

        while (!answer.equalsIgnoreCase("Q")) {
            int num = rnd.nextInt(1);

            switch (num) {
                case 0:
                    talkTherapy(answer);
                    break;
                case 1:
                    hedgers();
                    break;
            }

            System.out.println("\n\nEnter your response here or Q to quit:");
            answer = input.nextLine();
        }

    }

    public static void talkTherapy(String m) {
        String[] wordSplit = m.split(" ");
        ArrayList<String> qualifiers = new ArrayList<>();
        int num;


        for (int i = 0; i < wordSplit.length; i++) {
            if (wordSplit[i].equalsIgnoreCase("i")) {
                wordSplit[i] = "you";
            } else if (wordSplit[i].equalsIgnoreCase("me")) {
                wordSplit[i] = "you";
            } else if (wordSplit[i].equalsIgnoreCase("my")) {
                wordSplit[i] = "your";
            } else if (wordSplit[i].equalsIgnoreCase("am")) {
                wordSplit[i] = "are";

            }
        }

        //let's add to the ArrayList
        qualifiers.add("Why do you say that");
        qualifiers.add("You seem to think that");
        qualifiers.add("So, you are concerned that");

        Collections.shuffle(qualifiers);
        System.out.print(qualifiers.get(2) + " ");


        for (int i = 0; i < wordSplit.length; i++) {
            System.out.print(wordSplit[i] + " ");
        }

    }

    public static void hedgers() {
        ArrayList<String> hedgersArr = new ArrayList<>();
        hedgersArr.add("Please tell me more");
        hedgersArr.add("Many of my patients tell me the same thing");
        hedgersArr.add("It is getting late, maybe we had better quit");

        Collections.shuffle(hedgersArr);
        System.out.print(hedgersArr.get(2) + " ");

    }
}

