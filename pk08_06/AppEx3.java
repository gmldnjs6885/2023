package pk08_06;

public class AppEx3 {

	public static void main(String[] args) {
		char h='A';

		for(int i=1; i<=26; i++)
		{
			if(h%2!=0)

				System.out.print(h+" ");
			h++; 
		}System.out.println();
		h='A';
		for(int i=1; i<=26;i++)
		{
			if(i%2==0)
				System.out.print((char)(h+32)+" ");

			h++;
		}

	}

}
