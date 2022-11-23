package com.example.xncservice.Controller;

import com.example.xncservice.Entity.XNC;
import com.example.xncservice.Service.XNCService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/XNC")
@Slf4j
public class XNCController {

    @Autowired
    private XNCService xncService;

    @PostMapping("/save")
    public XNC saveXNC(@RequestBody XNC xnc) {
        log.info("Inside saveXNC method of XNCController");
        return xncService.saveXNC(xnc);
    }


    @GetMapping("/{id}")
    public XNC findXNCById(@PathVariable("id") Integer id) {
        log.info("Inside saveXNC method of XNCController");
        return xncService.findXncById(id);
    }
}
