package kr.jhta.set;

import java.util.TreeSet;

public class TreeSetDemo2 {
	public static void main(String[] args) {
		TreeSet<Student> students = new TreeSet<>();
		// 점수가 같으면 담기지 않는다.
		students.add(new Student("홍길동",100));
		students.add(new Student("김유신",70));
		students.add(new Student("강감찬",60));
		students.add(new Student("이순신",40));
		students.add(new Student("유관순",90));
		
		System.out.println(students);
		
		Student winner = students.last();
		System.out.println(winner);
		
		
	}
	
	public static class Student implements Comparable<Student>{
		private String name;
		private int score;
		
		public Student(String name, int score) {
			super();
			this.name = name;
			this.score = score;
		}

		public String getName() {
			return name;
		}

		public int getScore() {
			return score;
		}

		@Override
		public String toString() {
			return "Student [name=" + name + ", score=" + score + "]";
		}

		@Override
		public int compareTo(Student other) { // 다른 학생과 점수를 비교
			int result = score -other.score;
			return result;
		}
		
		
	}
}
