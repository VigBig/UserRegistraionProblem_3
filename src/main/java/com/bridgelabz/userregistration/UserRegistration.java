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

    public void mobileNumber(String mobileNumber) {

        String MobileNumberPattern = "^(91-)?[0-9]{10}$";

        Pattern pattern3 = Pattern.compile(MobileNumberPattern);
        Matcher matcher3 = pattern3.matcher(mobileNumber);
        Boolean result3 = matcher3.matches();

        if (result3 == true) {
            System.out.println("Mobile number is valid");
        } else {
            System.out.println("Mobile number is not valid");
        }
    }

    public void passwordRule(String password){

        String PasswordPattern="^(?=.*[A-Z])[a-zA-Z0-9@#$%^&+]{8,}$";

        Pattern pattern4=Pattern.compile(PasswordPattern);
        Matcher matcher4=pattern4.matcher(password);
        Boolean result4=matcher4.matches();

        if(result4==true){
            System.out.println("Password is valid");
        }else{
            System.out.println("Invaild password, minimum 8 characters required with atleast 1 of them being upper case.");
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

        System.out.println("Enter your Mobile number:");
        String mobileNumber = scanner.next();
        ur.mobileNumber(mobileNumber);

        System.out.println("Enter your Password:");
        String password=scanner.next();
        ur.passwordRule(password);

    }
}