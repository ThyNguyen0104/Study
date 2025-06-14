package com.baothy.superapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TA SẼ XÀI CÁC CLASS ĐC CUNG CẤP BỞI JDK CÓ TRONG THƯ VIẸN JDBC
        // JDBC NÀY SẼ TỰ DỘNG ÓC VS SQL SERVER JDBC DRIVER CỦA  HÃNG ĐIỀU KHIỂN ,GÃ VÔ DIỆN HẬU TRƯỜNG
        Connection conn = null;
        try {

            String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=HSF302;encrypt=true;trustServerCertificate=true";
            String user = "sa";
            String pass = "12345";
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");// JDBC HIỆN NAY TỰ ĐỘNG ĐI TÌM SQLSERVER DRIVER , HOẶC MYSQLSERVER THÔNG QUA DẤU HIỆU TRÊN URL Ở TRÊN
            conn = DriverManager.getConnection(dbURL, user, pass);
            System.out.println("Connect to DB successfully");
            // KẾT NÓI THÀNH CÔNG THẲNG VÔ DIỆN - SERVER HẬU TRƯỜNG THÌ  BẮT ĐẦU MÓC NỐI TABLE QUA CÂU SQL

            //TẠO CLASS PREPARESTATEMENT DUNGF QUẢN LÍ CÂU SQL (WHERE, THAM SỐ)
            PreparedStatement stm = conn.prepareStatement("SELECT * FROM Subject");
            ResultSet rs = stm.executeQuery(); // thực thi câu SQL  và trả về ResultSet giống ArrayList, chứa nhiều dòng / record, mỗi dòng là info củ môn học Code| Name| Desc| Credits| StudyHours

            while  (rs.next()) {
                String code = rs.getString("Code");//tên cột là gì datatype của cột là gì, phải nhớ mới lấy đc
                String name = rs.getString("Name");
                int credits  = rs.getInt("Credits");
                int hours  = rs.getInt("StudyHours");
                //in theo kiểu ghép
                //System.out.println(code + "|" + name + "|" + credits + "|" + hours);
                //in giống lề
                System.out.printf("|%10s|%-40s|%2d|%4d|\n",code,name,credits,hours);
            }
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}