

import java.util.Scanner;

public class StandardWeight {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int age, sex, height, weight ; //나이, 성별, 키, 현재체중
				
		System.out.print("나이=");
		age = scan.nextInt();
		System.out.print("성별(1:남성,2:여성)=");
		sex = scan.nextInt();
		System.out.print("키=");
		height = scan.nextInt();
		System.out.print("현재체중=");
		weight = scan.nextInt();
		
		double sw = 0;//표준체중
		
		double maleSta = (age>=36)? (height-100)*0.95 : (height-100)*0.90;
		double femaleSta = (age>=36)? (height-100)*0.90 : (height-100)*0.85;
		
		switch (sex) {
		case 1:
			sw = maleSta;
			break;
		default :
			sw = femaleSta;
		}
		
		System.out.println("표준체중="+(int)sw);
		
		double index = (weight/sw)*100; //표준체중지수
		String body = ""; //평가기준
		
		if (index<86) {
			body = "마른형";
		}else if (index<96) {
			body = "조금 마른형";
		}else if (index<116) {
			body = "표준형";
		}else if (index<126) {
			body = "조금 비만형";
		}else {
			body = "비만형";
		}

		System.out.printf("당신의 표준체중지수는 %.14f으로 %s입니다.", index, body);
			

	}

}

