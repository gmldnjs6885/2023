package pk15_06;

public class AppEx6Main {//AppEx6���� �ҷ��ͼ� �� 

	public static void main(String[] args) {

		AppEx6 g;
		g=new AppEx6();

		g.setName("������");//�޼ҵ�
		g.setAge(20);//�޼ҵ�
		System.out.printf("�̸� : %s , ���� : %d\n",g.getName(),g.getAge());
		
		g.setName("ȫ�浿");//�޼ҵ�
		g.setAge(100);//�޼ҵ�
		System.out.printf("�̸� : %s , ���� : %d",g.getName(),g.getAge());
	}
	

}
