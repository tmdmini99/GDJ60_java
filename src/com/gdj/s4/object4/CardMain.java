package com.gdj.s4.object4;



public class CardMain {

	public static void main(String[] args) {
		//클래스명.변수명
		System.out.println(Card.size);
		//객체를 만들 필요 x
		Card card =new Card();
		card.setShape("Heart");
		card.setColor("Red");
		card.setNumber(1);
		
		Card.size=11;
		card.info();
		
		Card card2=new Card();
		card2.setShape("Spade");
		card2.setColor("Black");
		card2.setNumber(12);
		card2.info();

	}

}
