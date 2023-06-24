package Pk0614_2;
import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in); 
		int score [];
		int n, max,low;
		
		System.out.println("입력 할 데이터 수는?");
		n=sc.nextInt();
		
		score = new int [n];
		
		System.out.printf("[%d]만큼 입력하세요");
		
		for(int i=0; i<score.length; i++)
		{
			score [i]=sc.nextInt();
		}
		
		
		for(int i=0; i<score.length-1; i++)
		{
			for(int j=0; j<score.length-1-i; j++)
			{
				if(score[i]>score[j+1])
				{
					
				}
			}
		}
	}

}
