package com.example.myfirebase;

import java.util.PriorityQueue;

public class Details {
    private String name;
    private int age;
    private Long mobile;

    private void clearValues(){
        name="";
        age=0;
        mobile= Long.valueOf(0);
    }

    public Details() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }
}
