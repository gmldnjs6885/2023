package pk0614_1;
import java.util.Scanner;
public class Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		double k[];
		double sum,avg;
		
		sum=0; avg=0;
		
		System.out.print("�Է� �� ������ ������ �Է��Ͻÿ�:");
		n=sc.nextInt();
		
		k=new double [n];
		
		for(int i=0; i<k.length; i++)
		{
			System.out.printf("������ �Է��Ͻÿ�");
			k[i]=sc.nextDouble();
		}
		
		for(int i=0; i<k.length; i++)
		{
			sum+=k[i];
		}
		avg=sum/k.length;
		
		System.out.printf("�Էµ� �����ʹ� : ");
		
		for(int i=0; i<k.length; i++)
		{
			System.out.printf("%.1f ",k[i]);
		}
		System.out.println();
		
		System.out.printf("������ ������ %.2f�̸� , ����� %.2f�Դϴ�",sum,avg);
		
		
	}

}
