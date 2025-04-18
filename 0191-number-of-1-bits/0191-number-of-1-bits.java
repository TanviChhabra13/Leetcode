class Solution {
    public static int hammingWeight(int n) {
	int ones = 0;
    	while(n!=0) {
    		int rem=n%2;
            if(rem==1){
                ones++;
            }
            n=n/2;
    	}
    	return ones;
}
}