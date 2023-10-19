package com.hzp.JavaTest2.test10;

import java.util.Scanner;

/**
 * @BelongsProject: JavaSchool
 * @BelongsPackage: com.hzp.JavaTest2.test10
 * @Author: ASUS
 * @CreateTime: 2023-10-19  15:54
 * @Description: TODO
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入学生个数:");
        int studentNum=sc.nextInt();
        Student[] students = new Student[studentNum];
        for (int i = 0; i < studentNum; i++) {
            String id=sc.next();
            String classId=sc.next();
            String name=sc.next();
            String sex=sc.next();
            int age=sc.nextInt();
            students[i]=new Student(id,classId,name,sex,age);
        }
        System.out.println("显示每个学生的信息:");
        for (Student student : students) {
            System.out.println(student.toString());
        }

    }
}
