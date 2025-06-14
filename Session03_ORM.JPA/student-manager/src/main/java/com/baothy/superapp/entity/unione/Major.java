package com.baothy.superapp.entity.unione;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

//@Entity
//@Table(name = "Major")


public class Major {

    @Id
    @Column(name = "Id", columnDefinition = "CHAR(2)")
    private String id; //mã chuyên ngành

    @Column(name = "Name", columnDefinition = "NVARCHAR(80)", nullable = false)
    private String name;// têm chuyên ngành

    //câu trong csdl, câu trong đời thường: 1 major có nhiều sinh viên
   @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
   @JoinColumn(name = "MajorId")
    private List<Student> students = new ArrayList<>();
    //để có cụ thể sv nào, ta gọi students.add( 1 bạn sv đc new đâu đó)
    //                            students.add(new Student("SE1",....));



    //hàm add  sv vào list, public
    public void addStudent(Student obj){
        //if else logic kiểm soát info bên ngoài đi vào object
        students.add(obj);
    }
    public Major() {
    }

    public Major(String id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Major{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
