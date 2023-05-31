public class Main {
  public static void main(String[] args) {
      UndergroundSystem undergroundSystem = new UndergroundSystem();
      undergroundSystem.checkIn(45, "Leyton", 3);
      undergroundSystem.checkIn(32, "Paradise", 8);
      undergroundSystem.checkIn(27, "Leyton", 10);
      undergroundSystem.checkOut(45, "Waterloo", 15);
      undergroundSystem.checkOut(27, "Waterloo", 20);
      undergroundSystem.checkOut(32, "Cambridge", 22);
      System.out.println(undergroundSystem.getAverageTime("Paradise", "Cambridge")); // 14.0
      System.out.println(undergroundSystem.getAverageTime("Leyton", "Waterloo"));    // 11.0
      undergroundSystem.checkIn(10, "Leyton", 24);
      System.out.println(undergroundSystem.getAverageTime("Leyton", "Waterloo"));    // 11.0
      undergroundSystem.checkOut(10, "Waterloo", 38);
      System.out.println(undergroundSystem.getAverageTime("Leyton", "Waterloo"));    // 12.0

      UndergroundSystem undergroundSystem2 = new UndergroundSystem();
      undergroundSystem2.checkIn(10, "Leyton", 3);
      undergroundSystem2.checkOut(10, "Paradise", 8);
      System.out.println(undergroundSystem2.getAverageTime("Leyton", "Paradise"));    // 5.0
      undergroundSystem2.checkIn(5, "Leyton", 10);
      undergroundSystem2.checkOut(5, "Paradise", 16);
      System.out.println(undergroundSystem2.getAverageTime("Leyton", "Paradise"));    // 5.5
      undergroundSystem2.checkIn(2, "Leyton", 21);
      undergroundSystem2.checkOut(2, "Paradise", 30);
      System.out.println(undergroundSystem2.getAverageTime("Leyton", "Paradise"));    // 6.66667
  }
}
