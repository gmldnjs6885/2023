package P0511;

public class ArrayTest1 {

	public static void main(String[] args) {
		int [] s= new int [10];
		
		for(int i=0; i<s.length; i++)//10개입력
		{
			s[i]=i;
			
		}
		
		for(int i=0; i<s.length; i++)
		{
			System.out.print(s[i]+" ");//그거 출력 
		}
	}

}
