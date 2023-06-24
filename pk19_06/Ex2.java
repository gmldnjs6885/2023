package pk19_06;
import java.util.Scanner;
public class Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pp,MM;
		System.out.printf("변환할 제곱미터를 입력하세요");
		MM=sc.nextDouble();
		pp=MM*0.3025;
		
		System.out.printf("평수는 %.2f",pp);
		
		
	}

}
