package pk09_06;
import java.util.Scanner;
public class AppEx4__4 {

	public static void main(String[] args) {
		int n=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ݺ������� �Է��ϼ���:");
		 n=sc.nextInt();
		  String [] name;
		 name = new String [n];
		 
		 for(int i=0; i<n; i++)
		 {
			 System.out.printf("�̸��� �Է��ϼ���[%d] :",i);
			  
			 name[i]=sc.next();
		 }
		 System.out.print("�Է��� �̸��� [");
		 for(int i=0; i<n; i++)
		 {
			 if(i==n-1)
				 System.out.printf("%s",name[i]);
			 else
				 System.out.printf("%s,",name[i]);
		 }
		 System.out.println("]�Դϴ�.");
		

	}

}
