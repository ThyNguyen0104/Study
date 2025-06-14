package com.baothy.tightcoupling;

public class EmailSender {

    //TUI GÃP RẤT GIỎI GỨI EMAIL , TUI K DÍNHGDANG1 ĐẾN SMS, K DÍNH ĐẾN WHATSAPP, TUI THOẢ NGUYÊN LÝ S/SRP TRONG SOLID
    //TUI CHỈ CHỨA HÀM, NHÌU HÀM CHUYÊN LIÊN QUAN ĐẾN EMAIL - 1 CHỦ THỀ
    //hma2 này gửi mail tới người đk account, thông tin mail nhập từ màn hình đk ,đi qua controller đến service đến đây!!!


    public void sendEmail (String recipient, String message){
        //TODO: LOGIC XỬ LÝ GỬI MAIL : SETUP ACCOUNT ĐỂ ĐÓNG VAI NGƯỜI GỬI

        //thông báo thành công
        System.out.println("Mail sent to: " + recipient + " successfully!!!");
    }
}
