package pk09_06;

public class AppEx1 {

	public static void main(String[] args) {
		int cnt=0; 
		
		for(int i=1; i<100; i++)
		{
			if(cnt==7) {
				cnt=0; 
				System.out.println();
			}
			if(i%5==0)
			{
				
				System.out.print(i+" ");
				cnt+=1;
			}
		}

	}

}
