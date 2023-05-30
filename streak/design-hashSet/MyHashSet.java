import java.util.ArrayList;
import java.util.List;

class MyHashSet {
    private List<List<Integer>> buckets;
    private int numBuckets;

    public MyHashSet() {
        numBuckets = 1000;
        buckets = new ArrayList<>(numBuckets);
        for (int i = 0; i < numBuckets; i++) {
            buckets.add(null);
        }
    }

    private int hashFunction(int key) {
        return key % numBuckets;
    }

    public void add(int key) {
        int bucketIndex = hashFunction(key);
        List<Integer> bucket = buckets.get(bucketIndex);
        if (bucket == null) {
            bucket = new ArrayList<>();
            buckets.set(bucketIndex, bucket);
        }
        if (!bucket.contains(key)) {
            bucket.add(key);
        }
    }

    public void remove(int key) {
        int bucketIndex = hashFunction(key);
        List<Integer> bucket = buckets.get(bucketIndex);
        if (bucket != null) {
            bucket.remove(Integer.valueOf(key));
        }
    }

    public boolean contains(int key) {
        int bucketIndex = hashFunction(key);
        List<Integer> bucket = buckets.get(bucketIndex);
        return bucket != null && bucket.contains(key);
    }
}
