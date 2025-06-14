package com.baothy.superapp.entity.unimany;

import com.baothy.superapp.infra.JpaUtil;
import jakarta.persistence.EntityManager;

public class MainUniMany {
    public static void main(String[] args) {
        createMajorStudents();
    }

    public static void createMajorStudents(){
        Major se = new Major("SE", "SOFTWARE ENGINEERING");

        Student an = new Student("SE100", "AN NGUYEN", 2006, 8.6);
        Student binh = new Student("SE101", "BÌNH LÊ", 2006, 8.7);

        an.setMajor(se);
        binh.setMajor(se);

        EntityManager em = JpaUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(se); // lưu Major trước
        em.persist(an); //lưu Student sau, k đổ domino đc
        em.persist(binh); //domino:1 - N, áp dụng cho 1 đám bị ảnh hưởng bởi....,1 Major, áp dụng chung cho 1 nhóm Students
        em.getTransaction().commit(); // cực kì quan trọng
        em.close();
    }
}
