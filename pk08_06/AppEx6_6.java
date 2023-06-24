package pk08_06;
import java.util.Scanner;
public class AppEx6_6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int k=0;
		System.out.println("입력할 단을 입력하세요 : ");
		k=sc.nextInt();
		for(int i=1; i<=9; i++)
		{
			System.out.printf("%d * %d= %d\n",k,i,(k*i));
		}
	}

}
