package com.test;

import com.homework.Phone;

public class Main {
	public static void main(String[] args) {
		Phone phone = new Phone();
		phone.setScreenSzie(12.0);
		phone.setBrand("��Ϊ");
		phone.setCpu("���i7");
		phone.setMemory(16);
		System.out.println("��Ļ�ߴ�:"+phone.getScreenSzie()+"\n"+"����:"+phone.getBrand()+"\n"+"������:"+phone.getCpu()+"\n"+"�ڴ�:"+phone.getMemory()+"\n");
	}
}
