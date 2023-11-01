package com.hzp.homework3.test2;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test1 {
	public static void main(String[] args) {
		 try{
	            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	            Date date1 = sdf.parse(args[0]);
	            Date date2 = new Date();
	            long interval = (date2.getTime() - date1.getTime()) / (24 * 60 * 60 * 1000);
	            System.out.println("总天数:"+interval);
	        } catch (Exception e){
	            System.out.println("错误");
	        }
	}
	
}
