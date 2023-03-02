package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Foodcrd {
	
	void Create() {
		Scanner sc = new Scanner(System.in);
		File file1 = new File("src\\main\\Food.txt"); 
		try {
			System.out.println("ex)과 같이 입력하고 싶은 값을 넣어주세요: ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ex) 된장찌개 / 한식 , 아니요 , 밥");
            String input = reader.readLine();
            FileWriter writer = new FileWriter(file1, true);
            writer.write(input);
            writer.write(System.lineSeparator()); // 새로운 줄에 쓰기
            writer.close();
            System.out.println("파일에 입력 값을 추가했습니다.");
		} catch (Exception e) {
			System.out.println("파일에 데이터를 입력하지 못했습니다.");
			e.printStackTrace();
		}
	}
	
	void Delete() {
		Scanner sc = new Scanner(System.in);
		File file1 = new File("src\\main\\Food.txt"); 
		try {
			System.out.println("ex)과 같이 삭제하고 싶은 값을 넣어주세요: ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ex) 된장찌개/한식,아니요,밥");
            String input = reader.readLine();
            
            FileReader fileReader = new FileReader(file1);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            StringBuilder stringBuilder = new StringBuilder();

            // 파일에서 삭제할 값을 찾아서 제외
            while ((line = bufferedReader.readLine()) != null) {
                if (!line.trim().equals(input)) {
                    stringBuilder.append(line);
                    stringBuilder.append(System.lineSeparator());
                }
            }
            fileReader.close();
            bufferedReader.close();

            // 파일에 수정
            FileWriter writer = new FileWriter(file1);
            writer.write(stringBuilder.toString());
            writer.close();

            System.out.println("파일에서 " + input + "을(를) 삭제했습니다.");

		}catch(IOException e) {
			System.out.println("파일에 데이터를 삭제하지 못했습니다.");
			e.printStackTrace();
		}
	}
	
	void crdselect() {
		Scanner sc = new Scanner(System.in);
		System.out.println("음식 추가는 |추가| 삭제는 |삭제|를 입력해주세요.");
		String input = sc.next();
	
		switch(input) {
		case "추가": Create(); break;
		case "삭제": Delete(); break;
		}
	}
	
}
