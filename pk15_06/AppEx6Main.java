package pk15_06;

public class AppEx6Main {//AppEx6에서 불러와서 함 

	public static void main(String[] args) {

		AppEx6 g;
		g=new AppEx6();

		g.setName("나안일");//메소드
		g.setAge(20);//메소드
		System.out.printf("이름 : %s , 나이 : %d\n",g.getName(),g.getAge());
		
		g.setName("홍길동");//메소드
		g.setAge(100);//메소드
		System.out.printf("이름 : %s , 나이 : %d",g.getName(),g.getAge());
	}
	

}
