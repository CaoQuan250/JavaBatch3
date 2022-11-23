package com.example.stringboot.CarRental.Model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user_role", schema = "dbo", catalog = "CarRental")
public class UserRole {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(length = 10)
    private long id;

    @Column(length = 10)
    private Long userId;

    @Column(length = 10)
    private Long roleId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }


}
