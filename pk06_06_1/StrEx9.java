package P0511;

public class StrEx9 {

	public static void main(String[] args) {

		String s ="my_member";
		String t =new String("my_member");
		
		System.out.println("1.���ڿ��� ������ ?" + (s == t));//���� �ּ� ���� �޶� f
		System.out.println("2.�������� ������ ?"+s.equals(t));
		
		String h="my_member";
		System.out.println
		("3.���ڿ��� ������ ?" + (s==h));
		System.out.println("4.���ڿ��� ������ ? "+ s.equals(h));
	}

}
