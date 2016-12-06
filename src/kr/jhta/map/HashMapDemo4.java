package kr.jhta.map;

import java.util.Date;
import java.util.HashMap;

public class HashMapDemo4 {
	
	public static void main(String[] args) {
		
		/*
		 * 서로 다른 타입의 값을 담는 Map객체 만들기
		 * 값의 타입이 String, Integer, Double, Date, 혹은 기타 객체
		 */
		
		// value를 Object타입으로 담을 때
		HashMap<String, Object> map = new HashMap<>();
		map.put("name", "홍길동"); 		// <String, String>
		map.put("age", 30);				// <Strign, Integer>
		map.put("weight", 68.9);		// <String, Double>
		map.put("birth", new Date());	// <String, Date>
		
		
		// 문자열 꺼낼 때
		String value1 = (String)map.get("name");
		
		// 정수 꺼낼 때
		Integer value2 = (Integer)map.get("age");
		//int value2 = (Integer)map.get("age"); // auto-unboxing 
		
		// 실수 꺼낼 때
		Double value3 = (Double) map.get("weight");
		//double value3 = (Double) map.get("weight"); // auto-unboxing
		
		// 날짜 꺼낼 때
		Date value4 = (Date) map.get("birth");
		
		
		// key에 해당하는 값을 꺼낼 때 적합하지 않은 데이타타입을 지정해도
		// 컴파일 과정에서 에러가 표시되지 않는다.
		//String value5 = (String) map.get("birth"); --> 타입이 틀리다. ClassCastException발생 
													//빨간 줄 안생긴다.
		

	}
}
