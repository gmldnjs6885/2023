package pk14_06;

public class TeEx3_1 {

	public static void main(String[] args) {
		char n;
		
		for(int i=0; i<26; i++)
		{
			n='A';
			for(int j=0; j<i; j++)
			{
				System.out.printf("%c ",n++);
			}
			System.out.println();
		}

		
	}

}
