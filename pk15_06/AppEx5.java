package pk15_06;

public class AppEx5 {
	int age;
	String name;


	void setName(String name)
	
	{
		this.name=name;
		
	}
	void setAge(int age)
	{
		this.age=age;
	}
	


	void Eprint() {
		System.out.printf("�̸� : %s , ���� : %d",name,age);
		

	}


	public static void main(String[] args) {

		AppEx5 g;
		g=new AppEx5();

		g.setName("������");//�޼ҵ�
		g.setAge(20);//�޼ҵ�
		g.Eprint();

	}

}
