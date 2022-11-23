package com.example.camxnc.ValueObject;


import com.example.camxnc.Entity.Cam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    private Cam cam;
    private XNC xnc;
}
