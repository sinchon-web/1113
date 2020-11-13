package day1113;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		//String path="."+File.separator+"input.txt";
		//File file=new File(path);
		//System.out.println(path);
		
		File file=new File("input.txt");
		Scanner scanner=null;
		try {
			scanner=new Scanner(file);
			
			while(scanner.hasNext()) {
				String name=scanner.next();
				int kor=scanner.nextInt();
				int eng=scanner.nextInt();
				int mat=scanner.nextInt();
				
				
				Exam ex=new Exam();
				//ex.name=name;
				ex.setName(name);
				ex.setKor(kor);
				ex.setEng(eng);
				ex.setMat(mat);
				int tot=kor+eng+mat;
				ex.setTot(tot);
				double avg=tot/3.0;
				ex.setAvg(avg);
				
				//출력
				ex.display();
				//System.out.println(ex);
				//System.out.println("이름 : "+ ex.getName());
				//System.out.println("국어 : "+ ex.getKor());
				//System.out.println("영어 : "+ ex.getEng());
				//System.out.println("수학 : "+ ex.getMat());
				//System.out.println("총점 : "+ ex.getTot());
				//System.out.printf("평균 : %.2f\n\n", ex.getAvg());
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(scanner!=null)scanner.close();
		}
		
		

	}

}
