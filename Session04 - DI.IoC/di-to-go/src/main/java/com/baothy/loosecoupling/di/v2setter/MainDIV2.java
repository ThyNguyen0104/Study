package com.baothy.loosecoupling.di.v2setter;

public class MainDIV2 {
    public static void main(String[] args) {
        EmailSender sender = new EmailSender();
        UserService service = new UserService();
        service.setSender(sender);
        service.registerAccount(new Account());
    }
}
