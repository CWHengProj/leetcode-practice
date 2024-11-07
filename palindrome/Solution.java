class Solution {
    public boolean isPalindrome(int x) {
        String xString = String.valueOf(x);
        char [] xArr = xString.toCharArray();
        int centerPos = xArr.length/2 + xArr.length%2 -1;
        int j = centerPos; //add one if even number
        if (xArr.length%2 ==0){
            j++;
        }
        for (int i = centerPos; i>=0; i--){
            if (xArr[i]!=xArr[j]){
                return false;
            }
            j++;
        }
        return true;

    }
}