package pk0406과제;
import java.util.Scanner;
public class homework1 {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int [] data;
		data =new int[5];

		for(int i=0; i<data.length; i++)
		{

			System.out.print("["+i+"]데이터 :");
				data[i]=sc.nextInt();
		}//end of for
		
		
		
			System.out.print("입력된 데이터는");
			for(int i=0; i<data.length; i++)
			{
				System.out.print(data[i]);
				
				if(i!=data.length-1)
					System.out.print(",");
				
			}
			
			System.out.println("입니다");



	}

}
