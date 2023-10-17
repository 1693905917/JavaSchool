package com.hzp.test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @BelongsProject: JavaSchool
 * @BelongsPackage: com.hzp.test
 * @Author: ASUS
 * @CreateTime: 2023-10-08  13:00
 * @Description: TODO
 * @Version: 1.0
 */
public class Test6 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("请输入个数：");
                int count = scanner.nextInt();
                int sum = 0;
                int[] numbers = new int[count];
                System.out.print("请输入：");
                for (int i = 0; i < count; i++) {
                    numbers[i] = scanner.nextInt();
                    sum+=numbers[i];
                }
                Arrays.sort(numbers);
//              System.out.println(Arrays.toString(numbers));

                int max = numbers[numbers.length-1];
                int min = numbers[0];

                double average = (double) sum / count;

                System.out.println("平均数：" + average);
                System.out.println("最大值：" + max);
                System.out.println("最小值：" + min);
                System.out.println("数的个数：" + count);
            }
}
