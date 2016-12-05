package kr.jhta.list;

import java.util.ArrayList;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		// 방문자 이름을 저장하는 ArrayList를 생성하고
		// 방문자 이름을 여러 개 입력하기
		// "김"씨 성을 가진 사람만 새로운 ArrayList에 저장하기
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("김고은");
		names.add("공유");
		names.add("홍길동");
		names.add("김유신");
		names.add("서강준");
		names.add("유인나");
		names.add("이동욱");
		names.add("이광수");
		names.add("조진웅");
		names.add("한지민");
		names.add("김유정");
		
		ArrayList<String> newNames = new ArrayList<String>();
		for (String name:names) {
			String firstLetter = name.substring(0, 1);
			if ("김".equals(firstLetter)) { // 문자열과 비교할경우 문자를 앞에 놓는다.
				newNames.add(name);
			}	
			
		}
		System.out.println(newNames);
	}
}
