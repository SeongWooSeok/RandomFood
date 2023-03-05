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
		
//		Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the string to delete: ");
//        String input = scanner.nextLine();
//
//        Path path = Paths.get("file.txt"); // Replace with your file path
//        try {
//            BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8);
//            String currentLine;
//            StringBuilder sb = new StringBuilder();
//
//            while ((currentLine = reader.readLine()) != null) {
//                if (!currentLine.contains(input)) {
//                    sb.append(currentLine);
//                    sb.append("\n");
//                }
//            }
//            reader.close();
//
//            FileWriter writer = new FileWriter("file.txt");
//            writer.write(sb.toString());
//            writer.close();
//
//            System.out.println("Line containing '" + input + "' deleted successfully!");
//        } catch (IOException e) {
//            e.printStackTrace();
//       }
//		Restaurant rs = new Restaurant();
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
//				rs.rsFood.put(name, fc);
//			}
//			for(Entry<String, String[]> entrySet : rs.rsFood.entrySet()) {
//				System.out.println(entrySet.getKey() + " : " + Arrays.toString(entrySet.getValue()));
//			}
//		}catch(IOException e) {
//				e.printStackTrace();
//			}
		
//		File file1 = new File("src\\main\\record.txt");
//		try
//		{
//			Reader reader = new FileReader(file1);
//			BufferedReader br = new BufferedReader(reader);
//			String line;
//			while((line = br.readLine())!= null) {
//				String[] fn = line.split("/"); // 음식이름과 음식점 이름을 나눔
//				String foodname = fn[0];
//				String resname = fn[1];
//				ArrayList<String> al1 = new ArrayList<String>(Arrays.asList(foodname));
//				ArrayList<String> al2 = new ArrayList<String>(Arrays.asList(resname));
//				HashMap<String, Integer> Map1 = new HashMap<String, Integer>();
//				HashMap<String, Integer> Map2 = new HashMap<String, Integer>();
//				
//				for (String element : al1) {
//					if (Map1.containsKey(element)) {
//						Map1.put(element, Map1.get(element) + 1);
//					} else {
//						Map1.put(element, 1);
//					}
//				}
//				 for (String element : Map1.keySet()) {
//			            int frequency = Map1.get(element);
//			            if(frequency>1) {
//			            System.out.println("음식:" + element + " 횟수: " + frequency + "번");
//			            }
//			        }
//				 
//				 for (String element : al2) {
//						if (Map2.containsKey(element)) {
//							Map2.put(element, Map2.get(element) + 1);
//						} else {
//							Map2.put(element, 1);
//						}
//					}
//					 for (String element : Map2.keySet()) {
//				            int frequency = Map2.get(element);
//				            if(frequency>1) {
//				            System.out.println("식당:" + element + " 횟수: " + frequency + "번");
//				            }
//				        }
//				
//			}
//       
//			reader.close();
//			br.close();
//			
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
	}
}

