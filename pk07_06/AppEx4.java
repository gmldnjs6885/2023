package pk07_06;

import java.util.Scanner;

public class AppEx4 {
	public static void main(String[] args) {

		int[] data;

		int cnt=0;

		Scanner sc= new Scanner(System.in);

		System.out.printf("�� ���� ������ �Է��ϼ���");

		data =new int[3];

		for(int i=0; i<data.length; i++)

			data[i]= sc.nextInt();

		sc.close();



		for(int name : data)

			System.out.printf("[%d]: %d \n",cnt++,name);

	}

}
