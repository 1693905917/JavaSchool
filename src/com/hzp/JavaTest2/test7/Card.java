package com.hzp.JavaTest2.test7;



import java.util.ArrayList;
import java.util.List;

/**
 * @BelongsProject: JavaSchool
 * @BelongsPackage: com.hzp.JavaTest2.test7
 * @Author: ASUS
 * @CreateTime: 2023-10-19  14:37
 * @Description: TODO
 * @Version: 1.0
 */
public class Card {
    private  char suit; //花色
    private  String rank; //牌面值

    public Card() {
    }

    public Card(char suit,String rank) {
        this.suit = suit;
        this.rank = rank;
    }
    public String toString() {
        return suit + rank;
    }

}
