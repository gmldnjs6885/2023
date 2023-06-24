package pk14_06;

public class TeEx3_2 {
	char n;
	public void ForFor()
	{
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


	public static void main(String[] args) {
		TeEx3_2 k;
		k=new TeEx3_2();
		k.ForFor();
		
	}

}
