class Solution {
    public boolean isPalindrome(String s) {
        //idea - to clean up the data , split from the center and reverse one of the substrings. Check if they are the same.
        String allChars = "[^a-zA-Z]";
        String cleanedString = s.replace(allChars, "");
        //find the length of the string
        int strLength = cleanedString.length();
        int halfLength = strLength/2 -1;
        //invert the substring of the back half, and compare to the front half
        char[] frontHalf = cleanedString.substring(0,halfLength).toCharArray();
        char[] backHalf = cleanedString.substring((strLength/2+strLength%2),(strLength-1)).toCharArray();
        int j =0;
        for (int i=halfLength; i>0; i++){
            if (backHalf[i]!=frontHalf[j]){
                return false;
            }
            j++;
        }
        return true;
    }
}