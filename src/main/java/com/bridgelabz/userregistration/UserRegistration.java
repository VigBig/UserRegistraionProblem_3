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

    public void email(String email){
        String emailPattern= "^[a-zA-Z0-9]+[.+-]{0,1}[0-9a-zA-Z]*@[a-z0-9]+[.][a-z]{2,4}[.a-z]{0,4}$";

        Pattern pattern2=Pattern.compile(emailPattern);
        Matcher matcher2=pattern2.matcher(email);
        boolean result2=matcher2.matches();

        if(result2== true){
            System.out.println("Email is valid.");
        }else{
            System.out.println("Email is not valid.");
        }
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

        System.out.println("Enter your Email:");
        String email = scanner.next();
        ur.email(email);
    }
}