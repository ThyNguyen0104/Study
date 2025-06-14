package com.baothy.tightcoupling;

public class UserService {
    // có` ít` nhất 2 dependency service nó cần
    //1, user - repo giúp cho cruib table account
    //2. gửi email/sms/whatsapp confirm

    private UserRepo userRepo = new UserRepo();//dependency, tightcoupling, chủ động quản lí object dependency

    private EmailSender emailSender = new EmailSender();//dependency,tightcoupling , chủ dộng quản lí object troing lòng
    //new service , có 2 chú này đc new
    public void registerAccount (Account acc){
       //TODO: gọi repo để xuống table!!!

       //
       emailSender.sendEmail("hoangngoctrinh@gmail.com", "Please input the OTP...");
    }
}
//
