package com.bridgelabz.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationException {
    public static boolean firstNameException(String firstName) throws CustomException{

        String firstNamePattern = "[A-Z]{1}[a-z]{2,}";

//        System.out.println("Enter First Name:");
//        String firstName = scanner.next();
        Pattern pattern = Pattern.compile(firstNamePattern);
        Matcher matcher = pattern.matcher(firstName);
        boolean result = matcher.matches();

        if(result == false){
            throw new CustomException("First Name is Invalid");
        }
        else
            System.out.println("First Name is valid");

        return result;
    }
    public static boolean lastNameException(String lastName)throws CustomException {

        String lastNamePattern = "[A-Z]{1}[a-z]{2,}";

//        System.out.println("Enter Last Name:");
//        String lastName = scanner.next();
        Pattern pattern = Pattern.compile(lastNamePattern);
        Matcher matcher = pattern.matcher(lastName);
        boolean result = matcher.matches();

        if(result == false)
            throw new CustomException("Last Name is Invalid");
        else
            System.out.println("Last Name is valid");

        return result;
    }
    public static boolean emailException(String email) throws CustomException{
        String emailPattern= "[a-zA-Z0-9]+[.+-]{0,1}[0-9a-zA-Z]*@[a-z0-9]+[.][a-z]{2,4}[.a-z]{0,4}";
//        System.out.println("Enter your Email:");
//        String email = scanner.next();
        Pattern pattern=Pattern.compile(emailPattern);
        Matcher matcher=pattern.matcher(email);
        boolean result=matcher.matches();

        if(result== false){
            throw new CustomException("Email is Invalid");
        }else{
            System.out.println("Email is valid");
        }
        return result;
    }
    public static boolean mobileNumberException(String mobileNumber) throws CustomException{

        String MobileNumberPattern = "(91-)?[0-9]{10}";
//        System.out.println("Enter the mobile number");
//        String mobileNumber = scanner.next();
        Pattern pattern = Pattern.compile(MobileNumberPattern);
        Matcher matcher = pattern.matcher(mobileNumber);
        Boolean result = matcher.matches();

        if (result == false) {
            throw new CustomException("Mobile number is Invalid");
        } else {
            System.out.println("Mobile number is valid");
        }
        return result;
    }


    public static boolean passwordRuleException(String password)throws CustomException {

        String PasswordPattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[~!@#$%^&*()<>:{},.;'])[A-Za-z0-9~!@#$%^&*()<>:{},.;']{8,}$";
//        System.out.println("Enter the Password");
//        String password = scanner.next();
        Pattern pattern = Pattern.compile(PasswordPattern);
        Matcher matcher = pattern.matcher(password);
        Boolean result = matcher.matches();

        if (result == false) {
            throw new CustomException("Invaild, minimum 8 characters are needed with atleast 1 of them being upper case and exactly 1 of them has to be a special character.");

        } else {
            System.out.println("Password is valid");
        }
        return result;
    }
}