package kr.jhta.bookstore;

import java.util.Scanner;

public class BookStoreApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BookStore store = new BookStore();
		
		
		// 무한 루프
		while(true) {
			
			System.out.println("\n----------------------------------------------------------------------------------------------");
			System.out.println("1.로그인  2.가입  3.도서조회  4.대여  5.반납  6.대여내역조회  7.포인트조회  8.로그아웃  0.종료");
			System.out.println("----------------------------------------------------------------------------------------------");
			
			System.out.println("메뉴 선택>");
			int menu = Integer.parseInt(sc.nextLine());
			
			if(menu == 1) {
				store.login();
			} else if(menu == 2) {
				store.register();
			} else if(menu == 3) {
				store.displayBooks();
			} else if(menu == 4) {
				store.rentalBook();
			} else if(menu == 5) {
				store.returnBook();
			} else if(menu == 6) {				
				store.displayRental();
			} else if(menu == 8) { 
				store.logout();
			} else if(menu == 7) {
				store.displayPoint();
			} else if(menu == 0) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}
