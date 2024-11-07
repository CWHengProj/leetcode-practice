class Solution {
    public int strStr(String haystack, String needle) {
        //find index of the first occurence of Needle in Haystack.
        //MUST be in consecutive order
        
        //idea - go through the int array for complete matches
        if (haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;
    }
}