package Programmers.greedy;

public class GymClothes {

    public static void main(String[] args) {
        int[] lost = {1,2,3};
        int[] reserve = {1,3,5};
        System.out.println(solution(5, lost, reserve));
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        duplicateCheck(lost, reserve);
        sharingClothes(lost, reserve);
        return n - getResult(lost);
    }

    public static void duplicateCheck(int[] arr1, int[] arr2) {
        for (int i=0; i < arr1.length; i++) {
            for(int j=0; j < arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    arr1[i] = 0;
                    arr2[j] = 0;
                    break;
                }
            }
        }
    }

    public static void sharingClothes(int[] lost, int[] reserve) {
        int l = 0, r = 0;

        for (int i=0; i < lost.length; i++) {
            for(int j=0; j < reserve.length; j++) {
                if(reserve[j] == 0)
                    continue;
                l = lost[i];
                r = reserve[j];

                if(l == r - 1 || l == r+1) {
                    lost[i] = 0;
                    reserve[j] = 0;
                    break;
                }
            }
        }
    }

    public static int getResult(int[] lost) {
        int result = 0;

        for (int i : lost) {
            if (i != 0)
                result++;
        }

        return result;
    }
}
