package com.maven.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by admin on 2017/12/29.
 *
 * 用户信息实体类
 *
 */
@Entity
@Table(name = "tb_user")
public class Users implements Serializable {

    private int u_id;
    private String u_name;
    private String u_pwd;
    private int u_status;

    public Users() {
    }

    public Users(int u_id, String u_name, String u_pwd, int u_status) {
        this.u_id = u_id;
        this.u_name = u_name;
        this.u_pwd = u_pwd;
        this.u_status = u_status;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_pwd() {
        return u_pwd;
    }

    public void setU_pwd(String u_pwd) {
        this.u_pwd = u_pwd;
    }

    public int getU_status() {
        return u_status;
    }

    public void setU_status(int u_status) {
        this.u_status = u_status;
    }
}
