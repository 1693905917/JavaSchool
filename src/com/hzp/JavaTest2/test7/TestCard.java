package com.hzp.JavaTest2.test7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @BelongsProject: JavaSchool
 * @BelongsPackage: com.hzp.JavaTest2.test7
 * @Author: ASUS
 * @CreateTime: 2023-10-19  14:39
 * @Description: TODO
 * @Version: 1.0
 */
public class TestCard {

    private  final static char[] suits = {'♥','♠','♣','♦'};  //四种花色

    public static void main(String[] args) {
        System.out.println("初始化牌:");
        List<Card> cards = TestCard.buyCard();
        for (Card card : cards) {
            System.out.print(card+"\t");
        }
        TestCard.shuffle(cards);
        System.out.println();
        System.out.println("第一次洗牌:");
        for (Card card : cards) {
            System.out.print(card+"\t");
        }
        System.out.println();
        System.out.println("第二次洗牌:");
        TestCard.shuffle(cards);
        for (Card card : cards) {
            System.out.print(card+"\t");
        }
    }

    //洗牌
    public static List<Card> buyCard(){  //假设买的牌没有大小王，只有1-13
        ArrayList<Card> cards = new ArrayList<>();
        //52张牌，四种花色
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13; j++) {
                cards.add(new Card(suits[i],String.valueOf(j))); //一张牌
            }
        }
        return cards; //返回52张牌
    }

    private static void swap(List<Card> cards,int i,int j){ //换牌
        Card tmp = cards.get(i); //获取i下标的元素
        cards.set(i,cards.get(j)); //获取j下标的元素给i下标
        cards.set(j,tmp); //重置j下标的值为tmp
    }

    public static  void shuffle(List<Card> cards){  //洗牌
        int size = cards.size();  // size=52
        for (int i = size-1; i > 0; i--) {  //从最后一张牌开始换牌
            Random random = new Random(); //生成随机数
            int rand = random.nextInt(i); //生成0到i-1的下标
            swap(cards,i,rand);
        }
    }

}
