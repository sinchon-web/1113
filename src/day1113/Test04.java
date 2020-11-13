package day1113;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test04 {

	public static void main(String[] args) {
		
		Exam ex=new Exam();
		//입력기능 실행
		ex.inputData();
		File file=new File("data.txt");
		//파일에 저장
		FileWriter fw=null;
		try {
			fw=new FileWriter(file, true);
			
			fw.write(ex.getName());
			fw.write(" "+ex.getKor());
			fw.write(" "+ex.getEng());
			fw.write(" "+ex.getMat());
			fw.write(" "+ex.getTot());
			fw.write(" "+ex.getAvg()+"\n");
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(fw!=null)
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

	}

}
