import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        //anagrams contain the same letters with the same size
        //if we are able to sort the characters, we should be able to check if they are identical.
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        return Arrays.equals(sChar,tChar);
    }
}