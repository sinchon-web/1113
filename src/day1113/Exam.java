package day1113;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exam {
	
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double avg;
	private File file=new File("data.txt");
	
	public void inputData() {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("이름 : ");
		this.name=sc.nextLine();
		System.out.print("국어 : ");
		this.kor=sc.nextInt();
		System.out.print("영어 : ");
		this.eng=sc.nextInt();
		System.out.print("수학 : ");
		this.mat=sc.nextInt();
		//sc.close();
		//tot계산처리
		this.tot=kor+eng+mat;
		//평균처리
		avg= tot/3.0;
		///////////////////////////////////////
		///////////////////////////////////////
		
		//파일에 저장
		FileWriter fw=null;
		try {
			fw=new FileWriter(file, true);
			
			fw.write(name);
			fw.write(" "+kor);
			fw.write(" "+eng);
			fw.write(" "+mat);
			fw.write(" "+tot);
			fw.write(" "+avg+"\n");
			
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
		///////////////////////////////////////
		
	}//inputData()
	
	public void display() {
		
		FileReader fr=null;
		
		try {
			fr=new FileReader(file);
			int data;
			while((data=fr.read())!=-1) {
				System.out.print((char)data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fr!=null)fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		/*
		Scanner in=null;
		try {
			in=new Scanner(file);
			while(in.hasNext()) {
				name=in.next();
				kor=in.nextInt();
				eng=in.nextInt();
				mat=in.nextInt();
				tot=in.nextInt();
				avg=in.nextDouble();
				
				System.out.println("이름 : "+ name);
				System.out.println("국어 : "+ kor);
				System.out.println("영어 : "+ eng);
				System.out.println("수학 : "+ mat);
				System.out.println("총점 : "+ tot);
				System.out.printf("평균 : %.2f\n\n", avg);
				
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}finally {
			if(in!=null)in.close();
		}
		//*/
		
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "Exam [name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", tot=" + tot + ", avg=" + avg
				+ "]";
	}

	public Exam(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		tot=kor+eng+mat;
		avg=tot/3.0;
	}
	
	public Exam() {
		// TODO Auto-generated constructor stub
	}
	
	

}
