package com.gdj.d60;

public class Control4 {

	public static void main(String[] args) {
		//다중 선택
		//switch case
		int num = 3;
		System.out.println("1. 햄버거");
		System.out.println("2. 샌드위치");
		System.out.println("3. 샐러드");
		String select = "3";
		switch(num){ //case 3이 실행 num이 3이므로
			case 1:
				System.out.println("1번 선택");
				break;
			case 2:
				System.out.println("2번 선택");
				break;
			case 3:
				System.out.println("3번 선택");
				break;
			default:
				System.out.println("그 외 나머지");
				break;
		}
		switch(select){ //case 3이 실행 select이 3이므로
		case "1":
			System.out.println("1번 선택");
			break;
		case "2":
			System.out.println("2번 선택");
			break;
		case "3":
			System.out.println("3번 선택");
			break;
		default:
			System.out.println("그 외 나머지");
			break;
	}

	}

}
