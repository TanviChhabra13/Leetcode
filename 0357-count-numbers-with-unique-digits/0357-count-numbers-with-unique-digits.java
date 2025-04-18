class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0)
        {
            return 1;
        }
        if(n==1)
        {
            return 10;
        }
        int res=10;
        int a=9, b=9;
        for(int i=1; i<=n-1; i++){
            a=a*b;
            res= res+a;
            b--;
        }
        return res;
    }
}