//package com.example.stringboot.Bai2;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class Controller {
//    @GetMapping("/api/{a}/{b}/{c}")
//
//    @ResponseBody
//    public String enter(@PathVariable int a, @PathVariable int b, @PathVariable int c) {
//        double msg = b*b-4*a*c;
//        if (msg>0){
//            float x1 = (float) (-b+Math.sqrt(msg)/2*a);
//            float x2 = (float) (-b-Math.sqrt(msg)/2*a);
//            return "Delta = "+msg+" - Phương trình có hai nghiệm X1 = " + x1 + " - X2 = " + x2;
//        } else if (msg == 0) {
//            float x3 =  -b/(2*a);
//            return "Delta = "+msg+" - Phương trình có nghiệm kép X1 = X2 = " + x3;
//        } else if (msg < 0) {
//            return "Delta = "+msg+" - Phương trình vô nghiệm";
//        }
//        return null;
//    }
//}
