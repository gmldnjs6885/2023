package Pk08_06;

public class AppEx2_2 {

	public static void main(String[] args) {
		char n='A';

		for(int i=0; i<26;i++)
		{
			if(n%2!=0)
				System.out.print(n+" ");
			
			else 
				System.out.print((char)(n+32)+" ");//소문자 대문자 차이가 32
			n++;
		}

	}

}
