package com;

import static org.junit.jupiter.api.Assertions.*;

class UserValidationTest {

    UserValidation user = new UserValidation();

    @org.junit.jupiter.api.Test
    public void testFirstName_thenAssertionSucceeds() throws UserRegistrationException {
            assertTrue(user.isFirstNameValid("Naveen"));
            System.out.println("Valid First Name");
    }

    @org.junit.jupiter.api.Test
    public void testFirstName_thenAssertionFail() throws UserRegistrationException {
        assertFalse(user.isFirstNameValid("naveen"));
        System.out.println("InvalidValid First Name");
    }

    @org.junit.jupiter.api.Test
    public void testLastName_thenAssertionSucceeds() throws UserRegistrationException{
        assertTrue(user.isLastNameValid("Kumar"));
        System.out.println("Valid Last Name");
    }

    @org.junit.jupiter.api.Test
    public void testLastName_thenAssertionFail() throws UserRegistrationException {
        assertFalse(user.isLastNameValid("kumar"));
        System.out.println("Invalid Last Name");
    }

    @org.junit.jupiter.api.Test
    public void testEmail_thenAssertionSucceeds() throws UserRegistrationException {
        assertTrue(user.isEmailValid("abc@gmail.com"));
        System.out.println("Valid Email");
    }

    @org.junit.jupiter.api.Test
    public void testEmail_thenAssertionFail() throws UserRegistrationException {
        assertFalse(user.isEmailValid("abc@gmail@.com@"));
        System.out.println("Invalid Email");
    }

    @org.junit.jupiter.api.Test
    public void testMobileNumber_thenAssertionSucceeds() throws UserRegistrationException {
        assertTrue(user.isPhoneNumberValid("91 9876543210"));
        System.out.println("Valid Mobile Number");
    }

    @org.junit.jupiter.api.Test
    public void testMobileNumber_thenAssertionFail() throws UserRegistrationException {
        assertFalse(user.isPhoneNumberValid("910876543210"));
        System.out.println("Invalid Mobile Number");
    }

    @org.junit.jupiter.api.Test
    public void testPassword_thenAssertionSucceeds() throws UserRegistrationException {
        assertTrue(user.isPasswordValid("Abcd@1234"));
        System.out.println("Valid Password");
    }

    @org.junit.jupiter.api.Test
    public void testPassword_thenAssertionFail() throws UserRegistrationException {
        assertFalse(user.isPasswordValid("bbb"));
        System.out.println("Invalid Password");
    }

}