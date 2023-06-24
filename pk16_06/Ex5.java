package pk16_06;

public class Ex5 {
	private int age;
	private String name;

	void datalnit(){

		age=100;
		name="홍길동";
	}
	public Ex5(){

		age=100;
		name="홍길동";
	}
	void datalnit(String name,int age)
	{
		this.name=name;
		this.age=age;

	}

	public Ex5(int age, String name) {

		this.age = age;
		this.name = name;
	}

	public Ex5(String name) {

		//this.age = 100; 
		this.name = name;
	}
	public Ex5(int age) {

		this.age = age;
		//this.name = "나한림";

	}

	public void setName(String name)
	{
		this.name=name;
	}

	public void setAge(int age)
	{
		this.age=age;
	}

	public void print()
	{
		System.out.printf("이름 : %s , 나이 :%d",name,age);
		System.out.println();
	}
	public int getAge() {
		
		return age;
	}
	
	public String getName() {
		
		return name;
	}

	public static void main(String[] args) {

		Ex5 k;

		k=new Ex5();
		k.print();

		k=new Ex5("나한림");
		k.print();

		k=new Ex5(500);
		k.print();

		k=new Ex5(200,"이만두");
		k.print();

		k.datalnit("오만두",300);//메소드를 통해 입력 받음
		k.print();

		k.setName("너한림");
		k.setAge(70);
		k.print();

		System.out.println("main() 에서 호출 => 이름 : "+k.getName()+",나이 : "+k.getAge());



	}


}
