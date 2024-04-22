package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to User Registration Problem");

        System.out.println("Enter First Name : ");
        String fname = scanner.nextLine();
        Boolean b = Pattern.matches("^[A-Z]{1}[a-z]{2,}$",fname);
        if (b){
            System.out.println(fname+" is Valid First Name");
        }
        else{
            System.out.println("Invalid first name");
        }
    }
}