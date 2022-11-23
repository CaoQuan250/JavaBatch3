package com.example.camxnc.Controller;


import com.example.camxnc.Entity.Cam;
import com.example.camxnc.Service.CamService;
import com.example.camxnc.ValueObject.ResponseTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cam")
public class CamController {

    @Autowired
    private CamService camService;

    @PostMapping("/save")
    public Cam saveCam(@RequestBody Cam cam){
        return camService.save(cam);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getCamWithXNC(@PathVariable("id") Integer id){
        return camService.getCamWithXNC(id);
    }


}
