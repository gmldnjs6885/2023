package pk15_06;

public class AppEx6 {
	private int age;
	private String name;


	public String getName()//ĸ��ȭ ��� ���� private�� ������� 
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	
	public void setName(String name)
	
	{
		this.name=name;
		
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	
	
	


	


	public static void main(String[] args) {

		AppEx6 g;
		g=new AppEx6();

		g.setName("������");//�޼ҵ�
		g.setAge(20);//�޼ҵ�
		System.out.printf("�̸� : %s , ���� : %d\n",g.getName(),g.getAge());
		//�Ƹ� set���� ���� ������ ���°�?
		
		g.name="ȫ�浿";
		g.age=100;
		System.out.printf("�̸� : %s , ���� : %d",g.getName(),g.getAge());
	}


}
