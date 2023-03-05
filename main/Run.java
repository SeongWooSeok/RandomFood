package main;

import java.util.Scanner;

public class Run {
	static void start(){
		SelectFood sf = new SelectFood();
		Restaurant rs = new Restaurant();
		Foodcrd fcrd = new Foodcrd();
		Restaurantcrd rcrd = new Restaurantcrd();
		Record rc = new Record();
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println(" ------------------------ ");
			System.out.println(" 메뉴를 선택해주세요. ");
			System.out.println(" ------------------------ ");
			System.out.println("1. 음식 추천");
			System.out.println("2. 식당 추천");
			System.out.println("3. 음식 추가 및 삭제");
			System.out.println("4. 식당 추가 및 삭제");
			System.out.println("5. 먹었던 음식 및 식당 입력 및 삭제");
			System.out.println("6. 먹었던 음식 및 식당 횟수");
			System.out.println("7. 종료");
			int input = sc.nextInt();
			
			switch(input) {
			case 1: sf.load(); break;
			case 2: rs.random(); break;
			case 3: fcrd.crdselect(); break;
			case 4: rcrd.crdselect(); break;
			case 5: rc.crdselect(); break;
			case 6: rc.cal(); break;
			case 7: return;
			}
		}
	}
//	public static void main(String[] args) {
//		start();
//	}
}
