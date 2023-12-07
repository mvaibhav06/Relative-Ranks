package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RelativeRanks {
    public static String[] findRelativeRanks(int[] nums){
        List<Integer> input = new ArrayList<>();
        for (int i=0; i< nums.length; i++){
            input.add(nums[i]);
        }
        Arrays.sort(nums);

        String[] out = new String[nums.length];
        int rank = 4;

        for (int j=nums.length-1; j>=0; j--){
            if (j== nums.length-1){
                out[input.indexOf(nums[j])] = "Gold Medal";
                continue;
            } else if (j == nums.length-2) {
                out[input.indexOf(nums[j])] = "Silver Medal";
                continue;
            }else if (j == nums.length-3) {
                out[input.indexOf(nums[j])] = "Bronze Medal";
                continue;
            }else {
                out[input.indexOf(nums[j])] = "" + rank;
                rank++;
                continue;
            }
        }
        return out;
    }

    public static void main(String[] args) {
        int[] nums = {10,3,8,9,4};

        String[] out = findRelativeRanks(nums);
        System.out.println(Arrays.toString(out));
    }
}
