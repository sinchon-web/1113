package day1113;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		//String path="."+File.separator+"input.txt";
		//File file=new File(path);
		//System.out.println(path);
		
		File file=new File("input.txt");
		
		try {
			Scanner scanner=new Scanner(file);
			
			String name=scanner.next();
			int kor=scanner.nextInt();
			int eng=scanner.nextInt();
			int mat=scanner.nextInt();
			
			
			Exam ex=new Exam(name, kor, eng, mat);
			
			System.out.println(ex);
			
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		

	}

}
