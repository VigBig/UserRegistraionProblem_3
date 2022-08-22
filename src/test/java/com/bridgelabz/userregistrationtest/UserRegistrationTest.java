package com.bridgelabz.userregistrationtest;

import com.bridgelabz.userregistration.CustomException;
import com.bridgelabz.userregistration.UserRegistration;
import com.bridgelabz.userregistration.UserRegistrationException;
import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserRegistrationTest {

    @Test
    public void testValidFirstName() throws CustomException {
        UserRegistrationException userRegistrationException=new UserRegistrationException();
        boolean result=userRegistrationException.firstNameException("Vighnesh");
        assertEquals("Valid First Name test pass",true,result);
    }

    @Test
    public void testInvalidFirstName()  throws CustomException {
        UserRegistrationException userRegistrationException=new UserRegistrationException();
        boolean result=userRegistrationException.firstNameException("vIGHNESH");
        assertEquals("Invalid First Name test pass",false,result);
    }

    @Test
    public void testValidLastName() throws CustomException {
        UserRegistrationException userRegistrationException=new UserRegistrationException();
        boolean result=userRegistrationException.lastNameException("Bilgi");
        assertEquals("Valid Last Name test pass",true,result);
    }

    @Test
    public void testInvalidLastName()  throws CustomException {
        UserRegistrationException userRegistrationException=new UserRegistrationException();
        boolean result=userRegistrationException.lastNameException("bILGI");
        assertEquals("Invlaid Last Name test pass",false,result);
    }

    @Test
    public void testValidEmail() throws CustomException {
        UserRegistrationException userRegistrationException=new UserRegistrationException();
        boolean result=userRegistrationException.emailException("vighnesh@gmail.com");
        assertEquals("Valid Email test pass",true,result);
    }

    @Test
    public void testInvalidEmail() throws CustomException {
        UserRegistrationException userRegistrationException=new UserRegistrationException();
        boolean result=userRegistrationException.emailException("vighnesh.gmail.com");
        assertEquals("Invlaid Email test pass",false,result);
    }

    @Test
    public void testValidMobileNumber() throws CustomException {
        UserRegistrationException userRegistrationException=new UserRegistrationException();
        boolean result=userRegistrationException.mobileNumberException("9049480396");
        assertEquals("Valid Mobile Number test pass",true,result);
    }

    @Test
    public void testInvlaidMobileNumber()  throws CustomException {
        UserRegistrationException userRegistrationException=new UserRegistrationException();
        boolean result=userRegistrationException.mobileNumberException("12345");
        assertEquals("Invalid Mobile Number test pass",false,result);
    }

    @Test
    public void testValidPassword()  throws CustomException {
        UserRegistrationException userRegistrationException=new UserRegistrationException();
        boolean result=userRegistrationException.passwordRuleException("abcDEF123!@#");
        assertEquals("Valid Password test pass",true,result);
    }

    @Test
    public void testInvalidPassword()  throws CustomException {
        UserRegistrationException userRegistrationException=new UserRegistrationException();
        boolean result=userRegistrationException.passwordRuleException("aD1#");
        assertEquals("Invalid Password test pass",false,result);
    }
}