package pk07_06;

import java.util.Scanner;

public class AppEx6 {
	public static void main(String[] args) {

		String[] data;
		String s;
		
		int cnt=0;

		Scanner sc= new Scanner(System.in);

		System.out.printf("�� ���� �̸��� �Է��ϼ���");

		s=sc.nextLine();
		sc.close();

		data = s.split(" ");//�����̽� �ٸ� �������� ���ڿ��� ���� �� 


		for(String name : data)

			System.out.printf("[%d] : %S \n",cnt++,name);

	}

}
