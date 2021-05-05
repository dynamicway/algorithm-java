package Programmers.level1;

import java.util.Arrays;


public class GymClothes {
    public static void main(String[] args) {
        int[] lost = {2, 4};
        int[] reserve = {3};
        System.out.println(solution(5, lost, reserve));
    }

    public static int solution(int n, int[] lost, int[] reserve) {

        lost = Arrays.stream(lost).sorted().toArray();
        reserve = Arrays.stream(reserve).sorted().toArray();

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j] + 1) {
                    lost[i] = 0;
                    break;
                }
                if (lost[i] > reserve[j])
                    break;
                if (lost[i] == reserve[j]) {
                    lost[i] = 0;
                    break;
                }
                if (lost[i] == reserve[j] - 1) {
                    lost[i] = 0;
                    break;
                }
            }
        }

        return (int) Arrays.stream(lost).filter(i -> i == 0).count();

    }
}
