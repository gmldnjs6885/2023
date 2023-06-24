package pk07_06;
import java.util.Scanner;
public class AppEx3 {

	public static void main(String[] args) {

		String[] data;
		
		int cnt=0;

		Scanner sc= new Scanner(System.in);

		System.out.printf("세 명의 이름을 입력하세요");

		data =new String[3];
		
		for(int i=0; i<data.length; i++)
		
			data[i]= sc.next();
		
		sc.close();



		for(String name : data)

			System.out.printf("[%d] : %S \n",cnt++,name);

	}
}
