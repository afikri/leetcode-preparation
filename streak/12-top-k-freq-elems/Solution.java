import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Count the frequency of each number
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Create a priority queue to store the top k frequent elements
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(frequencyMap::get));
        
        // Iterate over the frequency map and add elements to the priority queue
        for (int num : frequencyMap.keySet()) {
            pq.offer(num);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        
        // Create the result array
        int[] result = new int[k];
        int index = 0;
        
        // Add elements from the priority queue to the result array
        while (!pq.isEmpty()) {
            result[index++] = pq.poll();
        }
        
        // Return the result array
        return result;
    }
}


