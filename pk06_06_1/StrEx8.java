package P0511;

public class StrEx8 {

	public static void main(String[] args) {

		String s ="   Let's love each other.   ";
		
		System.out.println("���� ���ڿ� : "+s);
		System.out.println("������ ���ŵ� ���ڿ� : "+ s.trim());
		System.out.println("�޼ҵ� ���� ������ ���ڿ� 1 :"+s);
		
		s=s.trim();//������ ����� �޼ҵ� 
		System.out.println("�޼ҵ� ���� ������ ���ڿ� 2 :"+s);

	}

}
