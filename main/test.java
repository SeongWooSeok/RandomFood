package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
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

public class test {
	public static void main(String[] args) throws IOException {
//		String[] fn = null;
//		String[] fc =null;
//		HashMap<String, data> hm = new HashMap<>();
//		Scanner sc = new Scanner(System.in);
//		File file1 = new File("src\\main\\Food.txt"); //음식 데이터
//			Reader reader = new FileReader(file1);
//			BufferedReader br = new BufferedReader(reader);
//			String line = "";
//			while((line = br.readLine())!= null) {
//				fn = line.split("/"); // 음식이름과 조건을 나눔
//				String name = fn[0];
////				System.out.println(fn.length);
//				fc = fn[1].split(",");// 세가지의 조건을 나눔
////				System.out.printf("%s %s %s %s \n", fn[0],fc[0],fc[1],fc[2]);
//				hm.put(name, new data(fc[0],fc[1],fc[2]));
//				
//				Iterator<Map.Entry<String, data>> k = hm.entrySet().iterator();
//				while(k.hasNext()) {
//					Map.Entry<String, data> entry = k.next();
//					System.out.println(entry.getKey() + entry.getValue());
//				}
//
//			}
//		HashMap<String,String[]> rsFood  = new HashMap<String , String[]>();
//		Scanner sc = new Scanner(System.in);
//		File file1 = new File("src\\main\\Restaurant.txt"); //음식점 데이터
//		try
//		{
//			Reader reader = new FileReader(file1);
//			BufferedReader br = new BufferedReader(reader);
//			String line = "";
//			while((line = br.readLine())!= null) {
//				String[] fn = line.split("/"); //음식이름과 음식점 이름을 나눔
//				String name = fn[0];
//				String[] fc = fn[1].split(",");
//				rsFood.put(name, fc);
//			}
//			reader.close();
//			br.close();
//			SelectFood sf = new SelectFood();
//			Random rd = new Random();
//			int i = 0;
//			String[] arr = new String[rsFood.size()];
//				Set<Entry<String, String[]>> entrySet = rsFood.entrySet();
//				Iterator<Entry<String, String[]>> entry = entrySet.iterator();
//				while(entry.hasNext()) {
//					Entry<String, String[]> en = entry.next();
//					String[] rt = en.getValue();
//					List<String> li = new ArrayList<>(Arrays.asList(rt));
//					String rname= en.getKey();
//					
//					List<String> li2 = new ArrayList<>(Arrays.asList(arr));
//					if(li2.contains(sf.getFoodName())) {
//					int randomIndex = rd.nextInt(li.size());
//					System.out.println("추천식당은 "+li.get(randomIndex) + "입니다."); // 식당 중에서 랜덤으로 한곳을 출력함
//					}
//				}
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
//	}
	
//		 StringBuilder stringBuilder = new StringBuilder();
//	        stringBuilder.append("문자열 ").append("연결");
////	        String str = stringBuilder;   // String에 StringBuilder를 그대로 넣을 순 없다. toString()을 붙여야 한다
//	        String str = stringBuilder.toString();
//	        // 두 println()은 같은 값을 출력한다
//	        System.out.println(stringBuilder);
//	        System.out.println(str);
//
		
		Scanner sc = new Scanner(System.in);
		File file1 = new File("src\\main\\Restaurant.txt"); 
		try {
			System.out.println("ex)과 같이 삭제하고 싶은 값을 넣어주세요: ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ex) 된장찌개/한식,아니요,밥");
            String input = reader.readLine();
            
            FileReader fileReader = new FileReader(file1);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            StringBuilder stringBuilder = new StringBuilder();//이거 안쓰면 String 값추가못함
                       
            // 파일에서 삭제할 값을 찾아서 제외
            while ((line = bufferedReader.readLine()) != null) {
            	String[] rn = line.split("/");
            	String name = rn[0];
            	
                if (name.equals(input)) {
                    stringBuilder.append(line);
                    stringBuilder.append(System.lineSeparator());
                }
            }
            fileReader.close();
            bufferedReader.close();

            // 파일에 수정
            FileWriter writer = new FileWriter(file1,true);
            writer.write(stringBuilder.toString());
            writer.close();

            System.out.println("파일에서 " + input + "을(를) 삭제했습니다.");

		}catch(IOException e) {
			System.out.println("파일에 데이터를 삭제하지 못했습니다.");
			e.printStackTrace();
		}
		}
}

