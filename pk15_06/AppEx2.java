package pk15_06;

public class AppEx2 {
	int age;
	String name;
	
	AppEx2()
	{
		age=500;
		name="ȫ�浿";
	}


	void Eprint() {
		System.out.printf("�̸� : %s ���� : %d",name,age);

	}
	public static void main(String[] args) {

		AppEx2 g;
		g=new AppEx2();
		
		g.Eprint();

	}

}
