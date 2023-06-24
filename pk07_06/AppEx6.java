package pk07_06;

import java.util.Scanner;

public class AppEx6 {
	public static void main(String[] args) {

		String[] data;
		String s;
		
		int cnt=0;

		Scanner sc= new Scanner(System.in);

		System.out.printf("세 명의 이름을 입력하세요");

		s=sc.nextLine();
		sc.close();

		data = s.split(" ");//스페이스 바를 기준으로 문자열을 나눠 줌 


		for(String name : data)

			System.out.printf("[%d] : %S \n",cnt++,name);

	}

}
