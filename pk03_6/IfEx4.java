package pk03_6;

import java.util.Scanner;

public class IfEx4 {

	public static void main(String[] args) //������ ��Ʈ������ �޾� ���� ex) 100 200 300�̸� ���� 3�� �ε��� ������� 0 1 2 �� 
	{
		Scanner con =new Scanner(System.in);

		int d1,d2,d3;
		int sum;
		double avg;
		char c;

		System.out.print("3���� ������ ������ �Է� �ϼ��� :");

		d1=con.nextInt();
		d2=con.nextInt();
		d3=con.nextInt();

		con.close();

		sum=d1+d2+d3;
		avg=sum/3.0;//�Ǽ�+_���� = �Ǽ�

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

		System.out.println("����� ������"+d1+","+d2+","+d3);
		System.out.printf("printf: ��ü�� ���� %10d �����%.1f\n",sum,avg);
		System.out.format("format : ��ü�� ���� %-10d �����%.2f\n",sum,avg);
		System.out.println("������ "+c+"�Դϴ�.");


	}

}
