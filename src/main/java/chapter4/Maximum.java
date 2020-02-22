package chapter4;

import java.util.ArrayList;
import java.util.List;

class Maximum {
    public int evaluate(List<Integer> list) {
        if (list.size() == 1) {
            return list.get(0);
        } else {
            List<Integer> copyList = new ArrayList<>(list);
            int max = list.get(0);
            copyList.remove(list.get(0));
            int newMax = evaluate(copyList);
            if (max < newMax) {
                max = newMax;
            }
            return max;
        }
    }
}
