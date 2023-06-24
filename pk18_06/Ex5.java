package pk18_06;
//인터페이스가 적용된 객체 지향
interface InterEx5
{
	void einput();
	void SumAvg();
}
class BaseDataEx5
{
	int da1,da2,da3;
	double sum,avg;
	
	void Hprint() {
		System.out.printf("합은 %.2f 평균은 %.2f",sum,avg);
		
	}
}

public class Ex5 extends BaseDataEx5 implements InterEx5 {
	
	public void einput() { //public이 있어야 인터페이스를 쓸 수 있다
		da1=100;
		da2=90;
		da3=60;
	}
	public void SumAvg(){

		sum=da1+da2+da3;

		avg=sum/3;
	}
	
	public static void main(String[] args) {
		Ex5 k;
		k=new Ex5();
		
		k.einput();
		k.SumAvg();
		k.Hprint();

	}

}
