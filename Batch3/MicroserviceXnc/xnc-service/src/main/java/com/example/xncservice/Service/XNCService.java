package com.example.xncservice.Service;

import com.example.xncservice.Entity.XNC;
import com.example.xncservice.Repository.XNCRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Slf4j
public class XNCService {
    @Autowired
    private XNCRepository xncRepository;

    public XNC saveXNC(XNC xnc) {
        log.info("Inside saveXNC method of XNCService");
        return xncRepository.save(xnc);
    }

    public XNC findXncById(Integer id) {
        log.info("Inside findXncById method of XNCService");
        return xncRepository.findXNCById(id);

    }
}
