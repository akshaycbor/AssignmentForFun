package Collections;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayLists {

    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        list1.addAll(list2);
        return list1;
    }

    public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list1.stream().mapToInt(i->i).sum()+list2.stream().mapToInt(i->i).sum();
    }

    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {
        List<Integer> res = original.stream().filter(i-> i!=toRemove).collect(Collectors.toList());
        return new ArrayList<>(res);
    }

    public boolean happyList(ArrayList<String> original) {
        for(int i=1; i<original.size(); i++) {
            if(!haveACommonCharacter(original.get(i), original.get(i-1))) {
                return false;
            }
        }
        return true;
    }
    private boolean haveACommonCharacter(String s1, String s2) {
        HashSet<Character> set = new HashSet<>();
        for(Character c:s1.toCharArray()) {
            set.add(c);
        }
        for(Character c:s2.toCharArray()) {
            if(set.contains(c)) return true;
        }
        return false;
    }
}
