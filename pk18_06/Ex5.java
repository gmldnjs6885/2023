package pk18_06;
//�������̽��� ����� ��ü ����
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
		System.out.printf("���� %.2f ����� %.2f",sum,avg);
		
	}
}

public class Ex5 extends BaseDataEx5 implements InterEx5 {
	
	public void einput() { //public�� �־�� �������̽��� �� �� �ִ�
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
