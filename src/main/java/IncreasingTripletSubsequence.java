public class IncreasingTripletSubsequence {

    class Solution {
        public boolean increasingTriplet(int[] arr) {
            int a = Integer.MAX_VALUE, b = Integer.MAX_VALUE;
            for(int val : arr){
                if(val <= a)    a = val;
                else if(val < b)    b = val;
                else if(val > b)    return true;
            }
            return false;
        }
    }
}
