package Pk0613;
//매게변수에 의한 입력 
public class Ex4 {


	int d1,d2;
	double sum,avg;
	String name;
	char c;

	void Hinput(String[] args)
	{
		name=args[0];
		d1=Integer.parseInt(args[1]);
		d2=Integer.parseInt(args[2]);
	}

	void Hcompute()
	{
		sum=d1+d2;
		avg=sum/2;

		if(avg>=90)c='A';
		else if(avg>=80) c='B';
		else if(avg>=70) c='C';
		else if(avg>=60) c='D';
		else c='F';
	}
	
	void Hprint() {
		System.out.printf("이름은 %s",name);
		System.out.println();
		System.out.printf("총합은 %.2f 평균은 %.2f 학점은 %c",sum,avg,c);
	}
	public static void main(String[] args) {

		Ex4 k= new Ex4();
		
		k.Hinput(args);
		k.Hcompute();
		k.Hprint();
		
	}

}
