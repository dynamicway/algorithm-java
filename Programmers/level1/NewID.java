package Programmers.level1;

import java.util.LinkedList;

public class NewID {
    public String solution(String newId) {
        LinkedList<Character> list = getList(newId.toLowerCase().toCharArray());
        distinctDot(list);
        if (list.isEmpty())
            list.add('a');
        if (list.size() > 15) {
            while (list.size() != 15) {
                list.removeLast();
            }
            if (list.getLast() == '.')
                list.removeLast();
        }
        if (list.size() < 3) {
            char c = list.getLast();
            while (list.size() != 3) {
                list.add(c);
            }
        }
        StringBuffer sb = new StringBuffer();
        list.stream().parallel().forEachOrdered(sb::append);
        return sb.toString();
    }

    public LinkedList<Character> getList(char[] arr) {
        LinkedList<Character> list = new LinkedList<>();
        for (char c : arr) {
            if (isCheck(c))
                list.add(c);
        }
        return list;
    }

    public boolean isCheck(char ch) {
        return ('a' <= ch && 'z' >= ch) || ('0' <= ch && '9' >= ch) || '-' == ch || '_' == ch || '.' == ch;
    }

    public void distinctDot(LinkedList<Character> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) == '.' && (list.get(i) == list.get(i + 1))) {
                list.remove(i);
                i--;
            }
        }
        if (list.getFirst() == '.')
            list.removeFirst();
        if (list.isEmpty())
            return;
        if (list.getLast() == '.')
            list.removeLast();
    }


    public static void main(String[] args) {
        String str = new NewID().solution("...!@BaT#*..y.abcdefghijklm");
        System.out.println(str);
    }

}
