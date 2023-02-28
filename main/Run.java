package main;

import java.util.Scanner;

public class Run {
	static void start(){
		SelectFood sf = new SelectFood();
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println(" ------------------------ ");
			System.out.println(" 메뉴를 선택해주세요. ");
			System.out.println(" ------------------------ ");
			System.out.println("1. 음식 추천");
			System.out.println("2. 식당 추천");
			int input = sc.nextInt();
			
			switch(input) {
			case 1: sf.load(); break;
			}
		}
	}
	public static void main(String[] args) {
		start();
	}
}
