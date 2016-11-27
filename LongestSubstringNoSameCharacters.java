public class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] input = s.toCharArray();
        int longestLength = 0;

        for (int i = 0; i < input.length; i++) {
            Set<Character> longestCharacter = new HashSet<Character>();
            int tempLongestLength = 0;
            for (int j = i; j < input.length; j++) {
                if (!longestCharacter.add(input[j])) {
                    break;
                }
                tempLongestLength++;
                if (tempLongestLength > longestLength) {
                    longestLength = tempLongestLength;
                }
            }
        }
        return longestLength;
    }
}
