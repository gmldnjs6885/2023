package pk13_06;

public class Ex2 {//��ü�� ���α׷��� ����
	String name;//������� 
	int score;
	Ex2()//������ 
	{
		name="�����";
		score=100;
	}
	public void eprint() {
		System.out.printf("�̸� : %s \n",name);
		System.out.printf("���� : %d \n",score);
	}



	public static void main(String[] args) {
		
		Ex2 m;//���� �ν��Ͻ�����(�ٷ� ����� �� �ִ� ����) 
		m=new Ex2();//��ü���� ���� name�̶� score�� �ҷ���
		
		m.eprint();
		
	}

}
