package pk18_06;
//�߻�Ŭ������ ����� ��ü ����
abstract class BaseDataEx4
{
	int da1,da2,da3;
	double sum,avg;
	abstract void einput();
	abstract void SumAvg();
	void Hprint() {
		System.out.printf("���� %.2f ����� %.2f",sum,avg);
		
	}
}

public class Ex4 extends BaseDataEx4{
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
		Ex4 k;
		k=new Ex4();
		
		k.einput();
		k.SumAvg();
		k.Hprint();

	}

}