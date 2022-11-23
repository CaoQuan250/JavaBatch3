package com.example.stringboot.CarRental.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
public class Customer {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "age")
    private Integer age;

    @Basic
    @JsonFormat(pattern="dd/MM/yyyy")
    @Column(name = "birth")
    private Date birth;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "idcard")
    private String idcard;
    @Basic
    @Column(name = "job")
    private String job;
    @Basic
    @Column(name = "licence")
    private String licence;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "phone")
    private String phone;

    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    private Set<Booking> bookings;



    public Customer(long id,
                    Integer age,
                    Date birth,
                    String email,
                    String idcard,
                    String job,
                    String licence,
                    String name,
                    String phone
                    ) {
        this.id = id;
        this.age = age;
        this.birth = birth;
        this.email = email;
        this.idcard = idcard;
        this.job = job;
        this.licence = licence;
        this.name = name;
        this.phone = phone;
    }

    public Customer() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
