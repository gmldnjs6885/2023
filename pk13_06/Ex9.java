package pk13_06;
import  java.util.Scanner;
public class Ex9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		double sum,avg;
		double[] score;
		
		System.out.println("입력할 데이터의 개수는 ? ");
		size= sc.nextInt();
		score=new double[size];
		
		
		for(int i=0; i<size; i++)
		{
			System.out.printf("[%d]: ",i);
			score [i]=sc.nextDouble();
			
			
		}
		sum=0;
		System.out.printf("입력한 데이터는 %d개이고, ",size);
		
		for(int i=0; i<size;i++)
		{
			sum+=score[i];
		}
		for(int i=0; i<size; i++) 
		{
			
			System.out.printf("[%.2f]",score[i]);
		}
		avg=sum/score.length;
		System.out.println();
		System.out.printf("합은 %.2f , 평균은 %.2f입니다",sum,avg);
		
		
		
		
		

	}

}
