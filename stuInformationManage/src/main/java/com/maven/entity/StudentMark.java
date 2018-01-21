package com.maven.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by admin on 2018/1/17.
 *
 * 成绩表
 */
@Entity
@Table(name = "tb_studentmark")
public class StudentMark implements Serializable{

    private int sm_no;
    private String sm_name;
    private int sm_yw;
    private int sm_sx;
    private int sm_yy;
    private int sm_zh;
    private int sm_ty;

    //多个成绩对应一个学生映射关系
    private Student s;

    public StudentMark() {
    }

    public StudentMark(int sm_no, String sm_name, int sm_yw, int sm_sx, int sm_yy, int sm_zh, int sm_ty, Student s) {
        this.sm_no = sm_no;
        this.sm_name = sm_name;
        this.sm_yw = sm_yw;
        this.sm_sx = sm_sx;
        this.sm_yy = sm_yy;
        this.sm_zh = sm_zh;
        this.sm_ty = sm_ty;
        this.s = s;
    }

    public StudentMark(int sm_no, int sm_yw, int sm_sx, int sm_yy, int sm_zh, int sm_ty) {
        this.sm_no = sm_no;
        this.sm_yw = sm_yw;
        this.sm_sx = sm_sx;
        this.sm_yy = sm_yy;
        this.sm_zh = sm_zh;
        this.sm_ty = sm_ty;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getSm_no() {
        return sm_no;
    }

    public void setSm_no(int sm_no) {
        this.sm_no = sm_no;
    }

    public String getSm_name() {
        return sm_name;
    }

    public void setSm_name(String sm_name) {
        this.sm_name = sm_name;
    }

    public int getSm_yw() {
        return sm_yw;
    }

    public void setSm_yw(int sm_yw) {
        this.sm_yw = sm_yw;
    }

    public int getSm_sx() {
        return sm_sx;
    }

    public void setSm_sx(int sm_sx) {
        this.sm_sx = sm_sx;
    }

    public int getSm_yy() {
        return sm_yy;
    }

    public void setSm_yy(int sm_yy) {
        this.sm_yy = sm_yy;
    }

    public int getSm_zh() {
        return sm_zh;
    }

    public void setSm_zh(int sm_zh) {
        this.sm_zh = sm_zh;
    }

    public int getSm_ty() {
        return sm_ty;
    }

    public void setSm_ty(int sm_ty) {
        this.sm_ty = sm_ty;
    }

    @ManyToOne
    @JoinColumn(name = "sms_no")
    public Student getS() {
        return s;
    }
    public void setS(Student s) {
        this.s = s;
    }
}
