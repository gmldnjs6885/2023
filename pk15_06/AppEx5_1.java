package pk15_06;

public class AppEx5_1 {
	int age;
	String name;
	
	void setName(String name) {
		this.name=name;
	}
	void setAge(int age)
	{
		this.age=age;
	}

	public static void main(String[] args) {

		AppEx5 g;
	      g=new AppEx5();

	      g.setName("������");//�޼ҵ�
	      g.setAge(20);//�޼ҵ�
	      g.Eprint();

	}

}
