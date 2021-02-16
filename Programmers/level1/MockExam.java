package Programmers.level1;

public class MockExam {
    public static void main(String[] args) {

    }

    public int[] solution(int[] answer) {
        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] s3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == s1[i % s1.length]) {
                a++;
            }
            if (answer[i] == s2[i % s2.length]) {
                b++;
            }
            if (answer[i] == s3[i % s3.length]) {
                c++;
            }
        }
        return getArr(a, b, c);
    }

    public int[] getArr(int a, int b, int c) {
        if (a == b && b == c) {
            return new int[]{1, 2, 3};
        }
        if (a == b && a > c) {
            return new int[]{1, 2};
        }
        if (a == c && a > b) {
            return new int[]{1, 3};
        }
        if (b == c && b > a) {
            return new int[]{2, 3};
        }
        if (a > b && a > c) {
            return new int[]{1};
        }
        if (b > a && b > c) {
            return new int[]{2};
        }
        if (c > a && c > b) {
            return new int[]{3};
        }
        return new int[]{0};
    }
}


