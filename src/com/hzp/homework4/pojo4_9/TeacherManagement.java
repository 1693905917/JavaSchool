package com.hzp.homework4.pojo4_9;

import java.util.ArrayList;
import java.util.List;

/**
 * @BelongsProject: JavaSchool
 * @BelongsPackage: com.hzp.homework4.pojo4_9
 * @Author: ASUS
 * @CreateTime: 2023-10-17  15:38
 * @Description: TODO
 * @Version: 1.0
 */
public class TeacherManagement {
    private Teacher[] teachers;

    public void add(Teacher[] teachers){
        this.teachers=teachers;
    }

    public List<Teacher> search(Teacher[] teachers,String name){
        //Teacher[] newTeacher=new Teacher[teachers.length];
        List<Teacher> list=new ArrayList<>();
        int j=0;
        for (int i = 0; i < teachers.length; i++) {
            if(teachers[i].getName().equalsIgnoreCase(name)){
                list.add(teachers[i]);
            }
        }
        return list;
    }

    public List<Teacher> search(Teacher[] teachers,int age){
        //Teacher[] newTeacher=new Teacher[teachers.length];
        List<Teacher> list=new ArrayList<>();
        int j=0;
        for (int i = 0; i < teachers.length; i++) {
            if(teachers[i].getAge()==age){
                list.add(teachers[i]);
            }
        }
        return list;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

}
