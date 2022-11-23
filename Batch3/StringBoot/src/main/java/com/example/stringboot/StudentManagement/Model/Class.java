//package com.example.stringboot.StudentManagement.Model;
//
//import javax.persistence.*;
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.NotEmpty;
//import java.util.Collection;
//import java.util.Objects;
//
//@Entity
//public class Class {
//    @Id
//    @Column(name = "id")
//    @NotBlank(message = "Id is mandatory")
//    private int id;
//    @Basic
//    @Column(name = "name")
//    @NotBlank(message = "Name is mandatory")
//    private String name;
//    @Basic
//    @Column(name = "note")
//    private String note;
////    @OneToMany(mappedBy = "clazzByClassid")
////    private Collection<Student> studentsById;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
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
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Class aClass = (Class) o;
//        return id == aClass.id && Objects.equals(name, aClass.name) && Objects.equals(note, aClass.note);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name, note);
//    }
//
////    public Collection<Student> getStudentsById() {
////        return studentsById;
////    }
////
////    public void setStudentsById(Collection<Student> studentsById) {
////        this.studentsById = studentsById;
////    }
//}
