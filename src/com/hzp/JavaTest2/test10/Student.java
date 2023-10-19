package com.hzp.JavaTest2.test10;

/**
 * @BelongsProject: JavaSchool
 * @BelongsPackage: com.hzp.JavaTest2.test10
 * @Author: ASUS
 * @CreateTime: 2023-10-19  15:52
 * @Description: TODO
 * @Version: 1.0
 */
public class Student {
    private String id;
    private String classId;
    private String name;
    private String sex;
    private int age;

    public Student(String id, String classId, String name, String sex, int age) {
        this.id = id;
        this.classId = classId;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString(){
        return "学号："+getId()+"\n 班号："+getClassId()+"\n 姓名："+getName()+"\n 性别："+getSex()+"\n 年龄："+getAge();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
