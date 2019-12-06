package com.palak.threading_6dec;

//
//class Hi {
//	public void show() {
//		for (int i = 1; i <= 5; i++) {
//			System.out.println("Hi!");
//			//Thread.sleep(500);//Checked Exception
//			try{Thread.sleep(100);}catch(Exception e){}//so, try catch blocks to avoid exception,also time is in miliseconds
//		}
//	}
//}
//
//class Hello {
//	public void show() {
//		for (int i = 1; i <= 5; i++) {
//			System.out.println("Hello!");
//			try{Thread.sleep(500);}catch(Exception e){}//try catch blocks to avoid exception
//		}
//	}
//}
//
//public class ThreadDemo {
//	public static void main(String[] args) {
//		Hi obj1 = new Hi();
//		Hello obj2 = new Hello();
//
//		obj1.show();
//		obj2.show();
//	}
//}

/**
 * Getting both the methods simultaneously using thread concept
 * @author 806760
 *
 */

//class Hi extends Thread {
//	public void run() {
//		for (int i = 1; i <= 5; i++) {
//			System.out.println("Hi!");
//			//Thread.sleep(500);//Checked Exception
//			try{Thread.sleep(100);}catch(Exception e){}//so, try catch blocks to avoid exception,also time is in miliseconds
//		}
//	}
//}
//
//class Hello extends Thread{
//	public void run() {
//		for (int i = 1; i <= 5; i++) {
//			System.out.println("Hello!");
//			try{Thread.sleep(100);}catch(Exception e){}//try catch blocks to avoid exception
//		}
//	}
//}
//
//public class ThreadDemo {
//	public static void main(String[] args) {
//		Hi obj1 = new Hi();//this has now become an object of thread since it extends thread
//		Hello obj2 = new Hello();
//		
//		obj1.start();//Start internally call run method
//		try{Thread.sleep(10);}catch(Exception e){}//proper order takes palce
//		obj2.start();//run is the internal method of start so always override the run method in the above class
//
////		obj1.run();
////		obj2.run();
//	}
//}

/**
 * Implementing the concept of Thread using Runnable.
 * @author 806760
 *
 */

//
//class Hi implements Runnable{
//	public void run() {
//		for (int i = 1; i <= 5; i++) {
//			System.out.println("Hi!");
//			//Thread.sleep(500);//Checked Exception
//			try{Thread.sleep(100);}catch(Exception e){}//so, try catch blocks to avoid exception,also time is in miliseconds
//		}
//	}
//}
//
//class Hello implements Runnable{
//	public void run() {
//		for (int i = 1; i <= 5; i++) {
//			System.out.println("Hello!");
//			try{Thread.sleep(100);}catch(Exception e){}//try catch blocks to avoid exception
//		}
//	}
//}
//
//public class ThreadDemo {
//	public static void main(String[] args) {
//		Runnable obj1 = new Hi();//creating object of Runnable
//		Runnable obj2 = new Hello();
//		
//		Thread t1=new Thread(obj1);//creating object of Thread and pass the object Runnable
//		Thread t2=new Thread(obj2);
//		
//		
//		t1.start();
//		try{Thread.sleep(10);}catch(Exception e){}
//		t2.start();
//
//	}
//}
//

/**
 * Reducing the number of lines and make it more efficient
 */

public class ThreadDemo {
	public static void main(String[] args) {
		Runnable obj1 = new Runnable()
				{
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println("Hi!");
					//Thread.sleep(500);//Checked Exception
					try{Thread.sleep(100);}catch(Exception e){}//so, try catch blocks to avoid exception,also time is in miliseconds
				}
			}
		
				};
		Runnable obj2 = new Runnable()
		{
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println("Hello!");
					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}
				}
		};
		
		
		Thread t1=new Thread(obj1);//creating object of Thread and pass the object Runnable
		Thread t2=new Thread(obj2);
		
		
		t1.start();
		try{Thread.sleep(10);}catch(Exception e){}
		t2.start();

	}
}
