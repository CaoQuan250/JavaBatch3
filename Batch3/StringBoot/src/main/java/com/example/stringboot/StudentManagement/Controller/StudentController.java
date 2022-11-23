//package com.example.stringboot.StudentManagement.Controller;
//
//import com.example.stringboot.StudentManagement.Dto.ListStudent;
//import com.example.stringboot.StudentManagement.Model.Student;
//import com.example.stringboot.StudentManagement.Service.StudentService;
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
//public class StudentController {
//    @Autowired
//    StudentService studentService;
//    @RequestMapping(value = "/Student", method = RequestMethod.GET)
//    public ResponseEntity<List<Student>> listAllStudent(){
//        List<Student> listStudent = studentService.getAllStudent();
//        if (listStudent.isEmpty()) {
//            return new ResponseEntity(HttpStatus.NO_CONTENT);
//        }
//        return new ResponseEntity<>(listStudent,HttpStatus.OK);
//    }
//
//    @RequestMapping(value = "/ListStudent", method = RequestMethod.GET)
//    public ResponseEntity<ListStudent> listStudent(){
//        List<Student> listStudent = studentService.getAllStudent();
//        ListStudent ls = new ListStudent();
//        ls.setData(listStudent);
//        return new ResponseEntity<ListStudent>(ls,HttpStatus.OK);
//    }
//
//    @RequestMapping(value = "/Student/{id}", method = RequestMethod.GET)
//    public ResponseEntity<Student> getStudentById(@PathVariable("id")Long id){
//        Student student = studentService.getOne(id);
//        return new ResponseEntity(student, HttpStatus.OK);
//    }
//    @RequestMapping(value = "/Student/code/{code}",method = RequestMethod.GET)
//    public ResponseEntity<List<Student>> getAllStudentByCode(@PathVariable("code") String code){
//        Student student = studentService.findByCode(code);
//        return new ResponseEntity(student, HttpStatus.OK);
//    }
//    @RequestMapping(value = "/Student/email/{email}",method = RequestMethod.GET)
//    public ResponseEntity<List<Student>> getAllStudentByEmail(@PathVariable("code") String email){
//        Student student = studentService.findByEmail(email);
//        return new ResponseEntity(student, HttpStatus.OK);
//    }
//    @RequestMapping(value = "/Student/phone/{phone}",method = RequestMethod.GET)
//    public ResponseEntity<List<Student>> getAllStudentByPhone(@PathVariable("code") String phone){
//        Student student = studentService.findByPhone(phone);
//        return new ResponseEntity(student, HttpStatus.OK);
//    }
//
//    @RequestMapping(value = "/Student", method = RequestMethod.POST)
//    public ResponseEntity<Student> saveStudent(@RequestBody Student student){
//        studentService.saveStudent(student);
//        return ResponseEntity.ok(student);
//    }
//    @RequestMapping(value = "/Student/{id}", method = RequestMethod.PUT)
//    public ResponseEntity<Student> updateStudent(@PathVariable("id")Long id,@RequestBody Student student){
//        Student oldStudent = studentService.getOne(id);
//        if (oldStudent == null){
//            return ResponseEntity.notFound().build();
//        } else {
//            oldStudent.setCode(student.getCode());
//            oldStudent.setName(student.getName());
//            oldStudent.setEmail(student.getEmail());
//            oldStudent.setPhone(student.getPhone());
//            oldStudent.setAddress(student.getAddress());
//            studentService.saveStudent(oldStudent);
//            return ResponseEntity.ok(oldStudent);
//
//        }
//    }
//    @RequestMapping(value = "/Student/{id}", method = RequestMethod.DELETE)
//    public ResponseEntity<Student> deleteStudent(@PathVariable("id") Long id){
//        Optional<Student> _olderStudent = studentService.findStudentById(id);
//        if (_olderStudent == null){
//            return ResponseEntity.notFound().build();
//        } else {
//            studentService.deleteStudent(id);
//            return ResponseEntity.ok().build();
//        }
//    }
//}
