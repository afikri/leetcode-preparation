public class Main {
    public static void main(String[] args) {
        SnapshotArray snapshotArr = new SnapshotArray(3);
        snapshotArr.set(0, 5);
        int snapId1 = snapshotArr.snap();
        snapshotArr.set(0, 6);
        int snapId2 = snapshotArr.snap();
        int value = snapshotArr.get(0, snapId1);
        
        System.out.println(value);  // Output: 5
        
        value = snapshotArr.get(0, snapId2);
        System.out.println(value);  // Output: 6
    }
}
