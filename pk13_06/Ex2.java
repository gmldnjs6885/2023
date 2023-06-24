package pk13_06;

public class Ex2 {//객체적 프로그래밍 구조
	String name;//멤버변수 
	int score;
	Ex2()//생성자 
	{
		name="손희원";
		score=100;
	}
	public void eprint() {
		System.out.printf("이름 : %s \n",name);
		System.out.printf("점수 : %d \n",score);
	}



	public static void main(String[] args) {
		
		Ex2 m;//선언 인스턴스변수(바로 사용할 수 있는 변수) 
		m=new Ex2();//객체생성 위에 name이랑 score가 불러짐
		
		m.eprint();
		
	}

}
