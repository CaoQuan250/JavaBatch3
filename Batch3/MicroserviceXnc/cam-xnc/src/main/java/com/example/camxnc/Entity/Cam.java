package com.example.camxnc.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cam {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String reason;
    private String duration;
    private Integer xncId;

}
