//package com.example.stringboot.StudentManagement.Model;
//
//import javax.persistence.*;
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.Email;
//import java.util.Collection;
//
//@Entity
//public class Student {
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Id
//    @Column(name = "id")
//    @NotBlank(message = "Id is mandatory")
//    private int id;
//    @Basic
//    @Column(name = "code")
//    @NotBlank(message = "Code is mandatory")
//    private String code;
//    @Basic
//    @Column(name = "name")
//    @NotBlank(message = "Name is mandatory")
//    private String name;
//    @Basic
//    @Column(name = "address")
//    @NotBlank(message = "Address is mandatory")
//    private String address;
//    @Basic
//    @Column(name = "phone")
//    @NotBlank(message = "Phone is mandatory")
//    private String phone;
//    @Basic
//    @Email
//    @Column(name = "email")
//    @NotBlank(message = "Email is mandatory")
//    private String email;
////    @Basic
////    @Column(name = "classid")
////    private Integer classid;
//    @OneToMany(mappedBy = "studentByIdsv")
//    private Collection<Mark> marksById;
//
////    @ManyToOne
////    @JoinColumn(name = "classid", referencedColumnName = "id")
////    @NotBlank(message = "Class Id is mandatory")
////    private Class clazzByClassid;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getCode() {
//        return code;
//    }
//
//    public void setCode(String code) {
//        this.code = code;
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
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//
//
////    @Override
////    public boolean equals(Object o) {
////        if (this == o) return true;
////        if (o == null || getClass() != o.getClass()) return false;
////        Student student = (Student) o;
////        return id == student.id && Objects.equals(code, student.code) && Objects.equals(name, student.name) && Objects.equals(address, student.address) && Objects.equals(phone, student.phone) && Objects.equals(email, student.email) && Objects.equals(classid, student.classid);
////    }
//
////    @Override
////    public int hashCode() {
////        return Objects.hash(id, code, name, address, phone, email, classid);
////    }
//
//    public Collection<Mark> getMarksById() {
//        return marksById;
//    }
//
//    public void setMarksById(Collection<Mark> marksById) {
//        this.marksById = marksById;
//    }
//
////    public Class getClazzByClassid() {
////        return clazzByClassid;
////    }
////
////    public void setClazzByClassid(Class clazzByClassid) {
////        this.clazzByClassid = clazzByClassid;
////    }
//}
