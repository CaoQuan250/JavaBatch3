//package com.example.stringboot.test.service;
//
//import com.example.stringboot.test.model.TblUser;
//import com.example.stringboot.test.rep.TblUserRep;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class TblUserServiceImp implements TblUserService {
//    @Autowired
//    private TblUserRep tblUserRep;
//    @Override
//    public List<TblUser> getAllUser() {
//        return tblUserRep.findAllByOrderByIdAsc();
//    }
//    @Override
//    public void saveUser(TblUser user) {
//        tblUserRep.save(user);
//    }
//    @Override
//    public void deleteUser(Long id) {
//        tblUserRep.deleteById(id);
//    }
//    @Override
//    public Optional<TblUser> findUserById(Long Id) {
//        return tblUserRep.findById(Id);
//    }
//    @Override
//    public TblUser getOne(Long id) {
//        return tblUserRep.findById(id).get();
//    }
//}
