package pk21_06;
import java.util.Scanner;
public class Ex1_1 {

	public static void main(String[] args) {

		int score[];
		int n;

		Scanner sc =new Scanner(System.in);
		System.out.println("입력할 데이터의 갯수는?");
		n=sc.nextInt();
		score=new int [n];
		System.out.printf("[%d]만큼 입력 하세요",n);

		for(int i=0; i<n; i++)
		{
			score[i]=sc.nextInt();
		}

		for(int i=0; i<n-1; i++)
		{
			for(int j=0; j<n-1-i;j++) {
				if(score[i]>score[j+1])
				{
					int down=score[j];
					score[j]=score[j+1];
					score[j+1]=down;
				}//end of if
			}//end of for j
		}//end of for i

		
		for(int i=0; i<n/2; i++)
		{
			int up=score[i];
			score[i]=score[n-1-i];
			score[n-1-i]=up;
		}
		System.out.print("내림차순으로 정렬된 결과; ");

		for(int i=0; i<n; i++)
		{
			System.out.printf("[%d]",score[i]);
		}
		System.out.println();

		System.out.printf("올림차순으로 정렬된 결과 :");

		for(int i= n-1; i>=0;i-- )
		{
			System.out.printf("[%d]",score[i]);
		}


	}

}
