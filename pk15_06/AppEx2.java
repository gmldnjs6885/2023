package pk15_06;

public class AppEx2 {
	int age;
	String name;
	
	AppEx2()
	{
		age=500;
		name="홍길동";
	}


	void Eprint() {
		System.out.printf("이름 : %s 나이 : %d",name,age);

	}
	public static void main(String[] args) {

		AppEx2 g;
		g=new AppEx2();
		
		g.Eprint();

	}

}
