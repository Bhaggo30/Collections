import java.util.*;

public class TopKFrequncyElement {
        public static List<Integer> topKFrequent(int[] nums, int k) {
            Map<Integer, Integer> frequencyMap = new HashMap<>();

            // Count the frequency of each element
            for (int num : nums) {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }

            // Use a priority queue to keep the top k frequent elements
            PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
                    (a, b) -> a.getValue() - b.getValue()
            );

            for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
                pq.offer(entry);
                if (pq.size() > k) {
                    pq.poll();
                }
            }

            // Extract the top k elements
            List<Integer> result = new ArrayList<>();
            while (!pq.isEmpty()) {
                result.add(pq.poll().getKey());
            }

            return result;
        }

        public static void main(String[] args) {
            int[] nums = {1, 1, 1, 2, 2, 3};
            int k = 2;
            System.out.println("Top " + k + " frequent elements: " + topKFrequent(nums, k));
        }
    }

