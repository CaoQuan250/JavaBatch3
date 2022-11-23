//package com.example.stringboot.StudentManagement.Service;
//
//import com.example.stringboot.StudentManagement.Model.Student;
//import com.example.stringboot.StudentManagement.Rep.StudentRep;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class StudentServiceImp implements StudentService {
//    @Autowired
//    private StudentRep studentRep;
//    @Override
//    public List<Student> getAllStudent() {
//        return studentRep.findAllByOrderByIdAsc();
//    }
//    @Override
//    public void saveStudent(Student student) {
//        studentRep.save(student);
//    }
//    @Override
//    public void deleteStudent(Long id) {
//        studentRep.deleteById(id);
//    }
//    @Override
//    public Optional<Student> findStudentById(Long Id) {
//        return studentRep.findById(Id);
//    }
//    @Override
//    public Student getOne(Long id) {
//        return studentRep.findById(id).get();
//    }
//    @Override
//    public Student findByCode(String Code) {
//        return studentRep.findByCode(Code);
//    }
//    @Override
//    public Student findByEmail(String email) {
//        return studentRep.findByEmail(email);
//    }
//    @Override
//    public Student findByPhone(String phone) {
//        return studentRep.findByPhone(phone);
//    }
//
//}
