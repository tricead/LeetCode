public class Solution {
    public int lengthOfLastWord(String s) {
        int lastWordLength = 0;
        if(s.equals("")) { return lastWordLength; }
            for(int i = s.length() - 1; i >= 0; i--) {
                if(s.charAt(i) != ' ') {
                    lastWordLength++;
                }
                if(s.charAt(i) == ' ' && lastWordLength > 0) {
                    return lastWordLength;
                } 
            }
        return lastWordLength;
}

}
