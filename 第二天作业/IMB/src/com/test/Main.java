package com.test;

import com.homework.Phone;

public class Main {
	public static void main(String[] args) {
		Phone phone = new Phone();
		phone.setScreenSzie(12.0);
		phone.setBrand("华为");
		phone.setCpu("酷睿i7");
		phone.setMemory(16);
		System.out.println("屏幕尺寸:"+phone.getScreenSzie()+"\n"+"配牌:"+phone.getBrand()+"\n"+"处理器:"+phone.getCpu()+"\n"+"内存:"+phone.getMemory()+"\n");
	}
}
