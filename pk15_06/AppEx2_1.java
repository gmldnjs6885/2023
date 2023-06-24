package pk15_06;

public class AppEx2_1 {
	int age;
	String name;
	
	AppEx2_1()
	{
		age=500;
		name="홍길동";
	}
	
	void Hprint() {
		System.out.printf("이름 :%s 나이 :%d",name,age);
	}

	public static void main(String[] args) {
		AppEx2_1 k;
		k=new AppEx2_1();
		
		k.Hprint();

	}

}
