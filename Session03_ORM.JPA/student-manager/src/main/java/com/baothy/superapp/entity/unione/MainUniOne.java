package com.baothy.superapp.entity.unione;

import com.baothy.superapp.infra.JpaUtil;
import jakarta.persistence.EntityManager;

public class MainUniOne {

    public static void main(String[] args) {

        createMajorStudents();
    }

    public static void createMajorStudents(){
        Major seMajor = new Major("SE", "Software Engineering | KĨ THUẬT PHẦN MỀM");

        Student s1 = new Student("SE100", "AN NGUYỄN", 2006, 8.6);
        Student s2 = new Student("SE101", "BÌNH LÊ", 2006, 8.7);

        //seMajor cần phải add 2 student s1 s2
        seMajor.addStudent(s1);
        seMajor.addStudent(s2);

        //oop đã xong về relationship
        // xuống table, đổ domino - cascade 1 major , n student xuống luôn theo
        //

        EntityManager em = JpaUtil.getEntityManager();
        em.getTransaction().begin();

        em.persist(seMajor); // Major đi xuống 2 Students theo sau

        em.getTransaction().commit();
        em.close();
    }
}
