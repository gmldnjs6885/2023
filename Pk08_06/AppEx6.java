package Pk08_06;
import java.util.Scanner;
public class AppEx6 {

	public static void main(String[] args) {
		int d=0;
		 Scanner sc= new Scanner(System.in);
		 
		 System.out.println("�Է��� ���� �Է��ϼ���");
		 d=sc.nextInt();
		 System.out.printf("%d ��\n",d);
		 for(int i=1; i<=9;i++)
		 
			 System.out.printf("%d*%d=%d\n",d,i,d*i);
		

	}

}
