import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public boolean isAnagram(String s, String t) {
        //check if strings s and t are anagrams.
        //anagrams means that they contain the same amount of characters with the same values
        if (s.length()!=t.length()){
            return false;
        }
        List<String> tList = new ArrayList<>(Arrays.asList(t.toLowerCase().split("")));
        //assign t to an ArrayList, remove whenever there is a match
        for (String sArray: s.toLowerCase().split("")){
            if (!tList.remove(sArray)){
                return false;
            }
        }
        return true;
    }
}