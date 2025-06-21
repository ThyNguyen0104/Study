package com.baothy.loosecoupling.di.v3finalfantasy;

public class SmsSender {
    public void sendEmail (String phone, String message){
        //TODO: LOGIC XỬ LÝ GỬI MAIL : SETUP ACCOUNT ĐỂ ĐÓNG VAI NGƯỜI GỬI

        //thông báo thành công
        System.out.println("Sending SMS to: " + phone + " successfully!!!\nEmail contents:" + message);
    }
}
