package pk15_06;

public class AppEx7 {
	private int age;
	private String name;


	
	public void print()
	{
		System.out.printf("이름 : %s , 나이 : %d",name,age);
	}
	
	
	


	


	public static void main(String[] args) {

		AppEx7 g;
		g=new AppEx7();

		g.setName("나안일");//메소드
		g.setAge(20);//메소드
		System.out.printf("이름 : %s , 나이 : %d\n",g.getName(),g.getAge());
		
		g.name="홍길동";
		g.age=100;
		System.out.printf("이름 : %s , 나이 : %d",g.getName(),g.getAge());
	}








	public int getAge() {
		return age;
	}








	public void setAge(int age) {
		this.age = age;
	}








	public String getName() {
		return name;
	}








	public void setName(String name) {
		this.name = name;
	}

}
