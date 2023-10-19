package com.hzp.JavaTest2.test9;

/**
 * @BelongsProject: JavaSchool
 * @BelongsPackage: com.hzp.JavaTest2.test9
 * @Author: ASUS
 * @CreateTime: 2023-10-19  16:21
 * @Description: TODO
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //创建一个电风扇对象，用ｆ表示
        Fan f = new Fan();
        Fan f2 = new Fan(f);
        //加速一次电风扇
        f.addSpeed();
        //向控制台输出f的状态和速度；
        f.getFanStatusAndSpeed();
        //启动电风扇(调用对象的开关方法)；
        f.setStatus("working");
        //向控制台输出f的状态和速度；
        f.getFanStatusAndSpeed();
        //连续加速４次(考虑发生什么情况)；
        f.addSpeed();
        f.getFanStatusAndSpeed();
        f.addSpeed();
        f.getFanStatusAndSpeed();
        f.addSpeed();
        f.getFanStatusAndSpeed();
        f.addSpeed();
        //向控制台输出f的状态和速度；
        f.getFanStatusAndSpeed();
        //连续减速４次(考虑发生什么情况)；
        f.reduceSpeed();
        f.getFanStatusAndSpeed();
        f.reduceSpeed();
        f.getFanStatusAndSpeed();
        f.reduceSpeed();
        f.getFanStatusAndSpeed();
        f.reduceSpeed();
        //向控制台输出f的状态和速度；
        f.getFanStatusAndSpeed();
    }
}
