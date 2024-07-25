//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
package kunal.assignments.arrays;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        for(int i : candies) {
            max = Math.max(i, max);
        }
        for(int i : candies) {
            result.add(i+extraCandies >= max);
        }
        return result;
    }
}
