package pk08_06;

public class AppEx3_3 {

	public static void main(String[] args) {
		char n='A';

		for(int i=0; i<26; i++)
		{
			if(n%2!=0)

				System.out.print(n+" ");
			n++;
		}System.out.println();
		n='A';
		for(int i=0; i<26; i++)
		{
			if(n%2==0)
				System.out.print(" "+(char)(n+32));
			n++;
		}

	}

}
