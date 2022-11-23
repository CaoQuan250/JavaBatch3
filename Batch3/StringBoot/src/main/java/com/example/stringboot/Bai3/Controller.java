//package com.example.stringboot.Bai3;
//
//import org.springframework.web.bind.annotation.*;
//
//import java.util.HashMap;
//import java.util.Objects;
//
//@RestController
//public class Controller {
//    @GetMapping("/forex")
//
//    public Forex input(@RequestBody (value = "name", defaultValue = "world")String name){
//        HashMap<String,Integer> list = new HashMap<>();
//        list.put("USD",23000);
//        list.put("EUR",25000);
//        list.put("JPY",17000);
//
//        Forex forex = new Forex();
//        if (list.containsKey(name)) {
//            Float value = list.get(name);
//            forex.setValue(value);
//            forex.setMsg("Chuyển đổi thành công");
//        } else {
//            forex.setMsg("Chuyển đổi không thành công");
//        }
//
//
//
//    }
//}
