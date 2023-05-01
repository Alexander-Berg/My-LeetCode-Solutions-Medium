import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.*;
public class GroupAnagrams {

    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {

            Map<String, ArrayList<String>> map = new HashMap<>();

            for( String s: strs ){

                char[] valArr = s.toCharArray();
                Arrays.sort( valArr );
                String key = new String(valArr);

                ArrayList<String> ll = map.getOrDefault( key,
                        new ArrayList<String>() );
                ll.add(s);
                map.put( key, ll );

            }

            List<List<String>> ans = new ArrayList<>();
            for( Map.Entry<String, ArrayList<String>> entry: map.entrySet() ){
                ans.add( entry.getValue() );
            }

            return ans;
        }
    }
}
