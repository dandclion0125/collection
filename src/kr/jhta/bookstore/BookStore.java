package kr.jhta.bookstore;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class BookStore {

	ArrayList<Customer> customerList = new ArrayList<>();
	ArrayList<Book> bookList = new ArrayList<>();
	ArrayList<Rental> rentalList = new ArrayList<>();
	
	Scanner sc = new Scanner(System.in);

	private Customer loginedUser = null;
	
	// 가입 기능

	public BookStore(){
		Customer customer = new Customer();
		customer.setId("abcd");
		customer.setPwd("abcd1234");
		customer.setName("홍길동");
		customer.setTel("010-2222-3333");
		customer.setRegdate(new Date());
		customer.setPoint(0);
		
		customerList.add(customer);
		
		bookList.add(new Book(1,"설민석의 조선왕조 실록",20000));
		bookList.add(new Book(2,"해리포터와 저주받은 아이", 15000));
		bookList.add(new Book(3,"그럴 때 있으시죠?", 15000));
		bookList.add(new Book(4,"그릿 GRIT", 16000));
		bookList.add(new Book(5,"대통령의 글쓰기", 17000));
		bookList.add(new Book(6,"트랜드 코리아",18000));
		bookList.add(new Book(7,"브룩클린의 소녀", 13500));
		bookList.add(new Book(8,"강성태 66 공부법", 12500));
		bookList.add(new Book(9,"지대넓얕",17000));
		bookList.add(new Book(10,"미움받을 용기",13000));
	}
	
	private boolean isExistId(String id) {
		boolean isExist = false;
		for (Customer customer : customerList) {
			if (customer.getId().equals(id)) {
				isExist = true;
				break;
			}
		}
		return isExist;
	}

	// 회원등록
	public void register() {
		Customer c = new Customer();

		System.out.println("아이디를 입력하세요: ");
		String id = sc.nextLine();
		if (isExistId(id)) {
			System.out.println("이미 사용중인 아이디 입니다.");
			return;
		} else {
			c.setId(id);
		}
		System.out.println("이름을 입력하세요: ");
		c.setName(sc.nextLine());

		System.out.println("패스워드를 입력하세요: ");
		c.setPwd(sc.nextLine());
		System.out.println("전화번호를 입력하세요: ");
		c.setTel(sc.nextLine());

		System.out.println("이메일을 입력하세요: ");
		c.setEmail(sc.nextLine());
		Date now = new Date();
		c.setRegdate(now);
		c.setPoint(0);

		customerList.add(c);

	}

	// 로그인 기능
	public void login() {
		if(loginedUser != null) {
			System.out.println("이미 로그인된 사용자가 존재합니다.");
			return;
		}

		/*
		 * System.out.print("아이디를 입력하세요.: "); String logId = sc.next();
		 * 
		 * for (Customer customer: customerList) { // 입력 받은 아이디와 동일한 고객정보 찾기
		 * if(logId.equals(customer.getId())) { c = customer; // 찾은 고객 정보 c에 넣기
		 * } }
		 * 
		 * if(c == null) { // 입력 받은 값과 동일한 고객정보가 없는 경우
		 * System.out.println("아이디가 존재하지 않습니다."); return; } if(c != null) { //
		 * 패스워드의 정보확인 System.out.print("패스워드를 입력하세요.: "); String logPw =
		 * sc.next(); if(logPw.equals(c.getPwd())) {
		 * System.out.println("로그인되었습니다."); loginedUser = c; }
		 * 
		 * 
		 * }
		 */

		System.out.println("아이디를 입력하세요");
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력하세요.");
		String pwd = sc.nextLine();

		for (Customer customer : customerList) {
			
			
			if (customer.getId().equals(id)) {
				if (customer.getPwd().equals(pwd)) {
					loginedUser = customer;
					
					System.out.println("로그인되었습니다.");
				}
			}
			if (loginedUser == null) {
				System.out.println("아이디 혹은 패스워드를 다시 확인하세요.");
			}
		}

	}
	
	//로그아웃 기능
	public void logout() {
		if(loginedUser != null) {
			System.out.println("["+loginedUser.getName()+"]님 bye~~");
			loginedUser = null;
		}
	}

	// 도서정보조회하기
	public void displayBooks() {
		System.out.println("  번호\t제목\t\t\t가격");
		System.out.println("-----------------------------------------------");
		for(Book books: bookList) {
			System.out.printf("%4d %-30s %-2d\n",books.getNo(),books.getTitle(),books.getPrice());
		}
	}

	// 대여하기
	public void rentalBook() {
		
		if(loginedUser == null) {
			System.out.println("먼저 로그인을 해주세요.");
			return;
		}
		
		Rental rental = new Rental();
		System.out.println("책번호를 입력하세요: ");
		String chooseNo = sc.nextLine();
		for (Book book: bookList) {
			if(chooseNo.equals(String.valueOf(book.getNo()))) {
				System.out.println(book.getTitle()+"가 대여되었습니다.");
				rental.setBook(book);
				rental.setBack(false);
			}
		}
		rental.setRentDate(new Date());
		rental.setCustomer(loginedUser);
		
		rentalList.add(rental);
	}

	// 반납하기
	public void returnBook() {
		
		if(loginedUser == null) {
			System.out.println("먼저 로그인을 해주세요.");
			return;
		}
		System.out.println("=== 대여 중인 책 리스트 ===");
		for (Rental list:rentalList) {
			if(!list.isBack()) {
				System.out.println(list.getBook().getNo() + "  " + list.getBook().getTitle());
				
			}
		}

		System.out.println("반납할 책의 번호를 입력해 주세요");
		String chooseNo = sc.nextLine();
		
		for(Rental list:rentalList){
			if(!list.isBack()){
				if(chooseNo.equals(String.valueOf(list.getBook().getNo()))) {
					list.setBack(true);
					System.out.println(list.getBook().getTitle() + "가 반납되었습니다.");
				}
			}
		}
		
	}

	// 대여내역조회하기
	public void displayRental() {
		
		System.out.println("========["+loginedUser.getName()+"]님의 대여 내역=======");
		System.out.println("번호\t제목\t\t대여일\t반납여부");
		System.out.println("-----------------------------------------------");
		String isBack = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
		for (Rental list: rentalList) {
			if(list.isBack()){
				isBack = "반납";
			} else {
				isBack = "대여중";
			}
			System.out.printf("%4d %-20s %-7s %-4s\n",list.getBook().getNo(),list.getBook().getTitle(),sdf.format(list.getRentDate()),isBack);
			
		}
	}
	
}
