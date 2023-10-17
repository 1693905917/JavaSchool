package com.hzp.test5;
import java.util.Arrays;
public class InputArray {
	public static void main (String args[ ]) {
		int [] a = {1,2,3,4,500,600,700,800};
		int [] b,c,d;
		System.out.println(Arrays.toString(a));
		b = Arrays.copyOf(a,a.length);
		System.out.println(Arrays.toString(b)); 
		c =Arrays.copyOf(a, 5);//Arrays 调用 copyOf 方法复制数组 a 的前 4 个元素
		//Arrays 调用 toString 方法返回数组 c 的元素值的表示格式
		System.out.println(Arrays.toString(c));
		d = Arrays.copyOfRange(a, a.length-4, a.length);//Arrays 调用 copyOfRange 方法复制数组 a 的后 4 个元素
		System.out.println(Arrays.toString(d));
		c[c.length-1]=-100; //将-100 赋给数组 c 的最后一个元素
//		System.out.println("c"+Arrays.toString(c)); 
		d[d.length-1] = -200;
//		System.out.println("d"+Arrays.toString(d));
		System.out.println(Arrays.toString(a));
		}
}
