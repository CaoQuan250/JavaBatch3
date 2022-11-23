//package com.example.stringboot.StudentManagement.Service;
//
//import com.example.stringboot.StudentManagement.Model.Class;
//import com.example.stringboot.StudentManagement.Rep.ClassRep;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class ClassServiceImp implements ClassService{
//
//    @Autowired
//    ClassRep classRep;
//
//    @Override
//    public List<Class> getAllClass() {
//        return classRep.findAllByOrderByIdAsc();
//    }
//
//    @Override
//    public void saveClass(Class clas) {
//        classRep.save(clas);
//
//    }
//
//    @Override
//    public void deleteClass(Long id) {
//        classRep.deleteById(id);
//
//    }
//
//    @Override
//    public Optional<Class> findClassById(Long Id) {
//        return classRep.findById(Id);
//    }
//
//    @Override
//    public Class getOne(Long id) {
//        return classRep.findById(id).get();
//    }
//
//    @Override
//    public Class findByName(String name) {
//        return classRep.findByName(name);
//    }
//}
