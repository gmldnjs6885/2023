package pk19_06;
import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		double r,pie,a,n,v;
		System.out.printf("������� �������� ������");
		r=sc.nextDouble();
		System.out.printf("������� ���̸� ������");
		a=sc.nextDouble();
		
		pie=2*(3.14*r*r)+2*(3.14*r*a);
		v=(3.14*r*r)*a;
		n=pie*a;


		System.out.printf("������ǰѳ���%.2f, ���� %.2f",pie,v);

	}

}
