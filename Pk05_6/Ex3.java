package Pk05_6;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc;
		int d,i;
		String msg;

		sc = new Scanner(System.in);
		System.out.println("��ȣ�� �ݺ��� ������ �Է��ϼ���:");
		msg=sc.next();
		d=sc.nextInt();

		sc.close();
		
		
		
		System.out.printf("�Է��� ��ȣ�� [%s]�̰�,�ݺ��� ������[%d]�Դϴ�\n",msg,d);
		
		for(i=0; i<d; i++)//(int i=1; i<=d; i++)�� �� ���� �� 
			System.out.printf("%s",msg);
		System.out.println("("+d+")");

	}

}
