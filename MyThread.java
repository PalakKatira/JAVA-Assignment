//package com.palak.threading_6dec;
//
//public class MyThread implements Runnable {//or extends Thread,we use implemt when the MyThread class extends its parent class
//
//	int[] values={6,4,1,8,5,4};
//	public void run(){
//		for(int i=0;i<6;i++){
//			values[i]=2*values[i];
//			System.out.println(values[i]);
//		}
//	}
//	public static void main(String[] args) {//every java code has one thread by default.
//		MyThread mt=new MyThread();
//		mt.run();
//	}
//}
