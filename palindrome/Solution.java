class Solution {
    public boolean isPalindrome(int x) {
        //perform the same program without converting x into a string
        //if x is negative, return false
        //how to find center integer and then compare the front and back?
        if (x<0){
            return false;
        }
        int compare =0;
        int tempX=x;
        while (tempX>0){//while x is a double digit number, since single digit would mean is centrally symm
            //10401 - remainder of 10 gives the last digit
            compare = compare*10 + tempX%10;
            tempX/=10;  
        }
        if (x==compare){
            return true;
        }
        return false;
    }
}