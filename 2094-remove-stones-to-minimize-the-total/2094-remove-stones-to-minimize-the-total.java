class Solution {
    public int minStoneSum(int[] piles, int k) {
        int n= piles.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for(int i=0; i<n; i++){
            pq.add(piles[i]);
        }
        while(k>0){
            int maxE= pq.poll();
            maxE= maxE- (int)Math.floor(maxE/2);
            pq.add(maxE);
            k--;
        }
        int sum=0;
        while(!pq.isEmpty()){
            sum=sum+pq.poll();
        }
        return sum;
    }
}