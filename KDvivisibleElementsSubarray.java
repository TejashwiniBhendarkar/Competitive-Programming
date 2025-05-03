import java.util.HashSet;
import java.util.Set;

public class KDvivisibleElementsSubarray {
     public int countDistinct(int[] nums, int k, int p) {
        Set<String> uniqueSubarrays = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            int divisibleCount = 0;
            StringBuilder sb = new StringBuilder();
            
            for (int j = i; j < nums.length; j++) {
                if (nums[j] % p == 0) {
                    divisibleCount++;
                }
                if (divisibleCount > k) break;
                
                
                sb.append(nums[j]).append(",");
                uniqueSubarrays.add(sb.toString());
            }
        }
        
        return uniqueSubarrays.size();
    }
}
