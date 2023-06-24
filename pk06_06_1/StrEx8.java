package P0511;

public class StrEx8 {

	public static void main(String[] args) {

		String s ="   Let's love each other.   ";
		
		System.out.println("기초 문자열 : "+s);
		System.out.println("공백이 제거된 문자열 : "+ s.trim());
		System.out.println("메소드 실행 이후의 문자열 1 :"+s);
		
		s=s.trim();//공백을 지우는 메소드 
		System.out.println("메소드 실행 이후의 문자열 2 :"+s);

	}

}
