package pk19_06;
 import java.util.Scanner;
 //�����Զ� Ű �Է� �޾Ƽ� Bmi���ϱ� 
 
public class Ex1_1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int m,kg,bmi;
		String g;
		System.out.println("Bmi�� ������ Ű�� �����Ը� �Է� �ϼ���");
		m=sc.nextInt()/100;
		kg=sc.nextInt();
		
		sc.close();
		
		bmi=(kg/(m*m));
		
		if(bmi<20)
			g="��ü��";
		else if(bmi<25)
			g="����";
		else if(bmi<30)
			g="��ü��";
		else 
			g="��";
		
		
	System.out.printf("�Է��� Ű�� %d �Է��� �����Դ� %d",m,kg);
	System.out.printf("bmi������ %d�̰� %s �Դϴ�",bmi,g);
		
		
	}

}
