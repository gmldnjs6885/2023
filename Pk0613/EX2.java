package Pk0613;
import java.util.Scanner;
public class EX2 {
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		int d1,d2;
		double sum,avg;
		String name;
		char c;
		
		System.out.printf("이름을 입력하세요");
		name=sc.next();
		System.out.println("두개의 점수를 입력 하세요");
		d1=sc.nextInt();
		d2=sc.nextInt();
		sc.close();

		sum=d1+d2;
		avg=sum/2;
		
		if(avg>=90)c='A';
		else if(avg>=80) c='B';
		else if(avg>=70) c='C';
		else if(avg>=60) c='D';
		else c='F';
		
		System.out.printf("이름은 %s",name);
		System.out.println();
		System.out.printf("총합은 %.2f 평균은 %.2f 학점은 %c",sum,avg,c);
		
		
	}

}
