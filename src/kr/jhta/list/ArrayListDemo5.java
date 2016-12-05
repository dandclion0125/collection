package kr.jhta.list;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListDemo5 {
	
	// 콜렉션과 제목을 전달받아서 책정보를 반환하는 메소드
	
	// 콜렉션과 최소가격, 최대가격을 전달받아서 그 가격범위에 포함된 책 정보를 반환하는 메소드
	
	// 콜렉션과 출판사를 전달받아서 그 출판사에서 출판한 책 정보를 반환하는 메소드
	
	// 콜렉션을 전달받아서 출판사 정보를 반환하는 메소드
	
	public static HashSet<String> collectionPublisher(ArrayList<Book> books) {
		HashSet<String> publisherSet = new HashSet<>();
		
		for(Book book: books) {
			publisherSet.add(book.getPublisher());
		}
		return publisherSet;
	}
	
	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<>();
		
		books.add(new Book("이것이 자바다","신용권","한빛미디어",30000));
		books.add(new Book("점프 투 파이썬","박응용","이지스퍼블",18000));
		books.add(new Book("열혈 씨 프로그래밍","김응용","오렝지지지지",25000));
		books.add(new Book("파이썬 웨 크롤러","이응용","한빛미디어",24000));
		books.add(new Book("텐서플로 첫걸음","최응용","한빛미디어",16000));
		books.add(new Book("자바의정석","갑을용","도우도우",30000));
		books.add(new Book("앵글러제이에스","정응용","위키북스",27000));
		books.add(new Book("모두의 파이썬","윤성우","길벗",12000));
		books.add(new Book("자바8인 액션","우정은","한빛미디어",28000));
		books.add(new Book("자바스크립트 패턴과 테스트","이일웅","길벗",38000));
		
		ArrayList<Book> result1 = getNameByBookList(books, "파이썬");
		System.out.println("========키워드별 검색결과========");
		for (Book bk: result1) {
			
			System.out.println(bk.getTitle() + ", " + bk.getAuthor() + ", " + bk.getPublisher() + ", " + bk.getPrice() );
		}
		
		ArrayList<Book> result2 = searchBooksByPrice(books, 18000, 30000);
		System.out.println("========최소최대 금액 사이의 검색결과========");
		for (Book bk:result2) {
			System.out.println(bk.getTitle() + ", " + bk.getAuthor() + ", " + bk.getPublisher() + ", " + bk.getPrice() );
		}
		
		ArrayList<Book> result3 = searchBooksByPublishr(books, "한빛미디어");
		System.out.println("========출판사별 검색결과========");
		for (Book bk:result3) {
			System.out.println(bk.getTitle() + ", " + bk.getAuthor() + ", " + bk.getPublisher() + ", " + bk.getPrice() );		
		
		}
		
		HashSet<String> result4 = collectionPublisher(books);
		for(String pub: result4){
			System.out.println(pub);
		}
		
	}
	public static ArrayList<Book> getNameByBookList(ArrayList<Book> books, String keyword) {
		ArrayList<Book> result = new ArrayList<>();
		
		String lowerCaseKeyword = keyword.toLowerCase();
		
		for(Book book: books) {
			String lowerCaseTitle = book.getTitle().toLowerCase();
			if (lowerCaseTitle.contains(lowerCaseKeyword)) {
				result.add(book);
			}
		}
		return result;
		
	}
	
	public static ArrayList<Book> searchBooksByPrice(ArrayList<Book> books, int min, int max ) {
		ArrayList<Book> result = new ArrayList<>();
		for (Book book:books){
			if (book.getPrice()>=min && book.getPrice()<=max){
				result.add(book);
			}
		}
		return result;
	}
	
	public static ArrayList<Book> searchBooksByPublishr(ArrayList<Book> books, String pub) {
		ArrayList<Book> result = new ArrayList<>();
		
		for(Book book:books) {
			if(book.getPublisher().equals(pub)) {
				result.add(book);
			}
		}
		return result;
	}
	
	public static class Book {
		private String title;
		private String author;
		private String publisher;
		private int price;
		
		public Book() {}

		public Book(String title, String author, String publisher, int price) {
			super();
			this.title = title;
			this.author = author;
			this.publisher = publisher;
			this.price = price;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public String getPublisher() {
			return publisher;
		}

		public void setPublisher(String publisher) {
			this.publisher = publisher;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		@Override
		public String toString() {
			return "Book [title=" + title + ", author=" + author + ", publisher=" + publisher + ", price=" + price
					+ "]";
		}
		
		
	}
			
}
