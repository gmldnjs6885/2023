package pk15_06;

public class AppEx2_1 {
	int age;
	String name;
	
	AppEx2_1()
	{
		age=500;
		name="ȫ�浿";
	}
	
	void Hprint() {
		System.out.printf("�̸� :%s ���� :%d",name,age);
	}

	public static void main(String[] args) {
		AppEx2_1 k;
		k=new AppEx2_1();
		
		k.Hprint();

	}

}
