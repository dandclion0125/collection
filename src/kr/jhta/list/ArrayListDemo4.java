package kr.jhta.list;

import java.util.ArrayList;

public class ArrayListDemo4 {
	public static void displayNameByFamilyName(ArrayList<String> list, String familyName) {
		for (String newList: list) {
			String firstName = newList.substring(0, 1);
			if (familyName.equals(firstName)){
				System.out.println(newList);
				
			}
		}
	}
	
	// 정적메소드 정의하기
	// ArrayList와 "성씨"를 전달받아서 
	// 그 "성씨"에 해당하는 이름을 ArrayList에 담아서 반환하는 메소드
	
	public static ArrayList<String> getNamesByFamilyName(ArrayList<String> list, String familyName) {
		ArrayList<String> result = new ArrayList<>();
		
		for (String name:list) {
			String firstName = name.substring(0, familyName.length());
			if (familyName.equals(firstName)){
				result.add(name); 
			}
		}
		return result;
	}
	public static void main(String[] args) {
		
		// 정적메소드 정의하기
		// ArrayList와 "성씨"를 전달받아서 그 "성씨"에 해당하는 이름을 출력하는 메소드
		
		
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
		
		displayNameByFamilyName(names, "이");
		ArrayList<String> r = getNamesByFamilyName(names, "조");
		System.out.println(r);
		
		
	}
}
