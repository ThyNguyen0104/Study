package com.baothy.loosecoupling.di.v2setter;

public class EmailSender {
    public void sendEmail (String recipient, String message){
        //TODO: LOGIC XỬ LÝ GỬI MAIL : SETUP ACCOUNT ĐỂ ĐÓNG VAI NGƯỜI GỬI

        //thông báo thành công
        System.out.println("(DI V2 - Setter)Mail sent to: " + recipient + " successfully!!!\nEmail contents:" + message);
    }
}
