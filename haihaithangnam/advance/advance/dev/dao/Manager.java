package advance.dev.dao;

import advance.dev.model.CanBo;
import advance.dev.model.IManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Manager implements IManager {
    private List<CanBo> canBoList = new ArrayList<>();

    @Override
    public void add(CanBo cb) {
        canBoList.add(cb);
    }

    @Override
    public void print() {
        for (CanBo cb : canBoList) {
            System.out.println(cb);
        }
    }

    @Override
    public void sortByName(int order) {
        Comparator<CanBo> comparator = new Comparator<CanBo>() {
            @Override
            public int compare(CanBo cb1, CanBo cb2) {
                return cb1.getTen().compareTo(cb2.getTen());
            }
        };

        if (order == -1) {
            comparator = Collections.reverseOrder(comparator);
        }

        Collections.sort(canBoList, comparator);
    }
}
