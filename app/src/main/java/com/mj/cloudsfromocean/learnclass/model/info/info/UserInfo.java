package com.mj.cloudsfromocean.learnclass.model.info.info;

/**
 * 模型---用户信息
 * Created by Administrator on 2017/7/1 0001.
 */
public class UserInfo {
    private String name;
    private int age;
    private String hobby;
    private String sex;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHobby() {
        return hobby;
    }

    public String getSex() {
        return sex;
    }
}
