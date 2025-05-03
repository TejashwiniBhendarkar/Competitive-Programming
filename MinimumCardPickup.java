import java.util.HashMap;
import java.util.Map;

public class MinimumCardPickup {
    public int minimumCardPickup(int[] cards) {
        Map<Integer, Integer> lastSeen = new HashMap<>();
        int minLen = Integer.MAX_VALUE;

        for (int i = 0; i < cards.length; i++) {
            if (lastSeen.containsKey(cards[i])) {
                int prevIndex = lastSeen.get(cards[i]);
                minLen = Math.min(minLen, i - prevIndex + 1);
            }
            lastSeen.put(cards[i], i);
        }

        return minLen == Integer.MAX_VALUE ? -1 : minLen;
    }
}
