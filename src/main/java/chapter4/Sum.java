package chapter4;

import java.util.ArrayList;
import java.util.List;

class Sum {
    public int evaluate(List<Integer> list) {
        if (list.size() == 0) {
            return 0;
        }

        if (list.size() == 1) {
            return list.get(0);
        } else {
            List<Integer> listCopy = new ArrayList<>(list);
            listCopy.remove(list.get(0));
            return list.get(0) + evaluate(listCopy);
        }
    }
}
