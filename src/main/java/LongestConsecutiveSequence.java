import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static class Solution {
        public int longestConsecutive(int[] nums) {
            if(nums.length==0) return 0;
            int length=1;
            int maxLength=1;

            HashSet<Integer> set = new HashSet<>();

            for (int i=0; i<nums.length; i++){
                set.add(nums[i]);
            }

            for (int i=0; i<nums.length; i++){
                if(set.remove(nums[i])){
                    length=1;
                    int left=nums[i]-1;
                    int right=nums[i]+1;

                    while (set.remove(left)){
                        length++;
                        left-=1;
                    }
                    while (set.remove(right)){
                        length++;
                        right+=1;
                    }
                    maxLength=Math.max(maxLength,length);
                }
            }
            return maxLength;
        }
    }
}
