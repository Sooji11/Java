import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		

		int year;
		
		System.out.print("년도를 입력하세요 : ");
		year = input.nextInt();
		
		if(year % 4 ==0) {
			System.out.print("해당년도는 윤년입니다.");
		}else {
			System.out.print("해당년도는 윤년이 아닙니다.");
		}
		
		
		

	}

}
