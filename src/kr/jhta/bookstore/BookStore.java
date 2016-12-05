package kr.jhta.bookstore;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class BookStore {
	
	ArrayList<Customer> customerList = new ArrayList<>();	
	Scanner sc = new Scanner(System.in);
	
	private Customer loginedUser = null;
	// 가입 기능
	
	private boolean isExistId(String id) {
		boolean isExist = false;
		for(Customer customer:customerList){
			if(customer.getId().equals(id)){
				isExist = true;
				break;
			}
		}
		return isExist;
	}
	public void register() {
		Customer c = new Customer();

		System.out.print("아이디를 입력하세요: ");
		String id = sc.nextLine();
		if (isExistId(id)){
			System.out.println("이미 사용중인 아이디 입니다.");
			return;
		} else {
			c.setId(id);
		}
		System.out.print("이름을 입력하세요: ");
		c.setName(sc.next());
		
		System.out.print("패스워드를 입력하세요: ");
		c.setPwd(sc.next());
		System.out.print("전화번호를 입력하세요: ");
		c.setTel(sc.next());
		
		System.out.print("이메일을 입력하세요: ");
		c.setEmail(sc.next());
		Date now = new Date();
		c.setRegdate(now);
		c.setPoint(0);
		
		customerList.add(c);
		
	}
	// 로그인 기능
	public void login() {
		
		Customer c = null; // 아이디가 동일한 고객의 정보를 넣기 위해 
		System.out.print("아이디를 입력하세요.: ");
		String logId = sc.next();
		
		/*
		for (Customer customer: customerList) { // 입력 받은 아이디와 동일한 고객정보 찾기
			if(logId.equals(customer.getId())) {
				c = customer; // 찾은 고객 정보 c에 넣기
			}		
		}
		
		if(c == null) {  // 입력 받은 값과 동일한 고객정보가 없는 경우
			System.out.println("아이디가 존재하지 않습니다.");
			return;
		}
		if(c != null) { // 패스워드의 정보확인
			System.out.print("패스워드를 입력하세요.: ");
			String logPw = sc.next();
			if(logPw.equals(c.getPwd())) {
				System.out.println("로그인되었습니다.");
				loginedUser = c;
			}
			
			
		}
		*/ 
		
		
		
		
		
	}
}
