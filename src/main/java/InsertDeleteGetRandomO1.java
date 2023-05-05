import java.util.ArrayList;
import java.util.HashSet;

public class InsertDeleteGetRandomO1 {
    public static class RandomizedSet {
        HashSet<Integer> hs;
        public RandomizedSet() {
            hs=new HashSet<>();
        }
        public boolean insert(int val) {
            if(hs.contains(val)){ return false; }
            hs.add(val);
            return true;
        }
        public boolean remove(int val) {
            if(hs.contains(val)){ hs.remove(val); return true; }
            return false;
        }
        public int getRandom() {
            ArrayList<Integer> arr=new ArrayList<>(hs);
            int index=(int)(Math.random()*(hs.size()));
            return arr.get(index);
        }
    }
}
