package pk04_6;

public class ForEx2 {
	//1부터 100까지의 수 중 짝수의 데이터 출력
	// 1 100 5

	public static void main(String[] args) {

		int i;

		for(i=1; i<=100; i++)
		{

			if(i%5==0)//짝수 일떄는 i%2==0 홀수는 i%2!=0

				System.out.printf("%4d",i);
		}

	}

}
