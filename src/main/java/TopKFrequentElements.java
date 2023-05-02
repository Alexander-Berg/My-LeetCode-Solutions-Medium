import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TopKFrequentElements {
    class Solution {
        public int[] topKFrequent(int[] nums, int k) {
            Map<Integer,Integer> map= new TreeMap<Integer,Integer>();
            ArrayList<Integer> list= new ArrayList<Integer>();
            int a[]=new int[k];
            int z=0;
            for(int i=0;i<nums.length;i++)
            {
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }

            for(Map.Entry<Integer,Integer> i:map.entrySet())
            {
                list.add(i.getValue());
            }
            Collections.sort(list,Collections.reverseOrder());
            for(int j:list)
            {
                for(Map.Entry<Integer,Integer> i:map.entrySet())
                {
                    if(z==k)
                        return a;
                    if(j==i.getValue())
                    {
                        a[z++]=i.getKey();
                        map.remove(i.getKey());
                        break;
                    }
                }
            }
            System.out.println(list);
            return a;


        }
    }
}
