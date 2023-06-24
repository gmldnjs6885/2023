package Pk03_6;

import java.util.Scanner;

public class IfEx3_01 {

	public static void main(String[] args) {

		Scanner con =new Scanner(System.in);

		int d1,d2,d3;
		int sum,avg;
		char c;
		
		System.out.print("3개의 정수형 점수를 입력 하세요 :");

		d1=con.nextInt();
		d2=con.nextInt();
		d3=con.nextInt();
		
		con.close();

		sum=d1+d2+d3;
		avg=sum/3;

		if(avg<=100&&avg>=90)
			c='A';

		else if(avg<=89&&avg>=80)
			c='B';

		else if(avg<=79&&avg>=70)
			c='C';

		else if(avg<=69&&avg>=60)
			c='D';

		else
			c='F';

		System.out.println("당신의 점수는"+d1+","+d2+","+d3);
		System.out.printf("printf: 전체의 합은 %10d 평균은%d\n",sum,avg);
		System.out.format("format : 전체의 합은 %-10d 평균은%d\n",sum,avg);
		System.out.println("학점은 "+c+"입니다.");
		
	}

}
