package pk15_06;

public class AppEx4_1 {
	int age;
	String name;
	
	void input()
	{
		age=500;
		name="ȫ�浿";
	}

	void Hprint()
	{
		System.out.printf("�̸� :%s ���� :%d",name,age);

	}
	void input(String name,int age)
	{
		this.age=age;
		this.name=name;
	}

	public static void main(String[] args) {

		AppEx4_1 g;
		g=new AppEx4_1();

		g.input();
		g.Hprint();
		System.out.println();

		g.input("�̸���",30);
		g.Hprint(); 	}

}
