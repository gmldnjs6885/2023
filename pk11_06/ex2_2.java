package pk11_06;

public class ex2_2 {
	int cnt,sum;//��������� �ڵ��ʱ�ȭ�� �̷����
	
//	ex2_2()//����� ������
//	{
//		cnt=0;
//		sum=0;
//	}
	
	void eprocesss()//ó���� 
	{
		for(int i=1; i<=100; i++)
		{
			if(i%5==0) {
				cnt++;
				sum=sum+i;
				
			}
		}
	}
	void eprint()//���
	{
		System.out.printf("\n5�� ����� ������ %d ",cnt);
		System.out.println("����"+sum+"�Դϴ�");
	}
	
	
	public static void main(String[] args) {
		
		ex2_2 k;
		k=new ex2_2();//new�� ��ü�� ������� �����밡��
		k.eprocesss();
		k.eprint();
	}
	
	

}
