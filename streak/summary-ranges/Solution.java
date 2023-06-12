import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();

        if (nums.length == 0)
            return ranges;

        int start = nums[0];
        int end = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == end + 1) {
                end = nums[i];
            } else {
                ranges.add(formatRange(start, end));
                start = nums[i];
                end = nums[i];
            }
        }

        ranges.add(formatRange(start, end));

        return ranges;
    }

    private String formatRange(int start, int end) {
        if (start == end)
            return Integer.toString(start);
        else
            return start + "->" + end;
    }
}

