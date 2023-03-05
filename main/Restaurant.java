package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class Restaurant {
	HashMap<String,String[]> rsFood;

	Restaurant(){
		rsFood = new HashMap<String , String[]>();
	}

	void random() {
		Scanner sc = new Scanner(System.in);
		File file1 = new File("src\\main\\Restaurant.txt"); //음식점 데이터
		try
		{
			Reader reader = new FileReader(file1);
			BufferedReader br = new BufferedReader(reader);
			String line = "";
			while((line = br.readLine())!= null) {
				String[] fn = line.split("/"); //음식이름과 음식점 이름을 나눔
				String name = fn[0];
				String[] fc = fn[1].split(",");
				rsFood.put(name, fc);
			}
			reader.close();
			br.close();
			Random rd = new Random();
			System.out.println("추천받은 음식중에서 원하는 음식의 이름을 입력해주세요 : ");
			String input = sc.next();
			for(String key : rsFood.keySet()) {
				if(key.contains(input)) { //음식점들의 주소중 하나를 랜덤으로 골라옴
					String[] keyValue = rsFood.get(key);
					int index = rd.nextInt(keyValue.length);
					String randomValue = keyValue[index];
					System.out.println(input + "의 추천식당은"+ randomValue);
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
