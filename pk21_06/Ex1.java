package pk21_06;
import java.util.Scanner;

class ACX {
	
   int tntwk[];
   int sum;

   void epirnt() {
      System.out.print("������������ ���ĵ� ���: ");
      for (int i = 0; i < sum; i++)
         System.out.print("[" + tntwk[i] + "]");
      System.out.println();

      System.out.print("�ø��������� ���ĵ� ���: ");
      for (int i = sum - 1; i >= 0; i--)
         System.out.print("[" + tntwk[i] + "]");
   }
}

public class Ex1 extends ACX {
   void yinput() 
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("�Է��� �������� ������?: ");
      sum = sc.nextInt();
      tntwk = new int[sum]; 
      System.out.printf("[%d]�� ���� �Է��ϼ���: ", sum);
      for (int i = 0; i < sum; i++) 
         tntwk[i] = sc.nextInt();
   }

   void process() { 
      for (int i = 0; i < sum - 1; i++) {

         //��������
         for (int j = 0; j < sum - 1 - i; j++) {
            if (tntwk[j] > tntwk[j + 1]) {
               int tmp = tntwk[j];
               tntwk[j] = tntwk[j + 1];
               tntwk[j + 1] = tmp;
            }
         }
      }

      //�ø�����
      for (int i = 0; i < sum / 2; i++) {
         int tmp = tntwk[i];
         tntwk[i] = tntwk[sum - 1 - i];
         tntwk[sum - 1 - i] = tmp;
      }
   }

   public static void main(String[] args) {
      Ex1 k = new Ex1();
      k.yinput();
      k.process();
      k.epirnt();
   }
}