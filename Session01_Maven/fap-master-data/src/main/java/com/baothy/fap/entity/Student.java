package com.baothy.fap.entity;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
// thay bằng @Data là đủ
public class Student {
    private String id;
    private String name;
    private int yob; //year of birth, năm sinh
    private double gpa; // điểm tb

    //ĐOẠN CODE BOIDER PLATE NHÀM CHÁN: 2 CTOR, GET/SET TO STRING
    //TA K THÈM LÀM THEO CÁCH TRUYỀN THỐNG , NHƯNG VẪNPHAIR LÀM THEOACHS NÀO ĐÓ-> TA DÙNG THÊM MỘT THƯ VIỆN TRÊN MẠNG  K PHẢI CHÍNH HÃNG JDK
    //C# THÌ CÓ HÀNG CHÍNH HÃNG -> GỌI LÀ KĨ THUẬT PHẦN MỀM
    //TA ĐI TÌM
    //ĐI THI PE, XIN KHẢO THÍ , GK, CHO MÌNH VÀO INTERNET ĐỂ ĐỒNG BỘ/ TẢI THƯ VIỆN VỀ MÁY - BẮT BUỘC!!!
}
