package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static boolean checkName(String name){
        boolean b = Pattern.matches("^[A-Z]{1}[a-z]{2,}$",name);
        return b;
    }

    public static boolean checkMail(String mail){
        boolean b = Pattern.matches("^[a-zA-Z0-9]+[-._+]{0,1}[a-zA-Z0-9]+@[a-z0-9]+.[a-zA-Z.]+[a-z]{2,7}$",mail);
        return b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to User Registration Problem");

        System.out.println("Enter First Name : ");
        String fname = scanner.nextLine();
        if (checkName(fname)){
            System.out.println(fname+" is Valid First Name");
        }else{
            System.out.println("Invalid First Name");
        }

        System.out.println("Enter Last Name : ");
        String lname = scanner.nextLine();
        if (checkName(lname)){
            System.out.println(lname+" is Valid Last Name");
        }else{
            System.out.println("Invalid Last Name");
        }

        System.out.println("Enter E-mail Address : ");
        String mail = scanner.nextLine();
        if (checkMail(mail)){
            System.out.println("Email Address is Valid");
        }else{
            System.out.println("Invalid Email Address");
        }
    }
}