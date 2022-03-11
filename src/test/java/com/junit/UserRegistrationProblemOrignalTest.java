package com.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationProblemOrignalTest{

    boolean result;
    UserRegistrationProblem userTest = new UserRegistrationProblem();

    @Test
    public void firstName_IsValid_PassTest() {
        result = userTest.isValidUserName("Nilofar");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void firstName_IsValid_FailTest() {
        result = userTest.isValidUserName("Nilofarhh8h");
        Assertions.assertEquals(true,result);
    }

    @Test
    public void lastName_IsValid_PassTest() {
        result = userTest.isValidUserLastName("Mujawar");
        Assertions.assertEquals(true,result);
    }

    @Test
    public void lastName_IsValid_FailTest() {
        result = userTest.isValidUserLastName("Mujawar");
        Assertions.assertEquals(true,result);
    }

    @Test
    public void Email_IsValid_PassTest() {
        result = userTest.isValidUserEmail("nilofar.mujawar@bl.co.in");
        Assertions.assertEquals(true,result);
    }

    @Test
    public void Email_IsValid_FailTest() {
        result = userTest.isValidUserEmail("nilofar.mujawar@bl.co.in");
        Assertions.assertEquals(true,result);
    }

    @Test
    public void mobileNumber_isValidMobileNo() {
        result = userTest.isValidMobileNo("9955655668");
        Assertions.assertEquals(true,result);
    }

    @Test
    public void mobileNumber_IsValid_FailTest() {
        result = userTest.isValidMobileNo("8955655668");
        Assertions.assertEquals(true,result);
    }

    @Test
    public void password_IsValid_PassTest1() {
        result = userTest.isValidPassword1("bridgelabz");
        Assertions.assertEquals(true,result);
    }
    @Test
    public void password_IsValid_FailTest1() {
        result = userTest.isValidPassword1("bridgelabz1");
        Assertions.assertEquals(true,result);
    }

    @Test
    public void password_IsValid_PassTest2() {
        result = userTest.isValidPassword2("Bridgelabz");
        Assertions.assertEquals(true, result);
    }
    @Test
    public void password_IsValid_FailTest2() {
        result = userTest.isValidPassword2("Bridgelabz1");
        Assertions.assertEquals(true, result);
    }
    @Test
    public void password_IsValid_PassTest3() {
        result = userTest.isValidPassword3("Bridgelabz1");
        Assertions.assertEquals(true, result);
    }
    @Test
    public void password_IsValid_FailTest3() {
        result = userTest.isValidPassword3("Bridgelabz123");
        Assertions.assertEquals(true, result);
    }
    @Test
    public void password_IsValid_PassTest4() {
        result = userTest.isValidPassword4("Bridgelabz@1");
        Assertions.assertEquals(true, result);
    }
    @Test
    public void password_IsValid_FailTest4() {
        result = userTest.isValidPassword4("Bridgelabz@5");
        Assertions.assertEquals(true, result);
    }
}