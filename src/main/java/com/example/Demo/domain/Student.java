package com.example.Demo.domain;

import lombok.Value;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.Null;
import java.sql.Date;

@Entity
@Table(name = "user")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;
    private String name;
    private int phone_no;
    private String email;
    private String address;
    private Date reg_date;
    private String password;
    @Column(nullable = true, length = 64)
    private String upload_photo;


    public  Student()
    { }

    public Student(int user_id, String name, int phone_no, String email, String address, Date reg_date, String password, String upload_photo) {
        this.user_id = user_id;
        this.name = name;
        this.phone_no = phone_no;
        this.email = email;
        this.address = address;
        this.reg_date = reg_date;
        this.password = password;
        this.upload_photo = upload_photo;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(int phone_no) {
        this.phone_no = phone_no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getReg_date() {
        return reg_date;
    }

    public void setReg_date(Date reg_date) {
        this.reg_date = reg_date;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUpload_photo() {
        return upload_photo;
    }

    public void setUpload_photo(String upload_photo) {
        this.upload_photo = upload_photo;
    }
}