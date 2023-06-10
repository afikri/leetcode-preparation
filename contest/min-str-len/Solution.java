import java.util.*;

class Solution {
    public int minimizedStringLength(String s) {
        if (s.length() <= 1) {
            return s.length(); // If the string has length 0 or 1, it cannot be further minimized
        }
        
        StringBuilder sb = new StringBuilder(s);
        boolean isReduced = true;
        
        while (isReduced) {
            isReduced = false;
            int i = 0;
            
            while (i < sb.length()) {
                char c = sb.charAt(i);
                int leftIdx = sb.lastIndexOf(String.valueOf(c), i - 1);
                int rightIdx = sb.indexOf(String.valueOf(c), i + 1);
                
                if (leftIdx != -1 && rightIdx != -1) {
                    sb.deleteCharAt(rightIdx);
                    sb.deleteCharAt(leftIdx);
                    isReduced = true;
                    i = Math.max(0, i - 1); // Restart from the previous index since the string length has changed
                } else {
                    i++;
                }
            }
        }
        
        return sb.length();
    }
}


