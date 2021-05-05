package codingFestival;

import java.util.Scanner;
import java.util.TreeSet;

public class socar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        TreeSet<String> starts = new TreeSet<>();
        TreeSet<String> ends = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            String tmp = sc.nextLine();
            Scanner sc2 = new Scanner(tmp).useDelimiter("~");
            starts.add(sc2.next().trim());
            ends.add(sc2.next().trim());
        }
        if (starts.last().compareTo(ends.first()) > 0) {
            System.out.println(-1);
        } else {
            System.out.printf("%s ~ %s", starts.last(), ends.first());

        }
        sc.close();
    }
}
