package pk03_6;

import java.util.Scanner;

public class IfEx4 {

	public static void main(String[] args) //무조건 스트링으로 받아 들임 ex) 100 200 300이면 랭스 3개 인덱스 순서대로 0 1 2 번 
	{
		Scanner con =new Scanner(System.in);

		int d1,d2,d3;
		int sum;
		double avg;
		char c;

		System.out.print("3개의 정수형 점수를 입력 하세요 :");

		d1=con.nextInt();
		d2=con.nextInt();
		d3=con.nextInt();

		con.close();

		sum=d1+d2+d3;
		avg=sum/3.0;//실수+_정수 = 실수

		if(avg<=100&&avg>=90)
			c='A';

		else if(avg<90&&avg>=80)
			c='B';

		else if(avg<80&&avg>=70)
			c='C';

		else if(avg<70&&avg>=60)
			c='D';

		else
			c='F';

		System.out.println("당신의 점수는"+d1+","+d2+","+d3);
		System.out.printf("printf: 전체의 합은 %10d 평균은%.1f\n",sum,avg);
		System.out.format("format : 전체의 합은 %-10d 평균은%.2f\n",sum,avg);
		System.out.println("학점은 "+c+"입니다.");


	}

}
