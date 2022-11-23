//package com.example.stringboot.StudentManagement.Controller.View;
//
//
//import com.example.stringboot.StudentManagement.Model.Student;
//import com.example.stringboot.StudentManagement.Service.StudentService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import java.util.List;
//
//@Controller
//public class UserController {
//
//    @Autowired
//    StudentService studentService;
//
//    @GetMapping("/admin/userList")
//    public String showUserList(Model model){
//        List<Student> students = studentService.getAllStudent();
//        model.addAttribute("students",students);
//        return "ListStudent";
//    }
//
//}
