package day1113;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test01 {

	public static void main(String[] args) {
		//String path="."+File.separator+"input.txt";
		//File file=new File(path);
		//System.out.println(path);
		
		File file=new File("input.txt");
		FileInputStream fis = null;
		try {//예외가 발생할 여지가 있는코드
			fis=new FileInputStream(file);
			System.out.println("파일연결완료!");
			int data;
			while( (data=fis.read()) != -1) {
				System.out.print(data);
			}
			
			
		} catch (IOException  e) {
			//e.printStackTrace();
			System.out.println("파일이 존재하지 않습니다.");
		}finally {//선택적 사용가능
			//try나 catch 실행후 마지막에 무조건 실행한다.
			if(fis!=null)try {fis.close();} catch (IOException e) {}
			System.out.println("스트림 종료!");
		}
		
		

	}

}
