package pk15_06;

public class AppEx6_1 {
	int age;
	String name;
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
		 AppEx6_1 g =new AppEx6_1();

	      g.setName("������");//�޼ҵ�
	      g.setAge(20);//�޼ҵ�
	      System.out.printf("�̸� : %s , ���� : %d\n",g.getName(),g.getAge());
	      
	      g.name="ȫ�浿";
	      g.age=100;
	      System.out.printf("�̸� : %s , ���� : %d",g.getName(),g.getAge());
	   }
		
	

}
