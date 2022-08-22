package com.bridgelabz.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Problem:");
        Scanner scanner = new Scanner(System.in);

        UserRegistrationException ure = new UserRegistrationException();

        try {
            System.out.println("Enter First name:");
            String firstName = scanner.next();
            ure.firstNameException(firstName);
        } catch (CustomException e) {
            System.out.println("Exception is handled");
        }
        System.out.println();

        try {
            System.out.println("Enter Last name:");
            String lastName = scanner.next();
            ure.lastNameException(lastName);
        } catch (CustomException e) {
            System.out.println("Exception is handled");
        }
        System.out.println();
        try {
            System.out.println("Enter Email:");
            String email = scanner.next();
            ure.emailException(email);
        } catch (CustomException e) {
            System.out.println("Exception is handled");
        }
        System.out.println();
        try {
            System.out.println("Enter Mobile Number:");
            String mobileNumber = scanner.next();
            ure.mobileNumberException(mobileNumber);
        } catch (CustomException e) {
            System.out.println("Exception is handled");
        }
        System.out.println();
        try {
            System.out.println("Enter Password:");
            String password = scanner.next();
            ure.passwordRuleException(password);
        } catch (CustomException e) {
            System.out.println("Exception is handled");
        }

        System.out.println();
    }
}