package pk18_06;
//객체 지향적
class BaseDataEx3
{
	int da1,da2,da3;
	double sum,avg;
	
	void Hprint() {
		System.out.printf("합은 %.2f 평균은 %.2f",sum,avg);
	}
}

public class Ex3 extends BaseDataEx3{
	void einput() {
		da1=100;
		da2=90;
		da3=60;
	}
	void SumAvg(){

		sum=da1+da2+da3;

		avg=sum/3;
	}
	
	public static void main(String[] args) {
		Ex3 k;
		k=new Ex3();
		
		k.einput();
		k.SumAvg();
		k.Hprint();

	}

}
