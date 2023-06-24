package pk21_06;
import java.util.Scanner;

class ACX {
	
   int tntwk[];
   int sum;

   void epirnt() {
      System.out.print("내림차순으로 정렬된 결과: ");
      for (int i = 0; i < sum; i++)
         System.out.print("[" + tntwk[i] + "]");
      System.out.println();

      System.out.print("올림차순으로 정렬된 결과: ");
      for (int i = sum - 1; i >= 0; i--)
         System.out.print("[" + tntwk[i] + "]");
   }
}

public class Ex1 extends ACX {
   void yinput() 
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("입력할 데이터의 갯수는?: ");
      sum = sc.nextInt();
      tntwk = new int[sum]; 
      System.out.printf("[%d]의 수를 입력하세요: ", sum);
      for (int i = 0; i < sum; i++) 
         tntwk[i] = sc.nextInt();
   }

   void process() { 
      for (int i = 0; i < sum - 1; i++) {

         //내림차순
         for (int j = 0; j < sum - 1 - i; j++) {
            if (tntwk[j] > tntwk[j + 1]) {
               int tmp = tntwk[j];
               tntwk[j] = tntwk[j + 1];
               tntwk[j + 1] = tmp;
            }
         }
      }

      //올림차순
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