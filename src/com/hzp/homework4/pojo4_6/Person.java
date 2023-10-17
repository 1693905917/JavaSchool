package com.hzp.homework4.pojo4_6;

/**
 * @BelongsProject: JavaSchool
 * @BelongsPackage: com.hzp.homework4.pojo4_6
 * @Author: ASUS
 * @CreateTime: 2023-10-17  14:11
 * @Description: TODO
 * @Version: 1.0
 */
public class Person {
    private String name;
    private boolean gender;
    private int age;
    private static int id;
    private int num;

    {
        System.out.println("This is initialization block, id is "+id);
        num=id;
        id++;
    }
    static {
        System.out.println("This is static initialization block");
    }

    public Person() {
        System.out.println("This is constructor");
        System.out.println(name+","+age+","+gender+","+num);
    }

    public Person(String name,boolean gender, int age) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person [name="+name+", age="+age+", gender="+gender+", id="+num+"]";
    }
}
