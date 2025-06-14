package com.baothy.loosecoupling.di.v2setter;

public class UserService {
    private UserRepo repo;
    private EmailSender sender;

    public void setRepo(UserRepo repo) {
        this.repo = repo;
    }

    public void setSender(EmailSender sender) {
        this.sender = sender;
    }

    public void registerAccount (Account acc){
            sender.sendEmail("hoangngoctrinh@gmail.com", "Please input the OTP...");
    }
}
