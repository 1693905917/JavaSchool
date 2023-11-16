package com.hzp.PTA5.test3;

/**
 * @BelongsProject: JavaSchool
 * @BelongsPackage: com.hzp.PTA5.test3
 * @Author: ASUS
 * @CreateTime: 2023-11-16  23:07
 * @Description: TODO
 * @Version: 1.0
 */
public class test {
    public static void main(String[] args)
    {
        Cat c = new Cat("加菲猫",8);
        c.eat();
        c.sleep();

        JumpCat jc = new JumpCat("跳高猫",3);
        jc.eat();
        jc.sleep();
        jc.jump();
    }
}
abstract class Animal
{
    private String name;
    private int age;
    public Animal(){
    }
    //空参构造
    public Animal(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return age;
    }


    abstract void eat();
//公共的无返回值的抽象方法eat()

    abstract void sleep();
//公共的无返回值的抽象方法sleep()
}

interface Jumping
{

    public void jump();
//公共无返回值的jump()方法
}

class Cat extends Animal
{
    public Cat(){}
    public Cat(String name,int age)
    {
        super(name,age);
    }

    public void eat()
    {
        System.out.println(getName() + "吃鱼");
    }

    public void sleep()
    {
        System.out.println(super.getName() + "侧着睡");
    }
}

class JumpCat extends Cat implements Jumping
{
    public JumpCat(){
    }
    //空参构造
    public JumpCat(String name, int age)
    {
        super(name,age);
    }
    public void jump()
    {
        System.out.println(super.getName() + "跳高");
    }
}
