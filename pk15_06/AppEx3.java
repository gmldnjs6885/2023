package pk15_06;

public class AppEx3 {
	int age;
	String name;
	
	void input()
	{
		age=500;
		name="ȫ�浿";
	}


	void Eprint() {
		System.out.printf("�̸� : %s , ���� : %d",name,age);

	}
	public static void main(String[] args) {

		AppEx3 g;
		g=new AppEx3();
		
		g.input();
		g.Eprint();

	}

}
