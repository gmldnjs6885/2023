package pk08_06;

public class AppEx2__2 {

	public static void main(String[] args) {
char n='A';
		
		for(int i=0; i<26; i++)
		{

			if(i%2==0)
				System.out.printf("%c ",n);
			else 
				System.out.printf("%c ",(n+32));
			n++;
			
		}
		
		
	}

}
