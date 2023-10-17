package com.hzp.homework4.pojo4_1;

/**
 * @BelongsProject: JavaSchool
 * @BelongsPackage: com.hzp.homework4.pojo
 * @Author: ASUS
 * @CreateTime: 2023-10-17  13:11
 * @Description: TODO
 * @Version: 1.0
 */
public class Student {
    private String sid;
    private String name;
    private int age;
    private String major;

    public Student() {
    }

    public Student(String sid, String name, int age, String major) {
        if(age>0){
            this.sid = sid;
            this.name = name;
            this.age = age;
            this.major = major;
        }
    }

    public void print(){
        System.out.println("学号："+sid+"，姓名："+name+"，年龄："+age+"，专业："+major);
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
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
        if(age>0){
            this.age = age;
        }
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
