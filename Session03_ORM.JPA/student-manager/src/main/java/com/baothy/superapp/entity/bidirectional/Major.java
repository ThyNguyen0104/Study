package com.baothy.superapp.entity.bidirectional;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Major")
public class Major {
    @Id
    @Column(name = "Id", columnDefinition = "CHAR(2)")
    private String id;

    @Column(name = "Name", columnDefinition = "NVARCHAR(100)", nullable = false)
    private String name;

    //1 chuyên ngành có nhìu student, tức là major phair chứa 1 ArrayList Student
    @OneToMany (cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "major")
    //mapped by giúp kết nối ngược với bạn student, để bt cái major ấy đang giữ
    private List<Student> stuList = new ArrayList<>();

    public void addStudent (Student obj){
        stuList.add(obj);// 1 sv đã tham gia chuyên ngành này
        //nhưng chưa ns đc sv obj đang có thực sự trả về , lưu info chuyên ngành k, info major của sv chưa đc set giá trị
        //ta cần  2 câu: major có sv gia nhập ==> done qua lệnh stuList.add(obj);
        //student thuộc về major này (this) ---> done:
        obj.setMajor(this);
    }

    public void removeStudent (Student obj){
        stuList.remove(obj);

        obj.setMajor(null);
    }

    public List<Student> getStuList() {
        return stuList;
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

        return String.format("|%2s|%-40s|", id, name );
        //        return "Major{" +
//                "id='" + id + '\'' +
//                ", name='" + name + '\'' +
//                '}';
    }
}
