//package com.example.stringboot.StudentManagement.Service;
//
//import com.example.stringboot.StudentManagement.Model.Mark;
//import com.example.stringboot.StudentManagement.Rep.MarkRep;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class MarkServiceImp implements MarkService {
//    @Autowired
//    private MarkRep markRep;
//    @Override
//    public List<Mark> getAllMark() {
//        return markRep.findAllByOrderByIdAsc();
//    }
//    @Override
//    public void saveMark(Mark mark) {
//        markRep.save(mark);
//    }
//    @Override
//    public void deleteMark(Long id) {
//        markRep.deleteById(id);
//    }
//    @Override
//    public Optional<Mark> findMarkById(Long Id) {
//        return markRep.findById(Id);
//    }
//    @Override
//    public Mark getOne(Long id) {
//        return markRep.findById(id).get();
//    }
//    @Override
//    public Mark findByMark(Float Mark) {
//        return markRep.findByMark(Mark);
//    }
//
//}
