public class FindDuplicateNumber {
    public static class Solution {
        public int findDuplicate(int[] nums) {
             //HashMap<Integer,Integer>map=new LinkedHashMap<>();
             //for(int i=0;i<nums.length;i++){
             //   if(map.containsKey(nums[i])){
              //       map.put(nums[i],map.get(nums[i])+1);
              //   }
            //     else{
            //         map.put(nums[i],1);
             //    }
            // }
            // int k=0;
            // for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            //     if(entry.getValue()>=2){
            //          k=entry.getKey();
            //     }
            // }
            // return k;

            int freq[]=new int[nums.length+1];
            for(int i=0;i<nums.length;i++){
                if (freq[nums[i]] == 0) {
                    freq[nums[i]] += 1;
                } else {
                    return nums[i];
                }
            }
            return 0;
        }
    }
}
