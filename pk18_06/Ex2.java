package pk18_06;
//∞¥√º
public class Ex2 {
	int da1,da2,da3;
	double sum=0;
	double avg=0;

	Ex2() {

		da1=100;
		da2=90;
		da3=60;
	}
	void SumAvg(){

		sum=da1+da2+da3;

		avg=sum/3;
	}
	void Hprint() {
		System.out.printf("«’¿∫ %.2f ∆Ú±’¿∫ %.2f",sum,avg);
	}
	public static void main(String[] args) {
		Ex2 k;
		k=new Ex2();
		k.SumAvg();
		k.Hprint();

	}

}
