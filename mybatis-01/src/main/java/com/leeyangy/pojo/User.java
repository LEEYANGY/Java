package com.leeyangy.pojo;

import java.util.Date;

/**
 * Created by leeyangy on 2021/6/25 22:12
 */

public class User {
    private int id;
    private int age;
    private Date birthday;
    private String username;

//        public User() {
//    }
//    public User(int id,int age,Date birthday,String username){
//        this.id=id;
//        this.age=age;
//        this.birthday=birthday;
//        this.username=username;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", birthday=" + birthday +
                ", username='" + username + '\'' +
                '}';
    }
}
