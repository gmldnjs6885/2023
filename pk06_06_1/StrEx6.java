package P0511;

public class StrEx6 {

	public static void main(String[] args) {

		String s ="my_member";
		
		System.out.println("문자열 : " +s);
		System.out.println
		("문자열에서 문자 m을 x로 교체 :" + s.replace('m','x'));//앞에가 원래 단어 뒤에가 바꿀 단어
		System.out.println
		("repalce 메소드에서 실행 후의 문자열 1 :"+s);
		s=s.replace('m','x');//s에 m-x로 바꾼거 저장함
		System.out.println("replace메소드 실행 후 문자열2:"+s);
	}

}
