package pk13_06;
import java.util.Scanner;
public class Ex10 {
	Scanner sc = new Scanner(System.in);
	int size;
	double sum,avg;
	double[] score;
	public void einput()
	{
		System.out.println("�Է��� �������� ������ ? ");
		size= sc.nextInt();
		score=new double[size];
		
		
		for(int i=0; i<size; i++)
		{
			System.out.printf("[%d]: ",i);
			score [i]=sc.nextDouble();
			
			
		}
		
	}
	public void esum()
	{
		sum=0;
		System.out.printf("�Է��� �����ʹ� %d���̰�, ",size);
		for(int i=0; i<size;i++)
		{
			sum+=score[i];
		}
	}
	public void eavg()
	{
		avg=sum/score.length;
	}
	public void eprint()
	{
		for(int i=0; i<size; i++) 
		{
			
			System.out.printf("[%.2f]",score[i]);
		}
		System.out.println();
		System.out.printf("���� %.2f , ����� %.2f�Դϴ�",sum,avg);
	}
	
	
	


	public static void main(String[] args) {
		Ex10 m= new Ex10();
		
		m.einput();
		m.esum();
		m.eavg();
		m.eprint();

	}

}
