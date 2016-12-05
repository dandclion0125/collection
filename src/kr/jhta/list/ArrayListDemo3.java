package kr.jhta.list;

import java.util.ArrayList;

public class ArrayListDemo3 {
	
	public static void main(String[] args) {
		// 상품 정보를 담는 ArrayList를 생성하고
		// 상품 정보 여러 개를 담기
		// 저장된 상품 중에서 색상이 "검정"색인 상품만 화면에 출력하기
		ArrayList<Product> productList = new ArrayList<Product>();
		productList.add(new Product("청바지", "파랑",45000));
		productList.add(new Product("목도리", "검정",12000));
		productList.add(new Product("치마", "빨강",20000));
		productList.add(new Product("스카프", "하양",10000));
		productList.add(new Product("자켓", "검정",55000));
		
				
		for (Product pr: productList) {
			if("검정".equals(pr.getColor())) {
				System.out.printf("%s\t%s\t%d\n",pr.getName(),pr.getColor(),pr.getPrice());			
			}			
		}
	}
	public static class Product {
		
		private String name;
		private String color;
		private int price;
		
		public Product(){}

		public Product(String name, String color, int price) {
			super();
			this.name = name;
			this.color = color;
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}
		
		
	}
}
