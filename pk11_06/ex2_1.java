package pk11_06;
import java.util.Scanner;
public class ex2_1 {
int cnt,sum;//��������� �ڵ��ʱ�ȭ�� �̷����
//��ü���� ������ ���� ���� ���ο� ������ ���������� ������
Scanner sc =new Scanner(System.in);
int j=0;
	void einput()//�Էº�
	{

		System.out.println("����� �Է��ϼ��� ");
		j=sc.nextInt();
		sc.close();
	}
	void eprocess()//ó���� 
	{
		
		
		for(int i=1; i<=100; i++)
		{
			if(i%j==0) {
				cnt++;
				sum=sum+i;
				
			}
		}
	}
	void eprint()//���
	{
		System.out.printf("\n%d�� ����� ������ %d ",j,cnt);
		System.out.println("����"+sum+"�Դϴ�");
	}
	
	
	public static void main(String[] args) {
		
		ex2_1 k=new ex2_1();//new�� ��ü�� ������� �����밡��
		k.einput();//������ �Է�
		k.eprocess();//ó�� 
		k.eprint();//���
	}
	
	

}
