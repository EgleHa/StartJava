package com.company;

import java.util.Scanner;

public class MethodStringEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a password: ");
        String password1 = scanner.next();
        System.out.println("Please repeat your password: ");
        String password2 = scanner.next();
        System.out.println(equality(password1, password2) ? "password is accepted" : "passwords entered must match");

    }
    public static boolean equality (String pass1, String pass2) {
        if (pass1.equals(pass2)) return true;
        else return false;
        }
    }

