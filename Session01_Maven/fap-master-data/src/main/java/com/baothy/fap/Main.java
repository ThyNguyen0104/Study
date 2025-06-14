package com.baothy.fap;

import com.baothy.fap.entity.Student;
import com.baothy.fap.entity.Subject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws JsonProcessingException {

        // TẠO MƠÍ ÔN MÔN HỌC
        Subject swt = new Subject("SWT301","SOFTWARE TESTING",3,45);
        Subject hsf = new Subject("HSF302","HIBERNATE & SPRING FRAMEWORK",3,45);
        //SHOW INFO 2 MÔN
        System.out.println("SWT INFO: " + swt.toString());
        System.out.println("HSF INFO: " + hsf);

        //TẠO MỚI hồ sơ sinh viên
        Student an = new Student("SE1","AN NGUYỄN",2004,8.6);
        Student binh = new Student("SE2","BÌNH LÊ",2004,8.7);
        //SHOW INFO 2 SV
        System.out.println("BINH INFO: " + binh.toString());
        System.out.println("AN  INFO: " + an.toString());

        //CHƠI VS JSON, OBJECT VÀ NGƯỢC LẠI
        //CẦN TẠO OBJECT QUẢN LÍ JSON TỪ THƯ VIỆN JSON
        ObjectMapper mapper = new ObjectMapper();
        String anJson = mapper.writeValueAsString(an);
        System.out.println("LẦN ĐẦU TIÊN CHUYỆN ẤY, JSON TỪ OBJECT MÀ RA" +anJson);

        //TỪ JSON THÀNH OBJECT GIẢ BỘ FE GỬI BE, TA CÓ FORM NHẬP, USER SUBMIT INFO, TA GỬI BẠN BE JSON, BẠN LO THÀNH OBJECT ĐI, ĐỂ XUỐNG DB
        String cuongJson = "{\"id\":\"SE3\",\"name\":\"CƯỜNG NGUYỄN\",\"yob\":2004,\"gpa\":8.8}";
        //
        Student cuong = mapper.readValue(cuongJson, Student.class);

        System.out.println("CUONG TU JSON MA RA: " + cuong.toString());

        //JSON: JavaScript Object Notation
        //KĨ THUẬT BIỂN DIỄN THÔNG TIN CỦA  OBJECT THEO CÚ PHÁP NGÔN NGỮ JAVASRIPT
        //C#,JAVA: OBECT CÓ DẠNG NHƯ SAU
        //new Subject ("SWT301","SOFTWARE TESTING",3,45);
        //new Student("SE1","AN NGUYỄN",2004, 8.6);
        //CODE TRÊN LÀ 1 MÔN HỌC CỤ THỂ, 1 BẠN SV CỤ THỂ, NHƯNG NHÌN TEXT K DỄ HIỂU  K TỰ MÔ TẢ- SEFT EXPLAINTION
        //

        //JAVACRIPTNTHIF MORE SELF EXPLAINTION

        // TRONG CODE THÌ TOÀN OBJECT
        //RA NGOÀI RÊN MẠNG HTTPTHIF LÀ JSON
        //CẦN 1 THƯ VIỆN ĐỂ GIÚP CONVERT QUA LẠI JSON -- OBJECT
        //JACKSON,GSON THƯ VIỆN
    }
}