package com.bridgelabz.lembda;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInfoUsingLembda {

    IFirstName firstName = (str)->{
        Pattern pattern = Pattern.compile("^([A-Z]{1}+)[A-Za-z]{2,}$");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    };

    public static void main(String[] args) {

        System.out.println("Welcome to User Info Using Lembda master branch");

        UserInfoUsingLembda userInfoUsingLembda = new UserInfoUsingLembda();
        System.out.println(userInfoUsingLembda.firstName.isFirstName("Akash"));

    }
}
