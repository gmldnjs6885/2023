package Pk0613;

//import java.util.Scanner;

public class Ex3 {
//��ɾ� ���ο��� 
	public static void main(String[] args) {

		//Scanner sc =new Scanner(System.in);
		int d1,d2;
		double sum,avg;
		String name;
		char c;
		
		//System.out.printf("�̸��� �Է��ϼ���");
		name=args[0];
		//System.out.println("�ΰ��� ������ �Է� �ϼ���");
		d1=Integer.parseInt(args[1]);
		d2=Integer.parseInt(args[2]);
	

		sum=d1+d2;
		avg=sum/2;
		
		if(avg>=90)c='A';
		else if(avg>=80) c='B';
		else if(avg>=70) c='C';
		else if(avg>=60) c='D';
		else c='F';
		
		System.out.printf("�̸��� %s",name);
		System.out.println();
		System.out.printf("������ %.2f ����� %.2f ������ %c",sum,avg,c);
		
		
	}

}
