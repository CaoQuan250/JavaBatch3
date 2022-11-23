package com.example.camxnc.ValueObject;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class XNC {
    private Integer id;
    private String place;
    private String action;
    private String purpose;

}
