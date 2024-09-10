import java.util.*;

public class ArrayIntersection {
        public static int[] intersect(int[] nums1, int[] nums2) {
            Map<Integer, Integer> map = new HashMap<>();
            List<Integer> resultList = new ArrayList<>();

            // Count frequency of each element in nums1
            for (int num : nums1) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            // Check common elements in nums2
            for (int num : nums2) {
                if (map.containsKey(num) && map.get(num) > 0) {
                    resultList.add(num);
                    map.put(num, map.get(num) - 1);  // Reduce the count
                }
            }

            // Convert the result to array
            int[] result = new int[resultList.size()];
            for (int i = 0; i < resultList.size(); i++) {
                result[i] = resultList.get(i);
            }

            return result;
        }

        public static void main(String[] args) {
            int[] nums1 = {1, 2, 2, 1};
            int[] nums2 = {2, 2};
            System.out.println("Intersection: " + Arrays.toString(intersect(nums1, nums2)));
        }
    }


