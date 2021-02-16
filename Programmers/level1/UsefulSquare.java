package Programmers.level1;

public class UsefulSquare {
    public static long solution(int w, int h) {
        double tan = Math.min(w, h) / (double) Math.max(w, h);
        int cnt = 0;
        for (int i = 1; i <= Math.max(w, h); i++) {
            cnt++;
            if (i == 1) continue;
            if (Math.floor(i * tan) == i * tan) continue;
            if (Math.floor((i-1)*tan) == (i-1)*tan) continue;
            if (Math.ceil((i - 1) * tan) < i * tan) {
                cnt++;
            }
        }
        return (long) w * h - cnt;
    }
}
