package Collections;

import java.util.*;

public class MapPractice {

    public Object findValueOf(Map map, Object key) {
        return map.get(key);
    }

    public Object[] findKeysOf(Map map, Object value) {
        Set<Map.Entry> set = map.entrySet();
        List<Object> keys = new ArrayList<Object>();
        for(Map.Entry i: set) {
            if(value.equals(i.getValue())) {
                keys.add(i.getKey());
            }
        }
        return keys.toArray();
    }

    public Map<Integer, Integer> fibonacciTree(int size) {
        return crazySpiral(1,1,size);
    }

    public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {
        Map<Integer, Integer> res = new HashMap<Integer, Integer>();
        if(size<=0) return res;
        res.put(1,first);
        if(size==1) return res;
        res.put(2,second);
        if(size==2) return res;

        int a=first, b=second;
        for(int i=3; i<=size; i++) {
            res.put(i, a+b);
            b=a+b;
            a=b-a;
        }
        return res;
    }
}
