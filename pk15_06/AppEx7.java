package pk15_06;

public class AppEx7 {
	private int age;
	private String name;


	
	public void print()
	{
		System.out.printf("�̸� : %s , ���� : %d",name,age);
	}
	
	
	


	


	public static void main(String[] args) {

		AppEx7 g;
		g=new AppEx7();

		g.setName("������");//�޼ҵ�
		g.setAge(20);//�޼ҵ�
		System.out.printf("�̸� : %s , ���� : %d\n",g.getName(),g.getAge());
		
		g.name="ȫ�浿";
		g.age=100;
		System.out.printf("�̸� : %s , ���� : %d",g.getName(),g.getAge());
	}








	public int getAge() {
		return age;
	}








	public void setAge(int age) {
		this.age = age;
	}








	public String getName() {
		return name;
	}








	public void setName(String name) {
		this.name = name;
	}

}
