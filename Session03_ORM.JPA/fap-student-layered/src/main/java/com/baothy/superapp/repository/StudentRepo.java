package com.baothy.superapp.repository;

import com.baothy.superapp.entity.Student;
import com.baothy.superapp.infra.JpaUtil;
import jakarta.persistence.EntityManager;

import java.util.List;

public class StudentRepo {

    //class này chứa các hàm crud rực tiếp table student - repo nhà kho về dữ liệu
    //muốn crud tacble thì phải nhờ vả ông entity-manager đc cung cấp từ JpaUtil singleton
    //floww: UI ---- SERVICE ---- REPO(đây) ---- JPA (entity-manager và factory)

    //các hàm crud ở đây thường đặt tên ngán gọn , hướng hành động như lệnh sql chuẩn (insert, update, delete)
    //tên hàm gợi ý
    //tùy hàm nhưng nếu có thay đổi trong table (insert update, delete) thì
    // hàm sẽ nhận vào object(insert,update) hỏ key (delete) delete đưa object
    //hàm insert xuống  table
    public void save (Student obj){
        //gọi EM (entity manager) nhờ giúp  kèm transation - có thay đổi data
        EntityManager em = JpaUtil.getEntityManager();//đoạn lệnh trôi nổi static{}
        //chạy duy nhất 1 lần , khởi động heavy connection
        em.getTransaction().begin();
        em.persist(obj);
        em.getTransaction().commit();
        //try ...catch khi save bị lỗi -- từ từ....
        em.close(); // giám đốc xong vc!!
    }

    // hàm này lấy tất ả sinh viên - jpql select From student
    public List<Student> findAll(){
        EntityManager em = JpaUtil.getEntityManager();
        return em.createQuery("FROM Student", Student.class).getResultList();
    }

    //sửa thông tin sinh viên - cập nhật
    public void update (Student obj){
        EntityManager em = JpaUtil.getEntityManager();
        em.getTransaction().begin();
        em.merge(obj);//merge() nghĩa là tích hợp object đua vào
        em.getTransaction().commit();
    }

    public void delete (String id){
        EntityManager em = JpaUtil.getEntityManager();
        em.getTransaction().begin();

        Student x = em.find(Student.class, id); // timf sv có id = id đưa vào , gọi là x
        // và remove x, remove obj giống như trên
        em.remove(x);
        //em.remove(em.find(Student.class, id));// viết gộp
        em.getTransaction().commit();
    }

    //TODO at home : làm thêm hàm where theo cột naof đó , findById()
}
