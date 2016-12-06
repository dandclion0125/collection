package kr.jhta.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		
		ArrayList<Contact> contacts = new ArrayList<>();
		contacts.add(new Contact("홍길동", "010-1234-3425"));
		contacts.add(new Contact("김유신", "010-9375-2185"));
		contacts.add(new Contact("강감찬", "010-5456-9814"));
		
		Iterator<Contact> it = contacts.iterator();
		while(it.hasNext()) {
			Contact contact = it.next();
			System.out.println(contact.getName()+", "+ contact.getPhone());
			
		}
	}
	public static class Contact {
		
		private String name;
		private String phone;
		
		public Contact(){}

		public Contact(String name, String phone) {
			super();
			this.name = name;
			this.phone = phone;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}
		
		
	}
}
