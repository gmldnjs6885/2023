package P0511;

public class StrEx9 {

	public static void main(String[] args) {

		String s ="my_member";
		String t =new String("my_member");
		
		System.out.println("1.문자열은 같은가 ?" + (s == t));//둘의 주소 값이 달라서 f
		System.out.println("2.문저열은 같은가 ?"+s.equals(t));
		
		String h="my_member";
		System.out.println
		("3.문자열은 같은가 ?" + (s==h));
		System.out.println("4.문자열은 같은가 ? "+ s.equals(h));
	}

}
