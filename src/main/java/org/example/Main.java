package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter your name:");

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName + ". Nice to meet you!");

        System.out.println("What is your hobby? :");
        String userHobby = scanner.nextLine();
        System.out.println("Wow! "+ userHobby + " is a great hobby.");


    }
}