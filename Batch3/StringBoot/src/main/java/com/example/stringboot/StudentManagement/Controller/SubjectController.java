//package com.example.stringboot.StudentManagement.Controller;
//
//import com.example.stringboot.StudentManagement.Dto.SubjectCount;
//import com.example.stringboot.StudentManagement.Model.Subject;
//import com.example.stringboot.StudentManagement.Service.SubjectService;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/api")
//public class SubjectController {
//    @Autowired
//    SubjectService subjectService;
//
//
//
//    @RequestMapping(value = "/Subject", method = RequestMethod.POST)
//    public ResponseEntity<Subject> saveSubject(@RequestBody Subject subject){
//        subjectService.addSubject(subject);
//        return ResponseEntity.ok(subject);
//    }
//
//    @RequestMapping(value = "/Subject/{id}", method = RequestMethod.PUT)
//    public ResponseEntity<Subject> updateSubject(@PathVariable("id")Long id, @RequestBody Subject subject){
//        Subject oldSubject = subjectService.getOne(id);
//        if (oldSubject == null){
//            return ResponseEntity.notFound().build();
//        } else {
//            oldSubject.setName(subject.getName());
//            oldSubject.setDescription(subject.getDescription());
//            oldSubject.setSem(subject.getSem());
//            oldSubject.setDuration(subject.getDuration());
//
//            subjectService.addSubject(oldSubject);
//            return ResponseEntity.ok(oldSubject);
//        }
//    }
//
//    @RequestMapping(value = "/Subject/{id}", method = RequestMethod.DELETE)
//    public ResponseEntity<Subject> deleteSubject(@PathVariable("id") Long id){
//        Optional<Subject> _olderSubject = subjectService.findSubjectById(id);
//        if (_olderSubject == null){
//            return ResponseEntity.notFound().build();
//        } else {
//            subjectService.deleteSubject(id);
//            return ResponseEntity.ok().build();
//        }
//    }
//
//    @RequestMapping(value = "/Subject/name/{name}",method = RequestMethod.GET)
//    public ResponseEntity<List<Subject>> getAllSubjectByName(@PathVariable("name") String name){
//        Subject subject = subjectService.findByName(name);
//        return new ResponseEntity(subject, HttpStatus.OK);
//    }
//
//    @RequestMapping(value = "/Subject/sem/{sem}",method = RequestMethod.GET)
//    public ResponseEntity<List<Subject>> getAllSubjectBySem(@PathVariable("sem") Integer sem){
//        Subject subject = subjectService.findBySem(sem);
//        return new ResponseEntity(subject, HttpStatus.OK);
//    }
//
//    @RequestMapping(value = "/SubjectCount", method = RequestMethod.GET)
//    public ResponseEntity<List<SubjectCount>> countBySem(){
//        List<SubjectCount> ls = subjectService.countBySem();
//        return new ResponseEntity<List<SubjectCount>>(ls,HttpStatus.OK);
//    }
//
//    @RequestMapping(value = "/Subject", method = RequestMethod.GET)
//    public ResponseEntity<List<Subject>> listAllSubject(){
//        List<Subject> listSubject = subjectService.getAllSubject();
//        return new ResponseEntity<List<Subject>>(listSubject,HttpStatus.OK);
//    }
//
//
//
//
//}