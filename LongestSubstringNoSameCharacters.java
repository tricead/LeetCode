public class Solution {


   public int lengthOfLongestSubstring(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }
  }   
    //     public int lengthOfLongestSubstring(String s) {
//         char[] input = s.toCharArray();
//         int longestLength = 0;
        
//         for(int i = 0; i < input.length; i++) {
//             Set<Character> longestCharacter = new HashSet<Character>();
//             int tempLongestLength = 0;
//             for (int j = i; j < input.length; j++) {
//                 if(!longestCharacter.add(input[j])){
//                     break;
//                 }
//               tempLongestLength++;
//               if(tempLongestLength > longestLength) {
//                   longestLength = tempLongestLength;
//               }
//             }
//         }
//         return longestLength;
//     }
