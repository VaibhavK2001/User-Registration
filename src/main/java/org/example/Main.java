package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to User Registration Problem");

        System.out.println("Enter Last Name : ");
        String lname = scanner.nextLine();
        Boolean b = Pattern.matches("^[A-Z]{1}[a-z]{2,}$",lname);
        if (b){
            System.out.println(lname+" is Valid First Name");
        }
        else{
            System.out.println("Invalid last name");
        }
    }
}