import java.util.ArrayList;
import java.util.List;

public class PhoneLettersCombinations {
    class Solution {
        public List<String> letterCombinations(String digits) {
            var n = digits.length();
            if (n == 0) return new ArrayList<>();

            var map = new ArrayList<String>(List.of("abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"));
            var dpPrev = new ArrayList<String>(List.of(""));

            for (var i = n-1; i >= 0; i--) {
                var dp = new ArrayList<String>();

                for (var x : map.get(digits.charAt(i) - '2').toCharArray())
                    for (var y : dpPrev)
                        dp.add(x + y);

                dpPrev = dp;
            }
            return dpPrev;
        }
    }
}
