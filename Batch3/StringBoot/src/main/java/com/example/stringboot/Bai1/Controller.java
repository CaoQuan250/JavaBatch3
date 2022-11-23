//package com.example.stringboot.Bai1;
//
//
//import org.springframework.web.bind.annotation.*;
//
//
//@RestController
//public class Controller {
//    @GetMapping("/api/{x}/{y}")
//
//    @ResponseBody
//    public String input(@PathVariable int x, @PathVariable int y) {
//        if (x == 0 || y == 0){
//            return null;
//        }
//        int cong = x + y;
//        int tru = x - y;
//        int nhan = x * y;
//        float chia =(float) x / y;
//        return "X: " + x + " - Y: "+ y +" Tổng: "+ cong +" - Hiệu: "+ tru + " - Nhân: " + nhan + " - Chia: "+chia  ;
//    }
//
//}
