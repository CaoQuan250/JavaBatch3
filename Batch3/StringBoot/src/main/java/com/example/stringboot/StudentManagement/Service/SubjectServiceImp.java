//package com.example.stringboot.StudentManagement.Service;
//
//import com.example.stringboot.StudentManagement.Dto.SubjectCount;
//import com.example.stringboot.StudentManagement.Model.Subject;
//import com.example.stringboot.StudentManagement.Rep.SubjectRep;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class SubjectServiceImp implements SubjectService {
//    @Autowired
//    private SubjectRep subjectRep;
//    @Override
//    public List<Subject> getAllSubject() {
//        return subjectRep.findAllByOrderByIdAsc();
//    }
//    @Override
//    public void addSubject(Subject subject) {
//        subjectRep.save(subject);
//    }
//    @Override
//    public void deleteSubject(Long id) {
//        subjectRep.deleteById(id);
//    }
//    @Override
//    public Subject findByName(String name) {
//        return subjectRep.findByName(name);
//    }
//    @Override
//    public Subject findBySem(Integer sem) {
//        return subjectRep.findBySem(sem);
//    }
//
//    @Override
//    public List<SubjectCount> countBySem() {
//        return subjectRep.countBySem();
//    }
//
//    @Override
//    public Optional<Subject> findSubjectById(Long Id) {
//        return subjectRep.findById(Id);
//    }
//    @Override
//    public Subject getOne(Long id) {
//        return subjectRep.findById(id).get();
//    }
//
//}
