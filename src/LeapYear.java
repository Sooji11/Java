import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		

		int year;
		
		System.out.print("�⵵�� �Է��ϼ��� : ");
		year = input.nextInt();
		
		if(year % 4 ==0) {
			System.out.print("�ش�⵵�� �����Դϴ�.");
		}else {
			System.out.print("�ش�⵵�� ������ �ƴմϴ�.");
		}
		
		
		

	}

}
