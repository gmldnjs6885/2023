package Pk08_06;

public class AppEx5__5 {

	public static void main(String[] args) {

		char a;
		
		for(int i=1; i<=26; i++)
		{
			a='A';
			//���⼭ A��� ���� �ϴ� ������ ���� Ŀ���� �ٽ� A���� ���� �ؾ� �ϱ� ���� 
			for(int j=1; j<i; j++)
			{	
				System.out.printf(a++ + " ");
			}
			System.out.println();
		}
	}

}
