package com.hzp.PTA5.test2;

/**
 * @BelongsProject: JavaSchool
 * @BelongsPackage: com.hzp.PTA5.test2
 * @Author: ASUS
 * @CreateTime: 2023-11-16  22:53
 * @Description: TODO
 * @Version: 1.0
 */
class Father{

    int num = 10;
}

class Son extends Father{

    int num = 20;
    public void print() {
        System.out.println(
                super.num
        );   //写变量，使输出内容为Father类的num值
    }
}
public class test {
    public static void main(String[] args) {
        Son s = new Son();
        s.print();
    }
}
