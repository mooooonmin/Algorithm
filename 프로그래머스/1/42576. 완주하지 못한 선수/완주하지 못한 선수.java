import java.util.*;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant); // O(n log n)
        Arrays.sort(completion);  // O(n log n)

        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }

        return participant[participant.length - 1];
    }
}