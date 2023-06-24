package P0511;

public class StrEx7 {

	public static void main(String[] args) {

		String s="Let's love each other";
		String [] arr=null;
		
		System.out.println("기초 문자열 : "+s);
		
		arr=s.split(" ");
		for(String c : arr)
			System.out.println("해체된 문자열 "+c);
	}

}
