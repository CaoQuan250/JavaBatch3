package com.example.xncservice.Repository;

import com.example.xncservice.Entity.XNC;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface XNCRepository extends JpaRepository<XNC,Integer> {
    XNC findXNCById(Integer id);
}
