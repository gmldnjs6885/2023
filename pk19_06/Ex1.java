package pk19_06;
import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
		double body,ki,bmi;
		String bido;
		
		System.out.println("�����Զ� Ű�� �Է��ϼ���");
		
		body=sc.nextDouble();
		ki=sc.nextDouble()/100.0;
		
		bmi=(body/(ki*ki));
		
		if(bmi<20)
			bido="��ü��";
		else if(bmi<25)
			bido="����ü��";
		else if(bmi<30)
			bido="��ü��";
		else 
			bido="��";
		
		System.out.printf("������ %.2f Ű %.2f, ",body,ki);
		System.out.printf("BMI����%.2f bmi���:%s",bmi,bido);
		
		
	}

}
