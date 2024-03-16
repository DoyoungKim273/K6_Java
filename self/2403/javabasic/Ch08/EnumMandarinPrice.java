package com.ruby.java.jvbasicCh08;

enum Mandarin2 {
	금귤(600), 한라봉(500), 레드향(300), 천혜향(400), 황금향(800);


private int price;

Mandarin2 (int p) {
	price = p;
}

	int getPrice() {
		return price;
	}
}

public class EnumMandarinPrice {
	public static void main(String[] args) {
		Mandarin2 ma = Mandarin2.한라봉;
		if(ma == Mandarin2.한라봉)
			System.out.println("ma == 한라봉");
		System.out.println(ma + " 가격 : " + ma.getPrice());
		
		Mandarin2 list[] = Mandarin2.values();
		System.out.println("===== 귤의 종류 =====");
		
		for(Mandarin2 m : list)
			System.out.println(m + ":" + m.getPrice());
	}
}
