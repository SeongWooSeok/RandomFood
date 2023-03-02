package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class SelectFood {
	HashMap<String, data> sfFood;

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
				Restaurant rs = new Restaurant();
					while(true) {//입력값들과 파일과의 조건이 맞는 음식들을 출력해줌
						System.out.print("한식,중식,일식,양식중 하나를 입력해주세요.  -> ");
						String category1 = sc.next();
						System.out.print("매운걸 원하시나요?(예/아니요)  ->  ");
						String strong = sc.next();
						System.out.print("종류를 선택해주세요.(밥,면,빵,기타) ->  ");
						String type = sc.next();
						Set<Entry<String, data>> entrySet = sfFood.entrySet();
						Iterator<Entry<String, data>> entry = entrySet.iterator();
						while(entry.hasNext()) {
							Entry<String, data> en = entry.next();
							data sf = en.getValue();
							String fname = en.getKey();
							if(sf.getCategory().contains(category1)&&sf.getSpicy().contains(strong)&&sf.getType().contains(type)) {
								rs.random();					
							}else {continue;} //예외 처리(철자가 틀릴경우)
						}
//						System.out.println("메뉴로 돌아가고 싶으시면 1번 다시 추천받기 원하시면 2번을 입력해주세요.");
					}	
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	List<String> getFoodName(){ //Food데이터의 이름만 빼오는 작업
		List<String> al = new ArrayList<>();
		File file1 = new File("src\\main\\Food.txt"); //음식 데이터
		try
		{
			Reader reader = new FileReader(file1);
			BufferedReader br = new BufferedReader(reader);
			String line = "";
			while((line = br.readLine())!= null) {
				String[] fn = line.split("/"); // 음식이름과 조건을 나눔
				String name = fn[0];
				al = Arrays.asList(name);
			}
			reader.close();
			br.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		return al;
	}
}
