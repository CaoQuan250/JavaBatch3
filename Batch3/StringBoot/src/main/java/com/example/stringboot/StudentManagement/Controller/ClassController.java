//package com.example.stringboot.StudentManagement.Controller;
//
//
//
//import com.example.stringboot.StudentManagement.Model.Class;
//import com.example.stringboot.StudentManagement.Service.ClassService;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//public class ClassController {
//    @Autowired
//
//    ClassService classService;
//
//    @RequestMapping(value = "/Class", method = RequestMethod.GET)
//
//    public ResponseEntity<List<Class>> listAllClass(){
//
//        List<Class> listClass = classService.getAllClass();
//
//        return new ResponseEntity<>(listClass, HttpStatus.OK);
//
//    }
//
//    @RequestMapping(value = "/Class/{id}", method = RequestMethod.GET)
//
//    public ResponseEntity<Class> getClassById(@PathVariable("id")Long id){
//
//        Class clas = classService.getOne(id);
//
//        return new ResponseEntity(clas, HttpStatus.OK);
//
//    }
//
//    @RequestMapping(value = "/Class", method = RequestMethod.POST)
//
//    public ResponseEntity<Class> saveClass(@RequestBody Class clas){
//
//        classService.saveClass(clas);
//
//        return ResponseEntity.ok(clas);
//
//    }
//
//    @RequestMapping(value = "/Class/{id}", method = RequestMethod.PUT)
//
//    public ResponseEntity<Class> updateClass(@PathVariable("id")Long id, @RequestBody Class clas){
//
//        Class oldClass = classService.getOne(id);
//
//        if (oldClass == null){
//
//            return ResponseEntity.notFound().build();
//
//        } else {
//
//            oldClass.setName(clas.getName());
//
//            oldClass.setNote(clas.getNote());
//
//            classService.saveClass(oldClass);
//
//            return ResponseEntity.ok(oldClass);
//
//        }
//
//    }
//
//    @RequestMapping(value = "/Class/{id}", method = RequestMethod.DELETE)
//
//    public ResponseEntity<Class> deleteClass(@PathVariable("id") Long id){
//
//        Optional<Class> _oldClass = classService.findClassById(id);
//
//        if (_oldClass == null){
//
//            return ResponseEntity.notFound().build();
//
//        } else {
//
//            classService.deleteClass(id);
//
//            return ResponseEntity.ok().build();
//
//        }
//
//    }
//
//    @RequestMapping(value = "/Class/name/{name}",method = RequestMethod.GET)
//
//    public ResponseEntity<List<Class>> getAllClassByName(@PathVariable("name") String name){
//
//        Class clas = classService.findByName(name);
//
//        return new ResponseEntity(clas, HttpStatus.OK);
//
//    }
//
//}
