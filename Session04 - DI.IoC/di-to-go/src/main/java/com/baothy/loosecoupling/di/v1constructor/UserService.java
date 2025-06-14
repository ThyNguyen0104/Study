package com.baothy.loosecoupling.di.v1constructor;

public class UserService {
    private UserRepo userRepo;

    //private EmailSender emailSender = new EmailSender(); full control, k DI

    private EmailSender emailSender;

    public UserService(UserRepo userRepo, EmailSender emailSender) {
        this.userRepo = userRepo;
        this.emailSender = emailSender;
    }

    public UserService( EmailSender emailSender) {
        //this.userRepo = userRepo;
        this.emailSender = emailSender;
    }

    public void registerAccount (Account obj){

        emailSender.sendEmail("hoangngoctrinh@gmail.com", "Please input the OTP...");
    }

}
