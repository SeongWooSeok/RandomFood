package main;

import java.util.Scanner;

public class Run {
	static void start(){
		SelectFood sf = new SelectFood();
		Restaurant rs = new Restaurant();
		Foodcrd fcrd = new Foodcrd();
		Restaurantcrd rcrd = new Restaurantcrd();
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println(" ------------------------ ");
			System.out.println(" 메뉴를 선택해주세요. ");
			System.out.println(" ------------------------ ");
			System.out.println("1. 음식 추천");
			System.out.println("2. 식당 추천");
			System.out.println("3. 음식 추가 및 삭제");
			System.out.println("4. 식당 추가 및 삭제");
			int input = sc.nextInt();
			
			switch(input) {
			case 1: sf.load(); break;
//			case 2:
			case 3:fcrd.crdselect(); break;
			case 4:rcrd.crdselect(); break;
			}
		}
	}
	public static void main(String[] args) {
		start();
	}
}
