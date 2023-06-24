package pk17_06;
import java.util.Scanner;

class Ex1Super
{
	int age;
	String name;

	public void print()
	{
		System.out.printf("이름 : %s , 나이 :%d",name,age);
		System.out.println();
	}
	public void setName(String name)
	{
		this.name=name;
	}

	public void setAge(int age)
	{
		this.age=age;
	}


	public int getAge() {

		return age;
	}
	public String getName() {

		return name;
	}

}//end of class Ex1Super 

public class Ex1 extends Ex1Super {

	void datalnit(){

		age=100;
		name="홍길동";
	}
	public Ex1(){

		age=100;
		name="홍길동";
	}
	void datalnit(String name,int age)
	{
		this.name=name;
		this.age=age;

	}

	public Ex1(int age, String name) {

		this.age = age;
		this.name = name;
	}

	public Ex1(String name) {

		//this.age = 100; 
		this.name = name;
	}
	public Ex1(int age) {

		this.age = age;
		//this.name = "나한림";

	}

	
	public int getAgeGroup() {

		return age;
	}

	public void dataInput()
	{

		Scanner sc = new Scanner(System.in);

		System.out.println("이름과 나이를 입력하세요");
		this.name=sc.nextLine();//**블랭크를 넣으면 안됨 블랭크 말고 엔터**
		this.age=sc.nextInt();

		if(age>=17)

			sc.close();

	}

	public static void main(String[] args) {

		Ex1 k;

		k=new Ex1();
		k.print();

		k=new Ex1("나한림");
		k.print();

		k=new Ex1(500);
		k.print();

		k=new Ex1(200,"이만두");
		k.print();

		k.datalnit("오만두",300);//메소드를 통해 입력 받음
		k.print();

		k.setName("너한림");//메소드 초기화 기본이 private
		k.setAge(70);
		k.print();

		k.dataInput();
		k.print();

		System.out.println("main() 에서 호출 => 이름 : "+k.getName()+",나이 : "+k.getAge());



	}

}
