//package com.example.stringboot.StudentManagement.Controller;
//
//import com.example.stringboot.StudentManagement.Model.Mark;
//import com.example.stringboot.StudentManagement.Service.MarkService;
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
//public class MarkController {
//    @Autowired
//    MarkService markService;
//    @RequestMapping(value = "/Mark", method = RequestMethod.GET)
//    public ResponseEntity<List<Mark>> listAllMark(){
//        List<Mark> listStudent = markService.getAllMark();
//        return new ResponseEntity<>(listStudent,HttpStatus.OK);
//    }
//
//    @RequestMapping(value = "/Mark/{id}", method = RequestMethod.GET)
//    public ResponseEntity<Mark> getMarkById(@PathVariable("id")Long id){
//        Mark mark = markService.getOne(id);
//        return new ResponseEntity(mark, HttpStatus.OK);
//    }
//
//    @RequestMapping(value = "/Mark", method = RequestMethod.POST)
//    public ResponseEntity<Mark> saveMark(@RequestBody Mark mark){
//        markService.saveMark(mark);
//        return ResponseEntity.ok(mark);
//    }
//
//    @RequestMapping(value = "/Mark/{id}", method = RequestMethod.PUT)
//    public ResponseEntity<Mark> updateMark(@PathVariable("id")Long id, @RequestBody Mark mark){
//        Mark oldMark = markService.getOne(id);
//        if (oldMark == null){
//            return ResponseEntity.notFound().build();
//        } else {
//            oldMark.setMark(mark.getMark());
//            oldMark.setNote(mark.getNote());
//
//            markService.saveMark(oldMark);
//            return ResponseEntity.ok(oldMark);
//        }
//    }
//
//    @RequestMapping(value = "/Mark/{id}", method = RequestMethod.DELETE)
//    public ResponseEntity<Mark> deleteMark(@PathVariable("id") Long id){
//        Optional<Mark> _oldMark = markService.findMarkById(id);
//        if (_oldMark == null){
//            return ResponseEntity.notFound().build();
//        } else {
//            markService.deleteMark(id);
//            return ResponseEntity.ok().build();
//        }
//    }
//
//    @RequestMapping(value = "/Mark/mark/{mark}",method = RequestMethod.GET)
//    public ResponseEntity<List<Mark>> getAllMarkByMark(@PathVariable("mark") float mark){
//        Mark tblMark = markService.findByMark(mark);
//        return new ResponseEntity(tblMark, HttpStatus.OK);
//    }
//}
