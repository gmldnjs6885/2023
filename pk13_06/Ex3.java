package pk13_06;

public class Ex3 {
	String name;//멤버변수 
	int score;
	Ex3()//생성자 
	{
		name="손희원";
		score=100;
	}
	Ex3(String name)//생성자 
	{
		this.name=name;
		score=100;
	}
	Ex3(int score)//생성자 
	{
		name="손희원";
		this.score=score;
	}
	
	Ex3(String name,int score)//생성자 
	{
		this.name=name;
		this.score=score;
	}
	public void eprint() {
		System.out.printf("이름 : %s \n",name);
		System.out.printf("점수 : %d \n",score);
	}
	



	public static void main(String[] args) {

		Ex3 m1,m2,m3,m4;
		m1=new Ex3();
		m1.eprint();

		m2=new Ex3("이만두");
		m2.eprint();

		m3=new Ex3(78);
		m3.eprint();
		
		m4= new Ex3("박달래",50);
		m4.eprint();


		

	}


}
