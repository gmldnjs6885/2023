package P0511;

public class StrEx6 {

	public static void main(String[] args) {

		String s ="my_member";
		
		System.out.println("���ڿ� : " +s);
		System.out.println
		("���ڿ����� ���� m�� x�� ��ü :" + s.replace('m','x'));//�տ��� ���� �ܾ� �ڿ��� �ٲ� �ܾ�
		System.out.println
		("repalce �޼ҵ忡�� ���� ���� ���ڿ� 1 :"+s);
		s=s.replace('m','x');//s�� m-x�� �ٲ۰� ������
		System.out.println("replace�޼ҵ� ���� �� ���ڿ�2:"+s);
	}

}
