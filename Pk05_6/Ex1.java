package Pk05_6;
import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		Scanner sc;
		int d;
		String msg;

		sc = new Scanner(System.in);
		System.out.println("�������� �Է��ϼ���");
		d=sc.nextInt();

		sc.close();

		if(d%2==0)
			msg="¦��";

		else
			msg="Ȧ��";

		System.out.printf("�Է��� ���� [%d]�̰�,[%s]�Դϴ� ",d,msg);





	}

}
