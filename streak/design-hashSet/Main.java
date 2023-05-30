public class Main {
  public static void main(String[] args) {
      MyHashSet myHashSet = new MyHashSet();
      myHashSet.add(1);
      myHashSet.add(2);
      System.out.println(myHashSet.contains(1)); // Output: true
      System.out.println(myHashSet.contains(3)); // Output: false
      myHashSet.add(2);
      System.out.println(myHashSet.contains(2)); // Output: true
      myHashSet.remove(2);
      System.out.println(myHashSet.contains(2)); // Output: false
  }
}
