package com.maven.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by admin on 2018/1/17.
 * 学生信息是实体类
 */
@Entity
@Table(name = "tb_student")
public class Student implements Serializable{

    private int s_no;
    private String s_name;
    private String s_sex;
    private int s_age;
    private String s_tel;
    private String s_mail;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date s_onschool;
    private int s_status=1;

    //多个学生对应一个班级的映射关系
    private StudentClass sc;

    public Student() {
    }
    public Student(int s_no, String s_name, String s_sex, int s_age, String s_tel, String s_mail, Date s_onschool, int s_status) {
        this.s_no = s_no;
        this.s_name = s_name;
        this.s_sex = s_sex;
        this.s_age = s_age;
        this.s_tel = s_tel;
        this.s_mail = s_mail;
        this.s_onschool = s_onschool;
        this.s_status = s_status;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getS_no() {
        return s_no;
    }

    public void setS_no(int s_no) {
        this.s_no = s_no;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getS_sex() {
        return s_sex;
    }

    public void setS_sex(String s_sex) {
        this.s_sex = s_sex;
    }

    public int getS_age() {
        return s_age;
    }

    public void setS_age(int s_age) {
        this.s_age = s_age;
    }

    public String getS_tel() {
        return s_tel;
    }

    public void setS_tel(String s_tel) {
        this.s_tel = s_tel;
    }

    public String getS_mail() {
        return s_mail;
    }

    public void setS_mail(String s_mail) {
        this.s_mail = s_mail;
    }

    @Column(columnDefinition = "date")

    public Date getS_onschool() {
        return s_onschool;
    }

    public void setS_onschool(Date s_onschool) {
        this.s_onschool = s_onschool;
    }

    public int getS_status() {
        return s_status;
    }

    public void setS_status(int s_status) {
        this.s_status = s_status;
    }

    @ManyToOne
    @JoinColumn(name = "ssc_no")
    public StudentClass getSc() {
        return sc;
    }

    public void setSc(StudentClass sc) {
        this.sc = sc;
    }
}
