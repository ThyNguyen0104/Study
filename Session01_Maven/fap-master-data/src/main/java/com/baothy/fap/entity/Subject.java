package com.baothy.fap.entity;

//class này dùng lưu thông tin
public class Subject {
    private String code;
    private String name;
    private int credits;
    private double hours;

    //KHI CHƠI VỚI TABLE, TỨC LÀ
    //CLASS SẼNẠP THÀNH CẤU TRÚC TABLE
    //-EW SUBJECT ("SWT301","SOFTWARE TESTING",3,45);
    // TƯƠNG ỨNG VỚI TỪNG DÒNG TRONG TABLE ~ INSERT INTO
    //CLASS SUBJECT --------------TABLE SUBJECT (ĐẾN TỪ ERO)
    //NEW SUBJECT (..)------------INSERT INTO SUBJECT VALUE

    //BẮT BUỘC CLASS PHẢI CÓ NHỮNG THỨ SAU NKHI CHƠI VỚI CSDL
    //-CONTRUCTOR


    //TOÀN BỘ  ĐOẠN CODE NÀY RẤT QUAN TRỌNG VÌ GIÚP TA TẠO RA OBJECT
    //1 CÁCH LINH HOẠT(TẠO - NEW, CHỈNH SỬA -SET , HỎI INFO - GET, SHOW INFO - TOSTRING)
    //NGƯNG NHÀM CHÁN, K THÈM TƯ DUY GÌ THÊM
    //ĐOẠN CODE NHÀM CHÁN NHƯNG VANAX PHẢI LÀM, K THỂ THIẾU -> GỌI LÀ BOILER PLATE!!!
    public Subject() {
    }

    public Subject(String code, String name, int credits, double hours) {
        this.code = code;
        this.name = name;
        this.credits = credits;
        this.hours = hours;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", credits=" + credits +
                ", hours=" + hours +
                '}';
    }
}
