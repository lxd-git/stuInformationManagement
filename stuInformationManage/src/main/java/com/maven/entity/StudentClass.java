package com.maven.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by admin on 2018/1/17.
 *
 * 班级的实体类
 */
@Entity
@Table(name = "tb_studentclass")
public class StudentClass implements Serializable{
    private int sc_no;
    private String sc_name;

    public StudentClass() {
    }
    public StudentClass(int sc_no, String sc_name) {
        this.sc_no = sc_no;
        this.sc_name = sc_name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getSc_no() {
        return sc_no;
    }

    public void setSc_no(int sc_no) {
        this.sc_no = sc_no;
    }

    public String getSc_name() {
        return sc_name;
    }

    public void setSc_name(String sc_name) {
        this.sc_name = sc_name;
    }
}
