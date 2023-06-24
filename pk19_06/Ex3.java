package pk19_06;
import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		double r,pie,a,n,v;
		System.out.printf("원기둥의 반지름을 쓰세요");
		r=sc.nextDouble();
		System.out.printf("원기둥의 높이를 쓰세요");
		a=sc.nextDouble();
		
		pie=2*(3.14*r*r)+2*(3.14*r*a);
		v=(3.14*r*r)*a;
		n=pie*a;


		System.out.printf("원기둥의겉넓이%.2f, 부피 %.2f",pie,v);

	}

}
