package com.example.camxnc.Service;


import com.example.camxnc.Entity.Cam;
import com.example.camxnc.Repository.CamRepository;
import com.example.camxnc.ValueObject.ResponseTemplateVO;
import com.example.camxnc.ValueObject.XNC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CamService {

    @Autowired
    private CamRepository camRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Cam save(Cam cam) {
        return camRepository.save(cam);
    }

    public ResponseTemplateVO getCamWithXNC(Integer id) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Cam cam = camRepository.findCamById(id);

        XNC xnc = restTemplate.getForObject("http://XNC-SERVICE/XNC/" + cam.getXncId()
                ,XNC.class);

        vo.setCam(cam);

        vo.setXnc(xnc);

        return vo;
    }
}
