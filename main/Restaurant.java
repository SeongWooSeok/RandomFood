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
			SelectFood sf = new SelectFood();
			Random rd = new Random();
			int i = 0;
			String[] arr = new String[rsFood.size()];
				Set<Entry<String, String[]>> entrySet = rsFood.entrySet();
				Iterator<Entry<String, String[]>> entry = entrySet.iterator();
				while(entry.hasNext()) {
					Entry<String, String[]> en = entry.next();
					String[] rt = en.getValue();
					List<String> li = new ArrayList<>(Arrays.asList(rt));
					String rname= en.getKey();
					arr[i] = en.getKey();
					i++;
					
					List<String> li2 = new ArrayList<>(Arrays.asList(arr));
					if(li2.contains(sf.getFoodName())) {
					int randomIndex = rd.nextInt(li.size());
					System.out.println("추천식당은 "+li.get(randomIndex) + "입니다."); // 식당 중에서 랜덤으로 한곳을 출력함
					}
				}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
