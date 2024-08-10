package com.simple.git;

class ClassA {
	int a = 10;
	String s = "Amog";

	void walk() {
		System.out.println("I am walking......");
	}
}

class ClassB extends ClassA {
	int b = 20;
	String s1 = "abc";

	void run() {
		System.out.println("I am Running.......");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassB obj = new ClassB();
		obj.walk();
		obj.walk();

	}

}
