package pk0406과제;
import java.util.Scanner;
public class homeWork2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int [] data;
		data =new int[5];

		for(int i=0; i<data.length; i++)
		{

			System.out.print("["+i+"]데이터 :");
			data[i]=sc.nextInt();

			if(data[i]<0||data[i]>100) {
				System.out.println("유효하지 않은 데이터 입니다. 다시 입력 하세요 ");
			i--;}
			
			
		}//end of for

		for(int i=0; i<data.length; i++)
		{
			System.out.printf("[%d]",i);
			for(int j=0; j<data[i]/10; j++)
			{
				System.out.printf("■ ");
			}
			System.out.printf("(%d)\n",data[i]);

		}

	}

}
