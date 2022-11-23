//package com.example.stringboot.StudentManagement.Model;
//
//import javax.persistence.*;
//import javax.validation.constraints.Max;
//import javax.validation.constraints.Min;
//import javax.validation.constraints.NotBlank;
//import java.util.Collection;
//import java.util.Objects;
//
//@Entity
//public class Subject {
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Id
//    @Column(name = "id")
//    @NotBlank(message = "Id is mandatory")
//    private int id;
//    @Basic
//    @Column(name = "name")
//    @NotBlank(message = "Name is mandatory")
//    private String name;
//    @Basic
//    @Column(name = "description")
//    private String description;
//    @Basic
//    @Column(name = "sem")
//    @NotBlank(message = "Sem is mandatory")
//    private Integer sem;
//    @Basic
//    @Column(name = "duration")
//    @Min(value = 0,message = "Duration cant be lower than 0")
//    @Max(value = 200,message = "Duration cant be higher than 200")
//    private Integer duration;
//    @OneToMany(mappedBy = "subjectByIdsub")
//    private Collection<Mark> marksById;
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
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public Integer getSem() {
//        return sem;
//    }
//
//    public void setSem(Integer sem) {
//        this.sem = sem;
//    }
//
//    public Integer getDuration() {
//        return duration;
//    }
//
//    public void setDuration(Integer duration) {
//        this.duration = duration;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Subject subject = (Subject) o;
//        return id == subject.id && Objects.equals(name, subject.name) && Objects.equals(description, subject.description) && Objects.equals(sem, subject.sem) && Objects.equals(duration, subject.duration);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name, description, sem, duration);
//    }
//
//    public Collection<Mark> getMarksById() {
//        return marksById;
//    }
//
//    public void setMarksById(Collection<Mark> marksById) {
//        this.marksById = marksById;
//    }
//}
