package com.bridgelabz.lembda;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInfoUsingLembda {

    IFirstName firstName = (str)->{
        Pattern pattern = Pattern.compile("^([A-Z]{1}+)[A-Za-z]{2,}$");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    };
    ILastName lastName = (str)->{
        Pattern lname = Pattern.compile("^([A-Z]{1}+)[A-Za-z]{2,}$");
        Matcher matcher = lname.matcher(str);
        return matcher.matches();
    };
    MobileNumber mobileNumber = (mobile_num)->{
        Pattern mobileNumber = Pattern.compile("^([0-9]{2}+)[ ]([6-9]{1,1}+)([0-9]{9,9})$");
        Matcher matcher = mobileNumber.matcher(mobile_num);
        return matcher.matches();
    };
    public static void main(String[] args) {

        System.out.println("Welcome to User Info Using Lembda master branch");

        UserInfoUsingLembda userInfoUsingLembda = new UserInfoUsingLembda();

        System.out.println("First name is "+userInfoUsingLembda.firstName.isFirstName("Akash"));

        System.out.println("Last name is "+userInfoUsingLembda.lastName.isLastName("Das"));

        System.out.println("Mobile number is "+userInfoUsingLembda.mobileNumber.isMobileNumber("91 9910168520"));


    }
}
