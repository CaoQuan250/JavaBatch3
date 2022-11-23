//package com.example.stringboot.StudentManagement.Rep;
//
//import com.example.stringboot.StudentManagement.Dto.SubjectCount;
//import com.example.stringboot.StudentManagement.Model.Subject;
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public interface SubjectRep extends JpaRepository<Subject, Long> {
//    List<Subject> findAllByOrderByIdAsc();
//    Subject findByName(String name);
//    Subject findBySem(int sem);
//    @Query("select new com.example.stringboot.StudentManagement.Dto.SubjectCount(s.sem,count(s.name) ) from Subject s group by s.sem")
//    List <SubjectCount> countBySem();
//
//}
