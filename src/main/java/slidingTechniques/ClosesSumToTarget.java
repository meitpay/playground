package slidingTechniques;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ClosesSumToTarget {
    static int[] nums = {-1, 2, 1, 4};
    static List<Integer> list = List.of(-1, 2, 1, 4);
    static int target = 5;
    static int num = 3;

    public static void main(String[] args) {
        /**
         * Find the 3 integers that's closes to the target when summed up.
         * nums = [-1, 2, 1, 4]
         * target = 1
         * output = 2
         * The sum that's closes to 1 is 2 (-1 + 2 + 1 = 2)
         */
        List<Integer> sorted =
                list.stream()
                        .sorted(Comparator.naturalOrder())
                        .collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < sorted.size() && diff != 0; i++) {
            int lowest = i + 1;
            int highest = sorted.size() - 1;

            while (lowest < highest) {
                int sum = sorted.get(i) + sorted.get(lowest) + sorted.get(highest);
                result = new ArrayList<>();
                result.add(sorted.get(i));
                result.add(sorted.get(lowest));
                result.add(sorted.get(highest));

                if (Math.abs((target - sum)) < Math.abs(diff)) {
                    diff = target - sum;
                }
                if (sum < target) {
                    lowest++;
                } else {
                    highest--;
                }
            }
        }
        System.out.println("Target = " + target + " diff = " + diff + " values used = ");
        result.forEach(System.out::println);
//        threeSumClosest(nums, target);
    }

    public static int threeSumClosest(int[] nums, int target) {
        int diff = Integer.MAX_VALUE, sz = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < sz && diff != 0; ++i) {
            int lo = i + 1, hi = sz - 1;
            while (lo < hi) {
                int sum = nums[i] + nums[lo] + nums[hi];
                if (Math.abs(target - sum) < Math.abs(diff))
                    diff = target - sum;
                if (sum < target)
                    ++lo;
                else
                    --hi;
            }
        }
        System.out.println(target - diff);
        return target - diff;
    }
}
