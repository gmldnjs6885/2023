package P0511;

public class StrEx4 {

	public static void main(String[] args) {
		String s ="my_member";
		int mylength=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='m')
				mylength++;
		}
		System.out.println("���ڿ������� ������ : " +mylength);
	}

}
