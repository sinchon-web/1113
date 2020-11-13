package day1113;

import java.util.Scanner;

public class Test05 {
	
	public static void menu() {
		System.out.println("메뉴를 선택하세요!");
		System.out.println("1.입력 2.출력 3.종료");
		System.out.print("선택 > ");
	}
	
	
	public static void main(String[] args) {
		
		Exam ex=new Exam();
		while(true) {
			Scanner in=new Scanner(System.in);
			menu();
			int n=in.nextInt();
			
			switch (n) {
			case 1:
				System.out.println("입력처리!");
				ex.inputData();
				break;
			case 2:
				System.out.println("출력처리!");
				ex.display();
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.!");
				System.exit(0);//cede가 0인경우 정상종료 
				break;
	
			default:
				break;
			}
			
			
		}

	}

}
