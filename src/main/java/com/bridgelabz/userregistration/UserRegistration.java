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

    public static void main(String[] args) {

        System.out.println("Welcome to the User Registration Problem:");

        UserRegistration ur = new UserRegistration();
        System.out.println("Enter First Name:");
        String firstName = scanner.next();
        ur.firstName(firstName);

    }
}