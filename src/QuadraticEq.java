import java.util.Scanner;

public class QuadraticEq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double b,c; 
		double Roots;
		
		System.out.print("�������� ����� �Է����ּ���:");
		b = input.nextInt();
		
		System.out.print("����� �Է����ּ���: ");
		c = input.nextInt();
		
		Roots = Math.sqrt((b*b)-(4*c));
		System.out.println(Roots);
	
		

	}

}
