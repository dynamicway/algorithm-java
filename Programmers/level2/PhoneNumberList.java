package Programmers.level2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class PhoneNumberList {
    public static boolean solution(String[] phone_book) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList(phone_book));
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length())
                    return o1.compareTo(o2);
                return o1.length() - o2.length();
            }
        });
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).startsWith(list.get(i)))
                    return false;
            }
        }
        return true;
    }
}
