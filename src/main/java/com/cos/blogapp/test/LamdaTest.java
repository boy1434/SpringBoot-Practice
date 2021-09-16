package com.cos.blogapp.test;

// java 1.8에서  나옴 람다식 

// 1.  함수를 넘기는게 목적
// 2. 인터페이스에 함수가 무조건 하나여야 쓸수 있음.
// 3. 쓰면 코드가 간결해지고, 타입을 몰라도 된다.

interface MySupplier {
	void get() ;
}

public class LamdaTest {

	static void start(MySupplier s) {
		s.get();
	}
	
	public static void main(String[] args) {
		
		start(	() -> 	System.out.println("get함수 호출됨") );
	}
	
}
