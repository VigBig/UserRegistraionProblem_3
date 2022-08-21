package com.bridgelabz.userregistrationtest;

import com.bridgelabz.userregistration.UserRegistration;
import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserRegistrationTest {

    @Test
    public void testValidFirstName() {
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.firstName("Vighnesh");
        assertEquals("Valid First Name test pass",true,result);
    }

    @Test
    public void testInvalidFirstName() {
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.firstName("vIGHNESH");
        assertEquals("Invalid First Name test pass",false,result);
    }

    @Test
    public void testValidLastName() {
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.lastName("Bilgi");
        assertEquals("Valid Last Name test pass",true,result);
    }

    @Test
    public void testInvalidLastName() {
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.lastName("bILGI");
        assertEquals("Invlaid Last Name test pass",false,result);
    }

    @Test
    public void testValidEmail() {
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.email("vighnesh@gmail.com");
        assertEquals("Valid Email test pass",true,result);
    }

    @Test
    public void testInvlaidEmail() {
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.email("vighnesh.gmail.com");
        assertEquals("Invlaid Email test pass",false,result);
    }

    @Test
    public void testValidMobileNumber() {
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.mobileNumber("9049480396");
        assertEquals("Valid Mobile Number test pass",true,result);
    }

    @Test
    public void testInvlaidMobileNumber() {
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.mobileNumber("12345");
        assertEquals("Invalid Mobile Number test pass",false,result);
    }

    @Test
    public void testValidPassword() {
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.passwordRule("abcDEF123!@#");
        assertEquals("Valid Password test pass",true,result);
    }

    @Test
    public void testInvalidPassword() {
        UserRegistration userRegistration=new UserRegistration();
        boolean result=userRegistration.passwordRule("aD1#");
        assertEquals("Invalid Password test pass",false,result);
    }
}