import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class SnapshotArray {
    private List<TreeMap<Integer, Integer>> snapshots;
    private int snapId;

    public SnapshotArray(int length) {
        snapshots = new ArrayList<>();
        snapId = 0;
        for (int i = 0; i < length; i++) {
            snapshots.add(new TreeMap<>());
        }
    }

    public void set(int index, int val) {
        snapshots.get(index).put(snapId, val);
    }

    public int snap() {
        return snapId++;
    }

    public int get(int index, int snap_id) {
        Map.Entry<Integer, Integer> entry = snapshots.get(index).floorEntry(snap_id);
        if (entry != null) {
            return entry.getValue();
        }
        return 0;
    }
}

