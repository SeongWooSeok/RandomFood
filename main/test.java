package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class test {
	public static void main(String[] args) throws IOException {
		String[] fn = null;
		String[] fc =null;
		HashMap<String, data> hm = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		File file1 = new File("src\\main\\Food.txt"); //음식 데이터
			Reader reader = new FileReader(file1);
			BufferedReader br = new BufferedReader(reader);
			String line = "";
			while((line = br.readLine())!= null) {
				fn = line.split("/"); // 음식이름과 조건을 나눔
				String name = fn[0];
//				System.out.println(fn.length);
				fc = fn[1].split(",");// 세가지의 조건을 나눔
//				System.out.printf("%s %s %s %s \n", fn[0],fc[0],fc[1],fc[2]);
				hm.put(name, new data(fc[0],fc[1],fc[2]));
				
				Iterator<Map.Entry<String, data>> k = hm.entrySet().iterator();
				while(k.hasNext()) {
					Map.Entry<String, data> entry = k.next();
					System.out.println(entry.getKey() + entry.getValue());
				}

			}
			
		}
}
