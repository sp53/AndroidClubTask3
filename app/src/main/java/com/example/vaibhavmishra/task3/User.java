package com.example.vaibhavmishra.task3;

public class User {
    private String name;
    private String regno;
    private int age;

    User() {}

    User(String n, String r, int a) {
        name=n;
        regno=r;
        age=a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Name: "+getName()+"\n"+
                "Registration Number: "+getRegno()+"\n"+
                "Age: "+getAge()+"\n";
    }

}
