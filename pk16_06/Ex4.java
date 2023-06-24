package pk16_06;

public class Ex4 {
	//메소드 오버로딩이 적용된 것 
	//객체적으로 만들라하면 메소드 
	
	
	int age;
	String name;

	void datalnit(){

		age=100;
		name="홍길동";
	}
	public Ex4(){

		age=100;
		name="홍길동";
	}
	void datalnit(String name,int age)
	{
		this.name=name;
		this.age=age;
		
	}

	public Ex4(int age, String name) {

		this.age = age;
		this.name = name;
	}

	public Ex4(String name) {

		//this.age = 100; 
		this.name = name;
	}
	public Ex4(int age) {

		this.age = age;
		//this.name = "나한림";

	}
	public void print()
	{
		System.out.printf("이름 : %s , 나이 :%d",name,age);
		System.out.println();
	}

	public static void main(String[] args) {

		Ex4 k;

		k=new Ex4();
		k.print();

		k=new Ex4("나한림");
		k.print();

		k=new Ex4(500);
		k.print();

		k=new Ex4(200,"이만두");
		k.print();
		
		k.datalnit("오만두",300);//메소드를 통해 입력 받음
		k.print();
		
		

	}

}
