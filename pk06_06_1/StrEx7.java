package P0511;

public class StrEx7 {

	public static void main(String[] args) {

		String s="Let's love each other";
		String [] arr=null;
		
		System.out.println("���� ���ڿ� : "+s);
		
		arr=s.split(" ");
		for(String c : arr)
			System.out.println("��ü�� ���ڿ� "+c);
	}

}
