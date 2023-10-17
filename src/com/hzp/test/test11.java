package com.hzp.test;

/**
 * @BelongsProject: JavaSchool
 * @BelongsPackage: com.hzp.test
 * @Author: ASUS
 * @CreateTime: 2023-10-08  14:39
 * @Description: TODO
 * @Version: 1.0
 */
public class test11 {

    public static void main(String[] args) {
        int number = 0,capital_letter = 0, lower_letter = 0 ,blank = 0, otherChar = 0;
        int temp=0;
        for (int j=0;j< args.length;j++){
            for (int i=0;i< args[j].length();i++){
                if(args[j].charAt(i)== '\\' && args[j].charAt(i+1)=='n'){
                    temp=1;
                    System.out.println("args[j].charAt(i):"+args[j].charAt(i));
                    break;
                }
                if(args[j].charAt(i)>='0'&&args[j].charAt(i)<='9'){
                    number++;
                }else if(args[j].charAt(i)>='A'&&args[j].charAt(i)<='Z'){
                    capital_letter++;
                }else if(args[j].charAt(i)>='a'&&args[j].charAt(i)<='z'){
                    lower_letter++;
                }else if (args[j].charAt(i)==' '){
                    blank++;
                }else {
                    otherChar++;
                }
            }
            if(temp==1){
                break;
            }
        }
        System.out.println("数字有："+number+"个");
        System.out.println("大写字母有："+capital_letter+"个");
        System.out.println("小写字母有："+lower_letter+"个");
        System.out.println("空格有："+blank+"个");
        System.out.println("其他字符有："+otherChar+"个");
    }
}
