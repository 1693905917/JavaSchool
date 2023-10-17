package com.hzp.homework4.pojo4_5;

/**
 * @BelongsProject: JavaSchool
 * @BelongsPackage: com.hzp.homework4.pojo4_5
 * @Author: ASUS
 * @CreateTime: 2023-10-17  14:02
 * @Description: TODO
 * @Version: 1.0
 */
public class Student {

    private String name;
    private String sex;
    private int age;

    public Student(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
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

    @Override
    public String toString() {
        return "Student [name='"+name+"', sex='"+sex+"', age="+age+"]";
    }
}
