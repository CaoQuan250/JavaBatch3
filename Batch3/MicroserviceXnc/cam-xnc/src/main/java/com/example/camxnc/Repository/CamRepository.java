package com.example.camxnc.Repository;

import com.example.camxnc.Entity.Cam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CamRepository extends JpaRepository<Cam, Integer> {


    Cam findCamById(Integer id);
}
