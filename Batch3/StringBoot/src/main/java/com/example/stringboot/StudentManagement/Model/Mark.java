//package com.example.stringboot.StudentManagement.Model;
//
//import javax.persistence.*;
//import javax.validation.constraints.Max;
//import javax.validation.constraints.Min;
//import javax.validation.constraints.NotBlank;
//import java.util.Objects;
//
//@Entity
//public class Mark {
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Id
//    @Column(name = "id")
//    @NotBlank(message = "Id is mandatory")
//    private int id;
////    @Basic
////    @Column(name = "idsv")
////    private Integer idsv;
////    @Basic
////    @Column(name = "idsub")
////    private Integer idsub;
//    @Basic
//    @Column(name = "mark")
//    @Min(value = 0, message = "Mark cant be lower than 0")
//    @Max(value = 100, message = "Mark cant be higher than 100")
//    private Integer mark;
//    @Basic
//    @Column(name = "note")
//    private String note;
//    @ManyToOne
//    @JoinColumn(name = "idsv", referencedColumnName = "id")
//    @NotBlank(message = "Sv Id is mandatory")
//    private Student studentByIdsv;
//    @ManyToOne
//    @JoinColumn(name = "idsub", referencedColumnName = "id")
//    @NotBlank(message = "Subject Id is mandatory")
//    private Subject subjectByIdsub;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
////    public Integer getIdsv() {
////        return idsv;
////    }
////
////    public void setIdsv(Integer idsv) {
////        this.idsv = idsv;
////    }
////
////    public Integer getIdsub() {
////        return idsub;
////    }
////
////    public void setIdsub(Integer idsub) {
////        this.idsub = idsub;
////    }
//
//    public Integer getMark() {
//        return mark;
//    }
//
//    public void setMark(Integer mark) {
//        this.mark = mark;
//    }
//
//    public String getNote() {
//        return note;
//    }
//
//    public void setNote(String note) {
//        this.note = note;
//    }
//
////    @Override
////    public boolean equals(Object o) {
////        if (this == o) return true;
////        if (o == null || getClass() != o.getClass()) return false;
////        Mark mark1 = (Mark) o;
////        return id == mark1.id && Objects.equals(idsv, mark1.idsv) && Objects.equals(idsub, mark1.idsub) && Objects.equals(mark, mark1.mark) && Objects.equals(note, mark1.note);
////    }
//
////    @Override
////    public int hashCode() {
////        return Objects.hash(id, idsv, idsub, mark, note);
////    }
//
//    public Student getStudentByIdsv() {
//        return studentByIdsv;
//    }
//
//    public void setStudentByIdsv(Student studentByIdsv) {
//        this.studentByIdsv = studentByIdsv;
//    }
//
//    public Subject getSubjectByIdsub() {
//        return subjectByIdsub;
//    }
//
//    public void setSubjectByIdsub(Subject subjectByIdsub) {
//        this.subjectByIdsub = subjectByIdsub;
//    }
//}
