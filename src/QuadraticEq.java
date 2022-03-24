import java.util.Scanner;

public class QuadraticEq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double b,c; 
		double Roots;
		
		System.out.print("이차항의 계수를 입력해주세요:");
		b = input.nextInt();
		
		System.out.print("상수를 입력해주세요: ");
		c = input.nextInt();
		
		Roots = Math.sqrt((b*b)-(4*c));
		System.out.println(Roots);
	
		

	}

}
