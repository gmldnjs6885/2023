package pk21_06;
import java.util.Scanner;

class YU {
    Scanner sc = new Scanner(System.in);
    String ENG;
    StringBuilder eng = new StringBuilder();
    int[] counts = new int[26]; // 알파벳 개수(영문 소문자)만큼의 배열 생성

    void print() {
        System.out.println("소문자로 변화된 문자열: " + eng.toString());
        System.out.println("자음의 개수: " + getConsonantCount(counts) + " 개");
        System.out.println("모음의 개수: " + getVowelCount(counts) + " 개");
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
        vowelCount += counts[0]; // 'a' 개수
        vowelCount += counts[4]; // 'e' 개수
        vowelCount += counts[8]; // 'i' 개수
        vowelCount += counts[14]; // 'o' 개수
        vowelCount += counts[20]; // 'u' 개수
        return vowelCount;
    }
}

public class Ex2 {
    private static Scanner sc = new Scanner(System.in);
    private String ENG;
    private StringBuilder eng = new StringBuilder();
    private int[] counts = new int[26]; // 알파벳 개수(영문 소문자)만큼의 배열 생성

    public void einput() {
        System.out.print("영문 문자열을 입력하세요: ");
        ENG = sc.nextLine();

        for (int i = 0; i < ENG.length(); i++) {
            char tmp = ENG.charAt(i);
            if (tmp >= 65 && tmp <= 90) {
                tmp = (char) (tmp + 32);
            }

            if (tmp >= 97 && tmp <= 122) {
                eng.append(tmp);
                int index = tmp - 'a'; // 알파벳 'a'를 기준으로 인덱스 계산
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