package P0511;

public class StrEx2 {

	public static void main(String[] args) {
		int [] arr = {10,20,30,40,50};//int 4byte*5�� 20����Ʈ
		int mylength;
		mylength =arr.length*Integer.BYTES;//����Ʈ ũ�⸦ ��� ����
		
		System.out.println("�迭�� ����Ʈ(ũ��) ��� : "+mylength);
	}

}
