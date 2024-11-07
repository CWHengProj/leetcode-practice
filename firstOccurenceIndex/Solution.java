class Solution {
    public int strStr(String haystack, String needle) {
        //find index of the first occurence of Needle in Haystack.
        //MUST be in consecutive order
        
        //idea - go through the int array for complete matches
        int nLength = needle.length();
        int hLength = haystack.length();
        //badsad - sad 6-3 =3

        for (int i=0; i<=hLength-nLength; i++){
            if (haystack.substring(i,(i+nLength)).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}