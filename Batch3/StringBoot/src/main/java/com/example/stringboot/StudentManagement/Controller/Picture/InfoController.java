//package com.example.stringboot.StudentManagement.Controller.Picture;
//
//
//import com.example.stringboot.StudentManagement.Model.Info;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.InputStream;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.nio.file.StandardCopyOption;
//
//@Controller
//public class InfoController {
//
//    @RequestMapping("/new")
//
//    public String register() {
//        return "info";
//    }
//
//    @PostMapping("/save")
//    public String save(
//        @RequestParam("name") String name,
//                       @RequestParam("photo") MultipartFile photo,
//                       @RequestParam("filecv")  MultipartFile filecv, ModelMap model){
//        Info info = new Info();
//        info.setName(name);
//        if (photo.isEmpty() || filecv.isEmpty()){
//            return "info";
//        }
//        Path path = Paths.get("static/uploads/");
//        try{
//            InputStream inputStream = photo.getInputStream();
//            Files.copy(inputStream,path.resolve(photo.getOriginalFilename()),
//                    StandardCopyOption.REPLACE_EXISTING);
//            info.setPhoto(photo.getOriginalFilename().toLowerCase());
//
//            inputStream = filecv.getInputStream();
//            Files.copy(inputStream,path.resolve(filecv.getOriginalFilename()),
//                    StandardCopyOption.REPLACE_EXISTING);
//
//            model.addAttribute("INFO",info);
//            model.addAttribute("FILE_NAME",filecv.getOriginalFilename());
//            model.addAttribute("FILE_TYPE",filecv.getContentType());
//            model.addAttribute("FILE_SIZE",filecv.getSize());
//
//        } catch (Exception e){
//            e.printStackTrace();
//    }
//
//
//        return "view-info";
//    }
//}
//
