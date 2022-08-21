package com.bridgelabz.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    static Scanner scanner = new Scanner(System.in);

    public void firstName(String firstName) {

        String firstNamePattern = "^[A-Z]{1}[a-z]{2,}$";

        Pattern pattern = Pattern.compile(firstNamePattern);
        Matcher matcher = pattern.matcher(firstName);
        boolean result = matcher.matches();

        if(result == true){
            System.out.println("First Name is valid.");
        }

        else
            System.out.println("First Name is not valid.");
    }

    public void lastName(String lastName) {

        String lastNamePattern = "^[A-Z]{1}[a-z]{2,}$";

        Pattern pattern = Pattern.compile(lastNamePattern);
        Matcher matcher = pattern.matcher(lastName);
        boolean result = matcher.matches();

        if(result == true)
            System.out.println("Last Name is valid.");
        else
            System.out.println("Last Name is not valid.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to User Registration Problem:");
        UserRegistration ur = new UserRegistration();

        System.out.println("Enter First Name:");
        String firstName = scanner.next();
        ur.firstName(firstName);

        System.out.println("Enter Last Name:");
        String lastName = scanner.next();
        ur.lastName(lastName);
    }
}