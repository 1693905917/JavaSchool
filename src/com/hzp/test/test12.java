package com.hzp.test;

import java.util.Random;

/**
 * @BelongsProject: JavaSchool
 * @BelongsPackage: com.hzp.test
 * @Author: ASUS
 * @CreateTime: 2023-10-08  15:23
 * @Description: TODO
 * @Version: 1.0
 */
public class test12 {
    public static void main(String[] args) {
        int sum=0;
        int money;
        for(int i=0;i<10;i++){
            money=show();
            sum+=money;
        }
        if(sum>0){
            System.out.println("最终得到了:"+sum);
        }else if(sum<0){
            System.out.println("最终输了:"+sum);
        }else {
            System.out.println("没赢也没有亏");
        }



//        System.out.println("x:"+x);
//        System.out.println("y:"+y);
//        System.out.println("z:"+z);

    }

    public static int show(){
        int sum=0;
        Random rand1 = new Random( );
        Random rand2 = new Random( );
        Random rand3 = new Random( );
        int x = rand1.nextInt(5)+1;
        int y = rand2.nextInt(6)+1;
        int z = rand3.nextInt(6)+1;

//        int x = 6;
//        int y = 5;
//        int z = 4;

        if(x==6&&y==6&&z==6){
            System.out.println("玩家丢的点数分别为"+x+"--"+y+"--"+z);
            System.out.println("赢得:"+20+"元");
            return 20;
        }else if(x==y&&y==z&&x==z){
            System.out.println("玩家丢的点数分别为"+x+"--"+y+"--"+z);
            System.out.println("赢得:"+10+"元");
            return 10;
        }else if(x==y||y==z||x==z){
            System.out.println("玩家丢的点数分别为"+x+"--"+y+"--"+z);
            System.out.println("赢得:"+5+"元");
            return 5;
        }else {
            System.out.println("玩家丢的点数分别为"+x+"--"+y+"--"+z);
            System.out.println("输了:"+5+"元");
            return -5;
        }
    }
}
