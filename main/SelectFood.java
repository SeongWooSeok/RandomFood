package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class SelectFood {
	private HashMap<String, data> sfFood;

	SelectFood(){
		sfFood = new HashMap<String , data>();
	}

	void load() { // 파일 내용을 hashmap으로 생성
		Scanner sc = new Scanner(System.in);
		File file1 = new File("src\\main\\Food.txt"); //음식 데이터
		try
				{
			Reader reader = new FileReader(file1);
			BufferedReader br = new BufferedReader(reader);
			String line = "";
			while((line = br.readLine())!= null) {
				String[] fn = line.split("/"); // 음식이름과 조건을 나눔
				String name = fn[0];
				String[] fc = fn[1].split(",");// 세가지의 조건을 나눔
				sfFood.put(name, new data(fc[0] , fc[1], fc[2]));
				}
				reader.close();
				br.close();
					while(true) {
						System.out.print("한식,중식,일식,양식중 하나를 입력해주세요.  -> ");
						String category1 = sc.next();
						System.out.print("매운걸 원하시나요?(예/아니요)  ->  ");
						String strong = sc.next();
						System.out.print("종류를 선택해주세요.(밥,면,빵,기타) ->  ");
						String type = sc.next();
//						if(sfFood.containsValue(category1)) {
//							Iterator<Map.Entry<String, data>> k = sfFood.entrySet().iterator();
//							while(k.hasNext()) {
//								Map.Entry<String, data> entry = k.next();
//								System.out.println(entry.getKey() );
//							}
//						}
					}	
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

