import java.util.Calendar;
import java.util.Scanner;

public class ConsoleCalendar {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Calendar now = Calendar.getInstance();
		
	//년도와 월 입력받기
		System.out.println(5/2);
		System.out.print("년도=");
		int year = scan.nextInt();
		System.out.print("월=");
		int month = scan.nextInt();
		
	//입력받은 년도와 월, 요일 출력
		System.out.println("\t\t"+year+"년 "+month+"월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
	//입력받은 년월로 날짜 변경
		now.set(Calendar.YEAR,year);
		now.set(Calendar.MONTH,(month-1));
		now.set(Calendar.DATE,1);
	
	//윤년 판별
		int leap = 0;
		if ((year%4==0 && year%100!=0) || (year%400==0)) {
			leap = 1;
		}
				
	//월의 첫번째 날의 요일 / 월의 마지막 날
		int day1 = now.get(Calendar.DAY_OF_WEEK);
		int lastDay = 0;
		
	//월의 마지막 날 계산
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
		lastDay = 31; break;
		case 4: case 6: case 9: case 11:
		lastDay = 30; break;
		case 2:
		lastDay = 28; break;
		}
		
	//월의 첫번째 주 출력
		for (int b=1; b<day1; b++) {
			System.out.print("\t");
		}
		for (int j=1; j<=8-day1; j++) {
			System.out.print(j+"\t");
		}
		System.out.println();
		
	//월의 두번째 ~ 네번째 주 출력
		for (int i=9-day1;i<=15-day1;i++) {
			System.out.print(i+"\t");
		}
		System.out.println();
		
		for (int i=16-day1;i<=22-day1;i++) {
			System.out.print(i+"\t");
		}
		System.out.println();
		
		for (int i=23-day1;i<=29-day1;i++) {
			System.out.print(i+"\t");
		}
		System.out.println();
		
	//월의 다섯번째 주 출력, lastDay 미만 출력, 윤년 반영
		for (int i=30-day1;i<=36-day1;i++) {
			if (i<=lastDay) {
				System.out.print(i+"\t");
			}
		}
		if (leap==1 && month==2) {
			System.out.print("29");
		}
		System.out.println();
		
	//월의 여섯번째 주 출력, lastDay 미만 출력
		if (lastDay==30 && day1==7) {
			System.out.print("30");
		}else if (lastDay==31 && day1==6) {
			System.out.print("31");
		}else if (lastDay==31 && day1==7) {
			System.out.print("30\t31");
		}
		
	} //main 종료
}
