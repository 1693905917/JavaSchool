package com.hzp.homework4.pojo4_2;

/**
 * @BelongsProject: JavaSchool
 * @BelongsPackage: com.hzp.homework4.pojo4_2
 * @Author: ASUS
 * @CreateTime: 2023-10-17  13:29
 * @Description: TODO
 * @Version: 1.0
 */
public class Student {
    private String studentID;
    private String name;
    private int age;
    private String sex;
    private String major;

    public Student() {
    }

    public Student(String name,String sex, String studentID,  int age,  String major) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.major = major;
    }

    public void printInfo(){
        System.out.println("姓名："+name+"，性别："+sex+"，学号："+studentID+",年龄："+age+",专业："+major);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", major='" + major + '\'' +
                '}';
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
