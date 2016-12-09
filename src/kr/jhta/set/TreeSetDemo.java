package kr.jhta.set;

import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> score = new TreeSet<>();
		
		score.add(50);
		score.add(100);
		score.add(67);
		score.add(47);
		score.add(86);
		
		
		System.out.println(score); //[47, 50, 67, 86, 100]
		
		// 가자아 낮은 값 찾기
		int minValue = score.first();
		System.out.println(minValue);
		
		//가장 큰 값 찾기
		int maxValue = score.last();
		System.out.println(maxValue);
		
		
	}
}
