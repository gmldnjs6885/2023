package Pk08_06;
import java.util.Scanner;
public class AppEx6 {

	public static void main(String[] args) {
		int d=0;
		 Scanner sc= new Scanner(System.in);
		 
		 System.out.println("입력할 단을 입력하세요");
		 d=sc.nextInt();
		 System.out.printf("%d 단\n",d);
		 for(int i=1; i<=9;i++)
		 
			 System.out.printf("%d*%d=%d\n",d,i,d*i);
		

	}

}
