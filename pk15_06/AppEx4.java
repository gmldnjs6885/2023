package pk15_06;

public class AppEx4 {
	int age;
	String name;

	void input()
	{
		age=500;
		name="ȫ�浿";
	}


	void Eprint() {
		System.out.printf("�̸� : %s , ���� : %d",name,age);
		System.out.println();

	}
	void input(String name,int age)
	{
		this.age=age;
		this.name=name;
	}

	
	public static void main(String[] args) {

		AppEx4 g;
		g=new AppEx4();

		g.input();
		g.Eprint();
		
		g.input("�̸���",30);
		g.Eprint();

	}

}
