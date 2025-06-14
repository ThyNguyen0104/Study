package com.baothy.superapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//import org.hibernate.annotations.Nationalized;

//Class này sẽ ánh xạ/biến đổi thành table tương ứng
@Entity
@Table(name="Student") // nếu k có hai báo này thì mặc định lấy tên class thành tên
public class Student {
    @Id
    @Column(name = "Id", nullable = false,length =50,columnDefinition = "CHAR(8)")// nếu k có khai báo này, thì mặc định lấy tên field làm tên cột
    private String id;//camelCase

    @Column(name = "Name",nullable = false,length =50, columnDefinition = "NVARCHAR(50)")
    //@Nationalized // THIẾU KHAI BÁO NÀY THÌ STRING -> VARCHAR
    //              K LƯU TIẾNG VIỆT CÓ DẤU,ĐỂ STRING ->NVARCHAR THÌ CẦN THÊM KHAI BÁO @NATIONALIZED
    //NẾU K LÀM  TIẾNG VIỆT SẼ DẤU ? THAY THẾ '\?~/
    //TA DÙNG @NATIONALIED ỦA HIBERNATE SẼ MẤT ĐI TÍNH KHẢ CHUYỂN KHI CODE ÀY K THỂ CHƠI ĐC VS NHÀ THẦU ESCLIPELINK
    //ĐỘ VARCHAR CHƠI VỚI  NHIÈU NHÀ CUNG CẤP ORM/JPA QUA COLUMNDEFINTION
    private String name;

    @Column(name = "Yob", nullable= false)
    private int yob;

    @Column(name = "GPA", nullable= false)
    private double gpa;


    public Student() {
    }

    public Student(String id, String name, int yob, double gpa) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", yob=" + yob +
                ", gpa=" + gpa +
                '}';
    }
}
