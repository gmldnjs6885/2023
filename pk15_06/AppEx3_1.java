package pk15_06;

public class AppEx3_1 {
	int age;
	String name;
	void input()
	{
		age=500;
		name="홍길동";
	}
	void Hprint()
	{
		System.out.printf("이름 :%s 나이 :%d",name,age);
	}

	public static void main(String[] args) {

	      AppEx3_1 g;
	      g=new AppEx3_1();
	      
	      g.input();
	      g.Hprint();
	}

}
