package pk16_06;

public class Ex3 {
	//생성자 오버로딩이 적용된 객체적 프로그래밍을 만드시오 이런식으로 시험 
	

	int age;
	String name;

	public Ex3(){

		age=100;
		name="홍길동";
	}

	public Ex3(int age, String name) {

		this.age = age;
		this.name = name;
	}

	public Ex3(String name) {

		//this.age = 100; 
		this.name = name;
	}
	public Ex3(int age) {

		this.age = age;
		//this.name = "나한림";

	}
	public void print()
	{
		System.out.printf("이름 : %s , 나이 :%d",name,age);
		System.out.println();
	}

	public static void main(String[] args) {

		Ex3 k;

		k=new Ex3();
		k.print();

		k=new Ex3("나한림");
		k.print();

		k=new Ex3(500);
		k.print();

		k=new Ex3(200,"이만두");
		k.print();

	}
}
