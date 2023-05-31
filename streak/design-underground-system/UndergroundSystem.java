import java.util.HashMap;
import java.util.Map;

class UndergroundSystem {
    private Map<Integer, CheckInInfo> checkIns;
    private Map<String, StationStats> stationStats;

    public UndergroundSystem() {
        checkIns = new HashMap<>();
        stationStats = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        checkIns.put(id, new CheckInInfo(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        CheckInInfo checkInInfo = checkIns.get(id);
        String startStation = checkInInfo.getStationName();
        int startTime = checkInInfo.getTime();
        String route = startStation + "-" + stationName;
        
        stationStats.putIfAbsent(route, new StationStats());
        StationStats stats = stationStats.get(route);
        stats.addTrip(t - startTime);
        
        checkIns.remove(id);
    }

    public double getAverageTime(String startStation, String endStation) {
        String route = startStation + "-" + endStation;
        StationStats stats = stationStats.get(route);
        return stats.getAverageTime();
    }

    private static class CheckInInfo {
        private String stationName;
        private int time;

        public CheckInInfo(String stationName, int time) {
            this.stationName = stationName;
            this.time = time;
        }

        public String getStationName() {
            return stationName;
        }

        public int getTime() {
            return time;
        }
    }

    private static class StationStats {
        private int totalTravelTime;
        private int tripsCount;

        public StationStats() {
            totalTravelTime = 0;
            tripsCount = 0;
        }

        public void addTrip(int travelTime) {
            totalTravelTime += travelTime;
            tripsCount++;
        }

        public double getAverageTime() {
            return (double) totalTravelTime / tripsCount;
        }
    }
}

