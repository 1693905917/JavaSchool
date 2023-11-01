package com.hzp.homework3.test10;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @BelongsProject: JavaSchool
 * @BelongsPackage: com.hzp.homework3.test10
 * @Author: ASUS
 * @CreateTime: 2023-11-01  21:07
 * @Description: TODO
 * @Version: 1.0
 */
public class test1 {
    static char[] ZhenShuDanWei = {'元', '拾', '佰', '仟', '万', '亿'}; //整数只处理到亿
    static char[] XiaoShuDanWei = {'角', '分'}; //小数只处理到分
    static char[] Shuzi = {'零', '壹', '贰', '叁', '肆', '伍' ,'陆', '柒', '捌' ,'玖'};

    public static String check(char[] money) //对于零的处理应该放在最后一次遇到
    {

        String ans = new String();
        int wet = money.length - 1;

        if(wet == 0 && money[0] == '0') //处理金额为小数的情况
        {
            ans += Shuzi[0];
        }
        else
        {
            int sign = 0;//标记是否遇到0
            for(int i = 0; i < money.length; i++)
            {
                if(sign == 0 && money[i] == '0') //第一次遇到了零
                {
                    sign = 1;
                }
                else if(sign == 1 && money[i] == '0') //在一连串的零后又遇到了零
                {
                    if(i + 1 < money.length && money[i + 1] == '0') continue; //0的后面还是零且不在最后一位
                    else if(i + 1 < money.length && money[i + 1] != '0') ans += Shuzi[0]; //0的后面不是零且不在最后一位
                    else if(i == money.length - 1) continue; //到结尾还是零，无需处理
                }
                else if(sign == 1 && money[i] != '0') //在一连串的零后又遇到了非零数字
                {   sign = 0;
                    ans += Shuzi[Integer.valueOf(money[i]) - 48]; //千万注意Integer.valueOf(money[i])转换的是字符的ascll码值
                    if(i != wet) ans += ZhenShuDanWei[wet - i]; //不是最后一位才会加上单位
                }
                else if(sign == 0 && money[i] != '0') //之前一直没有遇到零
                {
                    ans += Shuzi[Integer.valueOf(money[i]) - 48];
                    if(i != wet) ans += ZhenShuDanWei[wet - i];
                }
            }
        }
        return ans;
    }

    public static String toString(double x)
    {
        DecimalFormat df = new DecimalFormat("###0.00");
        char[] money = df.format(x).toCharArray();
        String Zhen = new String(), Xiao = new String();//答案字符串

        //记录一下java本身提供的数组复制方法
        //System.arraycopy(array, 0, array2, 0, array.length);
        //(被复制的数组，从几号下标开始复制，复制到哪个数组，复制到新数组第几号下标，复制长度)
        int index = 0; //小数点的位置
        for(int i = 0; i < money.length; i++) if(money[i] == '.') {index = i; break;} //获得小数点下标位置

        //将小数和整数分开处理,将整数分解成亿，万，千
        char[] ZhenShu = new char[index];
        System.arraycopy(money, 0, ZhenShu, 0, index); //获取整数金额
        //System.out.println(ZhenShu);

        //还要修改
        int elength = 0, wlength = 0; //当存在亿位和万位时，记录其长度
        if(ZhenShu.length > 8) //亿
        {
            char[] temp = new char[ZhenShu.length - 8];
            elength = ZhenShu.length - 8; //存在时记录亿位的长度
            for(int i = 0; i < ZhenShu.length - 8; i++) temp[i] = money[i];
            Zhen +=  check(temp);
            Zhen += ZhenShuDanWei[5];
        }
        if(ZhenShu.length > 4) //万
        {
            if(ZhenShu.length > 8) //存在亿
            {
                char[] temp = new char[4];
                wlength = 4; //存在时记录万位的长度
                for(int i = 0; i < 4; i++) temp[i] = money[elength + i];
                Zhen +=  check(temp);
                Zhen += ZhenShuDanWei[4];
            }
            else
            {
                char[] temp = new char[ZhenShu.length - 4];
                wlength = ZhenShu.length - 4; //存在时记录万位的长度
                for(int i = 0; i < ZhenShu.length - 4; i++) temp[i] = money[i];
                Zhen +=  check(temp);
                Zhen += ZhenShuDanWei[4];
            }
        }

        // 千
        if(ZhenShu.length > 4) //存在万
        {
            char[] temp = new char[4];
            for(int i = 0; i < 4; i++) temp[i] = money[elength + wlength + i];
            Zhen +=  check(temp);
            Zhen += ZhenShuDanWei[0];
        }
        else
        {
            char[] temp = new char[ZhenShu.length];
            for(int i = 0; i < ZhenShu.length; i++) temp[i] = money[i];
            Zhen +=  check(temp);
            Zhen += ZhenShuDanWei[0];
        }

        char[] XiaoShu = new char[money.length - index - 1];
        System.arraycopy(money, index + 1, XiaoShu, 0, money.length - index - 1); //获取小数金额
        //System.out.println(XiaoShu);

        int isDigit = ((XiaoShu.length == 2) && (XiaoShu[0] == '0') && (XiaoShu[1] == '0')) ? 1 : 0; //金额是否是整数
        if(isDigit == 1) //如果是整数
        {
            Zhen += '整';
            return Zhen;
        }
        //处理小数
        else
        {
            if(XiaoShu.length == 2 && XiaoShu[1] == '0') //只有一位
            {
                Xiao += Shuzi[Integer.valueOf(XiaoShu[0]) - 48];
                Xiao += XiaoShuDanWei[0];
            }
            else if(XiaoShu.length == 2 && XiaoShu[0] == '0') //两位，第一位为0
            {
                Xiao += Shuzi[Integer.valueOf(XiaoShu[1]) - 48];
                Xiao += XiaoShuDanWei[1];
            }
            else //两位，都有数字
            {
                Xiao += Shuzi[Integer.valueOf(XiaoShu[0]) - 48];
                Xiao += XiaoShuDanWei[0];
                Xiao += Shuzi[Integer.valueOf(XiaoShu[1]) - 48];
                Xiao += XiaoShuDanWei[1];
            }

            return Zhen + Xiao;
        }
    }

    public static void main(String[] args)
    {
        String arg = args[0];
        double num = Double.parseDouble(arg);

        if(num == 0.0) System.out.println("零元整"); //处理特殊情况
        else System.out.println(test1.toString(num));
    }

}
