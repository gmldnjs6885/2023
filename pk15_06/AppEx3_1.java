package pk15_06;

public class AppEx3_1 {
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

	public static void main(String[] args) {

	      AppEx3_1 g;
	      g=new AppEx3_1();
	      
	      g.input();
	      g.Hprint();
	}

}
