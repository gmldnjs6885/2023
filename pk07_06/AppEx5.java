package pk07_06;

import java.util.Scanner;

public class AppEx5 {
	public static void main(String[] args) {

		int[] data;

		int cnt=0;

		Scanner sc= new Scanner(System.in);

		System.out.printf("세 개의 점수를 입력하세요");

		data =new int[3];

		for(int i=0; i<data.length; i++)

			data[i]= sc.nextInt();

		sc.close();



		for(int i=0; i<data.length; i++)
		{

			System.out.printf("[%d]:",i);

			for(int j=0; j<data[i]/10; j++)
				System.out.printf("■");

			System.out.printf("(%d)\n",data[i]/10);
		}


	}

}
