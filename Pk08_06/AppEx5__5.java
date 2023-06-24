package Pk08_06;

public class AppEx5__5 {

	public static void main(String[] args) {

		char a;
		
		for(int i=1; i<=26; i++)
		{
			a='A';
			//여기서 A라고 정의 하는 이유는 수자 커져도 다시 A부터 시작 해야 하기 떄문 
			for(int j=1; j<i; j++)
			{	
				System.out.printf(a++ + " ");
			}
			System.out.println();
		}
	}

}
