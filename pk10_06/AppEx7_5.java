package pk10_06;

import java.util.Scanner;

public class AppEx7_5 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		double [] n;
		n=new  double [3];
		int sum=0;
		int avg=0;
		char a;
		
		
		for(int i=0; i<n.length; i++)
		{
			System.out.println("������ �Է��ϼ���");
			n[i]=sc.nextInt();
			sum=sum+(int)n[i];
			
		}
		
		avg=sum/n.length;
		
		
		switch(avg/10) {
		case 10:
			a='A';
		case 9 :
			a='A';break;
		case 8 :
			a='B';break;
		case 7 :
			a='C';break;
		case 6 :
			a='D';break;
			default:
				a='F'; break;
		}
		System.out.printf("������ ������ %d �����%d ������",sum,avg);
		System.out.printf("\"%c\"�����Դϴ�",a);
	
		
		
		
	
		
		

	}

}
