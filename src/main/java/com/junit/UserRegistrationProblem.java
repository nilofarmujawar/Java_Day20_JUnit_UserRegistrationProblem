package com.junit;
/**
 * UC1 :- As a User need to enter a valid First Name
 *        - First name starts with Cap and has minimum 3 characters
 * UC2 :- As a User need to enter a valid Last Name
 *        - Last name starts with Cap and has minimum 3 characters
 * UC3 :- As a User need to enter  a valid email
 *        - E.g. abc.xyz@bl.co.in
 *        - Email has 3 mandatory parts (abc, bl& co) and 2 optional (xyz & in) with precise @ and . positions
 * UC4 :- As a User need to follow pre-defined Mobile Format
 *        - E.g. 91 9919819801
 *        - Country code follow by space and 10 digit number
 * UC5 :- As a User need to follow pre-defined Password rules.Rule1– minimum 8 Characters
 *         - NOTE – All rules must be passed
 * UC6 :- Rule2 – Should have at least 1 Upper Case
 *        - NOTE – All rules must be passed
 * UC7 :- Rule3 – Should  have at least 1 numeric number in the password
 *       - NOTE – All rules must be passed
 * UC8 :- Rule4 – Has exactly 1 Special Character
 *        - NOTE – All rules must be passed
 * UC9 :- Should clear all email samples provided separately
 * UC10 :-Write JUnit Test to validate the User Entry for First Name, Last Name,Email, Mobile, and Password.
 *         - Write Junit Test for Happy as well as Sad test  case.
 *         - Happy Test Case validates the Entry Successfully
 *         - Sad Test Cases fails the Entry
 *
 * UC11 :- Write JUnit Parameterised Test to validate multiple entry for the Email Address.
 *
 */

/**
 *  import matcher class and pattern class
 */
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationProblem {
    /**
     * create  method name as isValidUsername this is parameterised
     * In this method function to validate the username
     *
     * @param firstname of string
     * @return username
     */
    public static boolean isValidUserName(String firstname) {

        /**
         *  Regex to check valid username.
         *  \\w means any word character, short for [a-zA-Z_0-9]
         */
        String regex = "^[A-Za-z]\\w{3,29}$";

        /**
         *  Compile the Regex
         */
        Pattern p = Pattern.compile(regex);
        /**
         * If the username is empty
         *  return false
         */
        if (firstname == null) {
            return false;
        }
        /**
         * Pattern class contains matcher() method to find matching between given username
         * and regular expression.
         */
        Matcher m = p.matcher(firstname);
        /**
         * Return if the username matched the Regex
         */
        return m.matches();
    }

    /**
     * Create a method name as isValidUserLastName, this is parameterized method
     * Function to validate the userlastname
     *
     * @param lastname
     * @return userlastname
     */
    public static boolean isValidUserLastName(String lastname) {

        /**
         *  Regex to check valid userlastname.
         */
        String regex = "^[A-Za-z]\\w{3,29}$";

        /**
         *  Compile the ReGex
         */
        Pattern p = Pattern.compile(regex);
        /**
         * If the userlastname is empty, then return false
         */
        if (lastname == null) {
            return false;
        }
        /**
         * Pattern class contains matcher() method to find matching between given userlastname
         * and regular expression.
         */
        Matcher m = p.matcher(lastname);
        /**
         * Return if the userlastname matched the Regex
         */
        return m.matches();
    }

    /**
     * Function to validate the useremail
     *
     * @param email
     * @return matcher user email
     */
    public static boolean isValidUserEmail(String email) {

        /**
         * Regex to check valid user mail.
         */
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        /**
         * Compile the Regex
         */
        Pattern p = Pattern.compile(regex);
        /**
         * If the useremail is empty then return false
         */
        if (email == null) {
            return false;
        }
        /**
         * Pattern class contains matcher() method to find matching between given useremail
         * and regular expression.
         */
        Matcher m = p.matcher(email);
        /**
         * Return if the useremail matched the Regex
         */
        return m.matches();
    }

    /**
     * create a method name as isValidMobileNo this is parameterized method
     *
     * @param mobileNumber
     * @return boolean value
     */
    public static boolean isValidMobileNo(String mobileNumber) {
        /**
         * (0/91): number starts with (0/91)
         * [7-9]: starting of the number may contain a digit between 0 to 9
         * [0-9]: then contains digits 0 to 9
         */
        Pattern ptrn = Pattern.compile("^((\\+|00)(\\d{1,3})[\\s-]?)?(\\d{10})$");

        /**
         *  the matcher() method creates a matcher that will match the given input against this pattern
         */
        Matcher match = ptrn.matcher(mobileNumber);
        /**
         * returns a boolean value
         */
        return (match.find() && match.group().equals(mobileNumber));
    }

    /**
     * create a method name as isValidPassword this is parameterized method
     * Function to validate the userpassword
     * Function to validate the password.
     *
     * @param password1
     * @return password
     */
    public static boolean isValidPassword1(String password1) {

        /**
         * Regex to check valid password.
         * ^ represents starting character of the string.
         * .{8,} represents at least 8 characters and more than characters.
         * $ represents the end of the string.
         */
        String regex = "^[a-zA-z1-9]{8,}$";
        /**
         * Compile the Regex
         */
        Pattern p = Pattern.compile(regex);
        /**
         * If the password is empty then return false
         */
        if (password1 == null) {
            return false;
        }
        /**
         *  Pattern class contains matcher() method to find matching between given password
         *  and regular expression.
         */
        Matcher m = p.matcher(password1);
        /**
         *  Return if the password matched the Regex
         */
        return m.matches();
    }

    /**
     * create a method name as isValidPassword2.
     * This is parameterized method
     *
     * @param password2
     * @return password
     */
    public static boolean isValidPassword2(String password2) {
        /**
         * Regex to check valid password.
         * 1) ^ represents starting character of the string.
         * 2) {8,} represents at least 8 characters or more than that characters.
         * 3) [A-Z]{1,} represents an upper case alphabet that must occur at least once.
         * 4) $ represents the end of the string.
         */

        String regex = "^[A-Z]{1,}[a-zA-z1-9]{8,}$";
        /**
         * Compile the Regex
         */
        Pattern p = Pattern.compile(regex);
        /**
         *  If the password is empty then return false
         */
        if (password2 == null) {
            return false;
        }
        /**
         * Pattern class contains matcher() method to find matching between given password
         * and regular expression.
         */
        Matcher m = p.matcher(password2);
        /**
         *  Return if the password matched the Regex
         */
        return m.matches();
    }

    public static boolean isValidPassword3(String password3) {
        /**
         * Regex to check valid password.
         * 1) ^ represents starting character of the string.
         * 2) {8,} represents at least 8 characters or more than that characters.
         * 3) [a-zA-z1-9] represents a lower case alphabet must occur at least 8 or more than that.
         * 4) [A-Z]{1} represents an upper case alphabet that must occur at least once.
         * 5) [1-9]{1}represents a digit must occur at least once.
         * 6) $ represents the end of the string.
         */
        String regex = "^[A-Z]{1}+[a-zA-z1-9]{9,}[1-9]{1}$";
        /**
         * Compile the Regex
         */
        Pattern p = Pattern.compile(regex);
        /**
         * If the password is empty then return false
         */
        if (password3 == null) {
            return false;
        }
        /**
         * Pattern class contains matcher() method to find matching between given password
         *  and regular expression.
         */
        Matcher m = p.matcher(password3);
        /**
         * Return if the password matched the Regex
         */
        return m.matches();
    }

    public static boolean isValidPassword4(String password4) {
        /**
         * Regex to check valid password.
         * 1) ^ represents starting character of the string.
         * 2) {8,} represents at least 8 characters or more than that characters.
         * 3) [a-zA-z1-9] represents a lower case alphabet must occur at least 8 or more than that.
         * 4) [A-Z]{1} represents an upper case alphabet that must occur at least once.
         * 5) [1-9]{1}represents a digit must occur at least once.
         * 6) [@$^]{1} represents a at least once special character.
         * 6) $ represents the end of the string.
         */
        String regex = "^[A-Z]{1}+[a-zA-z1-9]{9,}[@$^]{1}[1-9]{1}$";
        /**
         * Compile the Regex
         */
        Pattern p = Pattern.compile(regex);
        /**
         * If the password is empty then return false
         */
        if (password4 == null) {
            return false;
        }
        /**
         * Pattern class contains matcher() method to find matching between given password
         *  and regular expression.
         */
        Matcher m = p.matcher(password4);
        /**
         *  Return if the password matched the Regex
         */
        return m.matches();
    }

    public static boolean isemailValidation(String emailID) {
        /**
         * regex pattern for email
         * 1)must contain character before @
         * 2)must contain @ symbol after char
         * 3)must contain char after @
         * 4)must contain "."  symbol before com or in
         */
        String regex = "^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?";
        /**
         * Compile the Regex
         */
        Pattern p = Pattern.compile(regex);
        /**
         * If the useremail is empty then return false
         */
        if (emailID == null) {
            return false;
        }
        /**
         * Pattern class contains matcher() method to find matching between given useremail
         * and regular expression.
         */
        Matcher m = p.matcher(emailID);
        /**
         * Return if the useremail matched the Regex
         */
        return m.matches();
    }


    /**
     * create a main method , all program execute in main method
     *
     * @param args no arguments
     */
    public static void main(String[] args) {

        /**
         *  Test Case: 1 for Fist Name
         */
        String str1 = "Nilofar"; //first name
        System.out.println(isValidUserName(str1));
        /**
         * Test Case: 2 for last Name
         */
        String str2 = "Mujawar"; //last name
        System.out.println(isValidUserLastName(str2));
        /**
         *  Test Case: 3 for Email
         */
        String str3 = "nilofar.mujawar@bl.co.in"; //email
        System.out.println(isValidUserEmail(str3));
        /**
         * Test Case: 4 for mobile no
         */
        String str4 = "+91-9919819801"; //usermobilenumber
        System.out.println(isValidMobileNo(str4));
        /**
         *  Test Case: 5 for password rule no 1
         */
        String str5 = "bridgeabz"; //userpassword1
        System.out.println(isValidPassword1(str5));
        /**
         *  Test Case: 6 for password rule no 2
         */
        String str6 = "Bridgelabz"; //userpassword2
        System.out.println(isValidPassword2(str6));
        /**
         *  Test Case: 7 for password rule no 3
         */
        String str7 = "Bridgelabz1"; //userpassword3
        System.out.println(isValidPassword3(str7));
        /**
         *  Test Case: 8 for password rule no 3
         */
        String str8 = "Bridgelabz@1"; //userpassword4
        System.out.println(isValidPassword4(str8));
        /**
         *  Test Case: 9 for email validation
         */
        String str9 = "nilofarmujawar1118@gmail.com"; //emailValidation4
        System.out.println(isemailValidation(str9));

        }
    }



