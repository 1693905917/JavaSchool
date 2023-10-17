package com.hzp.homework4.pojo7_14;

/**
 * @BelongsProject: JavaSchool
 * @BelongsPackage: com.hzp.homework4.pojo7_14
 * @Author: ASUS
 * @CreateTime: 2023-10-17  17:16
 * @Description: TODO
 * @Version: 1.0
 */
public class Person {
    private String name;
    private int age;

    public Person() {
        this.name = "none";
        this.age = 1;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
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
}
