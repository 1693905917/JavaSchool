package com.hzp.test;

/**
 * @BelongsProject: JavaSchool
 * @BelongsPackage: com.hzp.test
 * @Author: ASUS
 * @CreateTime: 2023-10-08  14:27
 * @Description: TODO
 * @Version: 1.0
 */
public class test10 {
    public static void main(String[] args) {
        System.out.println("while循环遍历：");
        whileTest();
        System.out.println("doWhile循环遍历：");
        doWhileTest();
        System.out.println("for循环遍历：");
        forTest();
    }

    //while循环
    public static void whileTest(){
        int i=100,a,b,c;

        while(i<1000){
            a=i/100;
            b=i/10-a*10;
            c=i%10;
            if(a*a*a+b*b*b+c*c*c==i){
                System.out.println("a:"+a+"  b:"+b+"  c:"+c);
            }
            i++;
        }
    }

    //do-while循环
    public static void doWhileTest(){
        int i=100,a,b,c;
        do {
            a=i/100;
            b=i/10-a*10;
            c=i%10;
            if(a*a*a+b*b*b+c*c*c==i){
                System.out.println("a:"+a+"  b:"+b+"  c:"+c);
            }
            i++;
        }while (i<1000);
    }

    //for循环
    public static void forTest(){
        int i,a,b,c;
        for (i=100; i < 1000; i++) {
            a=i/100;
            b=i/10-a*10;
            c=i%10;
            if(a*a*a+b*b*b+c*c*c==i){
                System.out.println("a:"+a+"  b:"+b+"  c:"+c);
            }
        }
    }
}
