package com.fanxiaoyudemo.myapplication.JavaBean;

import cn.bmob.v3.BmobObject;

public class User extends BmobObject{
    private String user_id="";
    private String user_name="";
    private String user_password="";

    private String gender="male";
    private String career="student";
    private String colledge="";
    private String address="";

    public String getUser_id() {
        return user_id;
    }
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getColledge() {
        return colledge;
    }

    public void setColledge(String colledge) {
        this.colledge = colledge;
    }

    public String getAdress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User(){

    }

    public User(String user_id, String user_name, String user_password, String gender, String career, String colledge, String address) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_password = user_password;
        this.gender = gender;
        this.career = career;
        this.colledge = colledge;
        this.address = address;
    }
}
