package frogger;

import java.util.ArrayList;
import java.util.List;

public class Records {

    private final List<FroggerIdentity> recordList = new ArrayList<>();

    public boolean addRecord(FroggerIdentity identity) {
        if (identity == null) {
            return false;
        }
        recordList.add(identity);
        return true;
    }

    public List<FroggerIdentity> getRecords() {
        return new ArrayList<>(recordList);
    }
}