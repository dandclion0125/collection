package kr.jhta.etc;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<String> names = new Stack<>();
		/*
		names.add("이순신");
		names.add("김유신");
		
		for (String n :names) {
			System.out.println(n);
		}
		*/
		
		// 스택스러운 코딩
		names.push("홍길동");
		names.push("김유신");
		names.push("강감찬");
		
		while(!names.isEmpty()){
			String name = names.pop();
			System.out.println(name);
			//강감찬
			//김유신
			//홍길동
			// 순으로 출력

		}
		
	}
}
