package Pk03_6;

import java.util.Scanner;

public class IfEx3_01 {

	public static void main(String[] args) {

		Scanner con =new Scanner(System.in);

		int d1,d2,d3;
		int sum,avg;
		char c;
		
		System.out.print("3���� ������ ������ �Է� �ϼ��� :");

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

		System.out.println("����� ������"+d1+","+d2+","+d3);
		System.out.printf("printf: ��ü�� ���� %10d �����%d\n",sum,avg);
		System.out.format("format : ��ü�� ���� %-10d �����%d\n",sum,avg);
		System.out.println("������ "+c+"�Դϴ�.");
		
	}

}
