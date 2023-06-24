package pk13_06;

public class Ex3_1 {
	String name;//멤버변수 
	int score;
	Ex3_1()//생성자 
	{
		name="손희원";
		score=100;
	}

	Ex3_1(String name)

	{
		this.name=name;
		score=100;
	}
	Ex3_1(int score)

	{
		name="손희원";
		this.score=score;
	}
	Ex3_1(String name, int score )
	{
		this.name=name;
		this.score=score;
	}
	
	public void eprint()
	{
		System.out.printf("이름 : %s\n",name);
		System.out.printf("점수 : %d",score);
		System.out.println();
		System.out.println("-----------");
	}




	public static void main(String[] args) {

		Ex3_1 m1,m2,m3,m4;
		m1=new Ex3_1();	
		m1.eprint();

		m2=new Ex3_1("이만두");
		m2.eprint();

		m3=new Ex3_1(78);
		m3.eprint();

		m4= new Ex3_1("박달래",50);
		m4.eprint();

	}

}
