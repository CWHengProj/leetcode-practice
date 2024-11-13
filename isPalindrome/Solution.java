class Solution {
    public boolean isPalindrome(String s) {
        //idea - to clean up the data , split from the center and reverse one of the substrings. Check if they are the same.
        String allChars = "[^a-zA-Z0-9]";
        String cleanedString = s.replaceAll(allChars, "").toLowerCase();
        //find the length of the string
        int left = 0;
        int right = cleanedString.length()-1;
        while (left < right){
            if (cleanedString.charAt(left)!=cleanedString.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}