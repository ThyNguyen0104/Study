package com.baothy.loosecoupling.di.v1constructor;

public class MainDIV1 {
    public static void main(String[] args) {
        EmailSender emailSender = new EmailSender();
        UserService userService = new UserService(emailSender);
        userService.registerAccount(new Account());
    }
}