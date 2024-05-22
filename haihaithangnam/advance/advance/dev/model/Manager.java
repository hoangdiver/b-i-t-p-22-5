package advance.dev.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Manager implements IManager {
    private List<CanBo> canBoList;

    public Manager() {
        this.canBoList = new ArrayList<>();
    }

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
        if (order == 1) {
            Collections.sort(canBoList, new Comparator<CanBo>() {
                @Override
                public int compare(CanBo cb1, CanBo cb2) {
                    return cb1.getTen().compareTo(cb2.getTen());
                }
            });
        } else if (order == -1) {
            Collections.sort(canBoList, new Comparator<CanBo>() {
                @Override
                public int compare(CanBo cb1, CanBo cb2) {
                    return cb2.getTen().compareTo(cb1.getTen());
                }
            });
        }
    }
}
