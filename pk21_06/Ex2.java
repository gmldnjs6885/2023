package pk21_06;
import java.util.Scanner;

class YU {
    Scanner sc = new Scanner(System.in);
    String ENG;
    StringBuilder eng = new StringBuilder();
    int[] counts = new int[26]; // ���ĺ� ����(���� �ҹ���)��ŭ�� �迭 ����

    void print() {
        System.out.println("�ҹ��ڷ� ��ȭ�� ���ڿ�: " + eng.toString());
        System.out.println("������ ����: " + getConsonantCount(counts) + " ��");
        System.out.println("������ ����: " + getVowelCount(counts) + " ��");
    }

    private int getConsonantCount(int[] counts) {
        int consonantCount = 0;
        for (int i = 0; i < counts.length; i++) {
            if (i != 0 && i != 4 && i != 8 && i != 14 && i != 20) {
                consonantCount += counts[i];
            }
        }
        return consonantCount;
    }

    private int getVowelCount(int[] counts) {
        int vowelCount = 0;
        vowelCount += counts[0]; // 'a' ����
        vowelCount += counts[4]; // 'e' ����
        vowelCount += counts[8]; // 'i' ����
        vowelCount += counts[14]; // 'o' ����
        vowelCount += counts[20]; // 'u' ����
        return vowelCount;
    }
}

public class Ex2 {
    private static Scanner sc = new Scanner(System.in);
    private String ENG;
    private StringBuilder eng = new StringBuilder();
    private int[] counts = new int[26]; // ���ĺ� ����(���� �ҹ���)��ŭ�� �迭 ����

    public void einput() {
        System.out.print("���� ���ڿ��� �Է��ϼ���: ");
        ENG = sc.nextLine();

        for (int i = 0; i < ENG.length(); i++) {
            char tmp = ENG.charAt(i);
            if (tmp >= 65 && tmp <= 90) {
                tmp = (char) (tmp + 32);
            }

            if (tmp >= 97 && tmp <= 122) {
                eng.append(tmp);
                int index = tmp - 'a'; // ���ĺ� 'a'�� �������� �ε��� ���
                counts[index]++;
            } else if (tmp == ' ') {
                eng.append(' ');
            }
        }
    }

    public static void main(String[] args) {
        Ex2 k = new Ex2();
        k.einput();

        YU yu = new YU();
        yu.ENG = k.ENG;
        yu.eng = k.eng;
        yu.counts = k.counts;

        yu.print();
    }
}