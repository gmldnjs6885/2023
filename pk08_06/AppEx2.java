package pk08_06;

public class AppEx2 {

	public static void main(String[] args) {
		char h='A';
		for(int i=1; i<=26;i++)
		{
			if(i%2!=0)
				System.out.print(h +" ");

			else


				System.out.print((char)(h+32)+" ");

			h++;

		}

	}

}
