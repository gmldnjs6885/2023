package pk0614;
import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double [] n;
		double sum,avg;
		sum=0;
		avg=0;
		int k;
		
		System.out.printf("�Է��� ���� ������ �Է��ϼ���");
		k=sc.nextInt();
		
		n=new double [k];
		for(int i=0; i<n.length; i++)
		{
			System.out.print("������ �Է��Ͻÿ�:");
			n[i]=sc.nextDouble();
		}
		
		
		for(int i=0; i<n.length; i++)
		{
			sum+=n[i];
		}
		avg=sum/n.length;
		System.out.print("�Էµ� �����ʹ�: ");

		for(int i=0; i<n.length; i++)
		{
			System.out.printf("%.1f  ",n[i]);
			
		}
		System.out.println();
		System.out.printf("������ ������ %.2f�̸� ����� %.2f�Դϴ�",sum,avg);
	}
}
