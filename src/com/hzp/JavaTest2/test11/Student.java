package com.hzp.JavaTest2.test11;

/**
 * @BelongsProject: JavaSchool
 * @BelongsPackage: com.hzp.JavaTest2.test11
 * @Author: ASUS
 * @CreateTime: 2023-10-19  16:00
 * @Description: TODO
 * @Version: 1.0
 */
public class Student {
    private long studentID;
    private int classID;
    private String name;
    private String sex;
    private int age;
    public Student(long studentID,int classID,String name,String sex,int age){
        this.studentID=studentID;
        this.classID=classID;
        this.name=name;
        this.sex=sex;
        this.age=age;
    }
    public long getStudentID(){
        return studentID;
    }
    public int getClassID(){
        return classID;
    }
    public String getName(){
        return name;
    }
    public String getSex(){
        return sex;
    }
    public int getAge(){
        return age;
    }
    public String toString(){
        return "学号："+getStudentID()+"\n 班号："+getClassID()+"\n 姓名："+getName()+"\n 性别："+getSex()+"\n 年龄："+getAge();
    }



}
