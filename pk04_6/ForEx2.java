package pk04_6;

public class ForEx2 {
	//1���� 100������ �� �� ¦���� ������ ���
	// 1 100 5

	public static void main(String[] args) {

		int i;

		for(i=1; i<=100; i++)
		{

			if(i%5==0)//¦�� �ϋ��� i%2==0 Ȧ���� i%2!=0

				System.out.printf("%4d",i);
		}

	}

}
