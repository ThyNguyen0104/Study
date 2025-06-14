package com.baothy.superapp.entity.bidirectional;

import com.baothy.superapp.infra.JpaUtil;
import jakarta.persistence.EntityManager;

import java.util.List;

public class MainBiOneMany {
    public static void main(String[] args) {
        //createMajorStudent();
        getAll();
    }
    //lấy ds sv , ds
    public static void getAll(){
        EntityManager em = JpaUtil.getEntityManager();

        Major se = em.find(Major.class, "SE");
        System.out.println("SE major info: " + se);

        List<Student> stuList = se.getStuList();
        System.out.println("The SE students: ");
        stuList.forEach(System.out::println);
    }

    public static void createMajorStudent(){
        Major se = new Major("SE", "Software Engineering | KĨ THUẬT PHẦN MỀM");
        Major gd = new Major("GD", "Graphic Design | Mỹ thuật số");

        Student an = new Student("SE1000", "AN NGUYỄN", 2005, 8.6);
        Student binh = new Student("SE1001", "BÌNH LÊ", 2005, 8.7);
        Student cuong = new Student("GD1000", "CƯỜNG VÕ", 2005, 8.6);
        Student dung = new Student("GD1001", "DUNG PHẠM", 2005, 8.7);

        se.addStudent(an);
        se.addStudent(binh);
        gd.addStudent(cuong);
        gd.addStudent(dung);

        //mời giám đốc EnityManager
        EntityManager em = JpaUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(se);
        em.persist(gd);
        em.getTransaction().commit();
        em.close();

    }
}
