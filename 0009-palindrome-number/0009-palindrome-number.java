class Solution {
    public boolean isPalindrome(int x) {
        int num=x;
        if (x < 0){
            return false;
        }
        int rev = 0;
        while (x > 0) {
            int last=x%10;
            rev = rev * 10 + last;
            x /= 10;
        }
        if(num==rev) return true;
        else{
            return false;
        }
    }
}