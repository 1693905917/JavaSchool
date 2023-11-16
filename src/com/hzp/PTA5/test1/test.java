package com.hzp.PTA5.test1;

/**
 * @BelongsProject: JavaSchool
 * @BelongsPackage: com.hzp.PTA5.test1
 * @Author: ASUS
 * @CreateTime: 2023-11-16  22:52
 * @Description: TODO
 * @Version: 1.0
 */
class Father {
    int a;
    public Father(int a) {
        this.a=a;
    }
    public void print() {
        System.out.println(a);
    }
}

class Child extends Father {
    int a;
    public Child(int a) {

        super(a);
        // 将形参a的数值赋给父类成员变量a

        this.a=super.a*10;
        // 将父类成员变量a的值*10赋给本类的成员变量a
    }
    public void print() {
        System.out.println(super.a);    // 输出父类成员变量a的值
        System.out.println(
                this.a
        );      // 输出子类成员变量a的值
    }
}
public class test {
    public static void main(String[] args) {
        Child child=new Child(10);
        child.print();
    }
}
