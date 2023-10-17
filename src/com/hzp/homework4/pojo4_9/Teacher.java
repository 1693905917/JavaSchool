package com.hzp.homework4.pojo4_9;

import java.util.Objects;

/**
 * @BelongsProject: JavaSchool
 * @BelongsPackage: com.hzp.homework4.pojo4_9
 * @Author: ASUS
 * @CreateTime: 2023-10-17  15:09
 * @Description: TODO
 * @Version: 1.0
 */
public class Teacher implements Comparable {
    private int no;
    private String name;
    private int age;
    private  String seminary;

    public Teacher(int no, String name, int age, String seminary) {
        this.no = no;
        this.name = name;
        this.age = age;
        this.seminary = seminary;
    }

    @Override
    public String toString() {
        return "no: "+no+", name: "+name+", age: "+age+", seminary: "+seminary+"";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return no == teacher.no && age == teacher.age && Objects.equals(name, teacher.name) && Objects.equals(seminary, teacher.seminary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, name, age, seminary);
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
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

    public String getSeminary() {
        return seminary;
    }

    public void setSeminary(String seminary) {
        this.seminary = seminary;
    }

    @Override
    public int compareTo(Object o) {
        Teacher t=(Teacher) o;
        if(this.no<t.no){
            return -1;
        }
        if(this.no>t.no){
            return 1;
        }
        return 0;
    }
}
