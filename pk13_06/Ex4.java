package pk13_06;

public class Ex4 {
	String name;//멤버변수 
	int score;
	public void einput()//생성자 
	{
		name="손희원";
		score=100;
		
	}
	public void einput(String name)//생성자 
	{
		this.name=name;
		score=100;
		System.out.println("--------------");
	}
	public void einput(int score)//생성자 
	{
		name="손희원";
		this.score=score;
		System.out.println("--------------");
	}
	
	public void einput(String name,int score)//생성자 
	{
		this.name=name;
		this.score=score;
		System.out.println("--------------");
	}
	public void eprint() {
		System.out.printf("이름 : %s \n",name);
		System.out.printf("점수 : %d \n",score);
	}
	
	



	public static void main(String[] args) {

		Ex4 m1=new Ex4();
		
		
		m1.einput();
		m1.eprint();
		
		m1.einput("이만두");
		m1.eprint();
		
		m1.einput(78);
		m1.eprint();
		
		m1.einput("박달래",50);
		m1.eprint();

		

	}

}
