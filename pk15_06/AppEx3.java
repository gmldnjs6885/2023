package pk15_06;

public class AppEx3 {
	int age;
	String name;
	
	void input()
	{
		age=500;
		name="홍길동";
	}


	void Eprint() {
		System.out.printf("이름 : %s , 나이 : %d",name,age);

	}
	public static void main(String[] args) {

		AppEx3 g;
		g=new AppEx3();
		
		g.input();
		g.Eprint();

	}

}
