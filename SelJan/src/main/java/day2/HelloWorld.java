package day2;

import day1.Irctc;

public class HelloWorld {

	public static void main(String[] args1) {
		System.out.println("Hello World");
		m2();
	}
	public static void m2() {
		System.out.println("Inside Method 2");
		Irctc obj=new Irctc();
		obj.main(new String[]{"indhu", "mathi"});
//		obj.m3(6);
	}
}

















